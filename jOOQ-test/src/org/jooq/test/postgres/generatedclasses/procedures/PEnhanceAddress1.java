/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.procedures;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://www.jooq.org",
                            comments = "This class is generated by jOOQ")
public class PEnhanceAddress1 extends org.jooq.impl.StoredProcedureImpl {

	private static final long serialVersionUID = 1120368687;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord> ADDRESS = new org.jooq.impl.ParameterImpl<org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord>("address", org.jooq.test.postgres.generatedclasses.udt.UAddressType.U_ADDRESS_TYPE.getDataType());

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> NO = new org.jooq.impl.ParameterImpl<java.lang.String>("no", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * Create a new procedure call instance
	 */
	public PEnhanceAddress1() {
		super(org.jooq.SQLDialect.POSTGRES, "p_enhance_address1", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);

		addInParameter(ADDRESS);
		addOutParameter(NO);
	}

	public void setAddress(org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord value) {
		setValue(ADDRESS, value);
	}

	public java.lang.String getNo() {
		return getValue(NO);
	}
}
