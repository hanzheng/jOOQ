/**
 * Copyright (c) 2009-2011, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.jooq.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jooq.BatchBindStep;
import org.jooq.Query;
import org.jooq.tools.JooqLogger;
import org.jooq.tools.StopWatch;

/**
 * @author Lukas Eder
 */
class BatchSingle implements BatchBindStep {

    /**
     * Generated UID
     */
    private static final JooqLogger log              = JooqLogger.getLogger(BatchSingle.class);

    private final Factory           create;
    private final Query             query;
    private final List<Object[]>    allBindValues;

    public BatchSingle(Factory create, Query query) {
        this.create = create;
        this.query = query;
        this.allBindValues = new ArrayList<Object[]>();
    }

    @Override
    public final BatchSingle bind(Object... bindValues) {
        allBindValues.add(bindValues);
        return this;
    }

    @Override
    public final int[] execute() {
        StopWatch watch = new StopWatch();
        Connection connection = create.getConnection();
        PreparedStatement statement = null;
        String sql = null;

        try {

            sql = create.render(query);
            watch.splitTrace("SQL rendered");

            if (log.isDebugEnabled())
                log.debug("Executing query", create.renderInlined(query));
            if (log.isTraceEnabled())
                log.trace("Preparing statement", sql);

            statement = connection.prepareStatement(sql);
            watch.splitTrace("Statement prepared");

            for (Object[] bindValues : allBindValues) {
                new DefaultBindContext(create, statement).bindValues(bindValues);
                statement.addBatch();
            }

            watch.splitTrace("Variables bound");
            int[] result = statement.executeBatch();
            watch.splitTrace("Statement executed");

            return result;
        }
        catch (SQLException e) {
            throw Util.translate("BatchSingle.execute", sql, e);
        }
        finally {
            Util.safeClose(statement);
            watch.splitDebug("Statement executed");
        }
    }
}
