/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://www.jooq.org",
                            comments = "This class is generated by jOOQ")
public class XTestCase_64_69Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record> {

	private static final long serialVersionUID = 446892278;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_71Record> fetchXTestCase_71List() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71)
			.where(org.jooq.test.postgres.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID.equal(getValueAsShort(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [public.x_test_case_64_69.unused_id]
	 * REFERENCES x_unused [public.x_unused.id]
	 * </pre></code>
	 */
	public void setUnusedId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.UNUSED_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [public.x_test_case_64_69.unused_id]
	 * REFERENCES x_unused [public.x_unused.id]
	 * </pre></code>
	 */
	public java.lang.Integer getUnusedId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.UNUSED_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [public.x_test_case_64_69.unused_id]
	 * REFERENCES x_unused [public.x_unused.id]
	 * </pre></code>
	 */
	public org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord fetchXUnused() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.postgres.generatedclasses.tables.XUnused.ID.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.UNUSED_ID)))
			.fetchOne();
	}

	/**
	 * Create a detached XTestCase_64_69Record
	 */
	public XTestCase_64_69Record() {
		super(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69);
	}
}
