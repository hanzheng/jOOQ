/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.udt;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class OInvalidType extends org.jooq.impl.UDTImpl<org.jooq.test.oracle.generatedclasses.udt.records.OInvalidTypeRecord> {

	private static final long serialVersionUID = -1797149195;

	/**
	 * The singleton instance of O_INVALID_TYPE
	 */
	public static final org.jooq.test.oracle.generatedclasses.udt.OInvalidType O_INVALID_TYPE = new org.jooq.test.oracle.generatedclasses.udt.OInvalidType();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.oracle.generatedclasses.udt.records.OInvalidTypeRecord> __RECORD_TYPE = org.jooq.test.oracle.generatedclasses.udt.records.OInvalidTypeRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.udt.records.OInvalidTypeRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * No further instances allowed
	 */
	private OInvalidType() {
		super("O_INVALID_TYPE", org.jooq.test.oracle.generatedclasses.Test.TEST);
	}
}
