/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.udt.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class UStringArrayRecord extends org.jooq.impl.ArrayRecordImpl<java.lang.String> {

	private static final long serialVersionUID = 1754030384;

	public UStringArrayRecord(org.jooq.Configuration configuration) {
		super("TEST.U_STRING_ARRAY", org.jooq.impl.SQLDataType.VARCHAR, configuration);
	}

	public UStringArrayRecord(org.jooq.Configuration configuration, java.lang.String... array) {
		this(configuration);
		set(array);
	}

	public UStringArrayRecord(org.jooq.Configuration configuration, java.util.List<? extends java.lang.String> list) {
		this(configuration);
		setList(list);
	}
}
