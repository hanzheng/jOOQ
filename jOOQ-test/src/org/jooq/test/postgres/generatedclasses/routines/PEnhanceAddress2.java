/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class PEnhanceAddress2 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1976026202;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord> ADDRESS = createParameter("address", org.jooq.test.postgres.generatedclasses.udt.UAddressType.U_ADDRESS_TYPE.getDataType());

	/**
	 * Create a new routine call instance
	 */
	public PEnhanceAddress2() {
		super(org.jooq.SQLDialect.POSTGRES, "p_enhance_address2", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);

		addOutParameter(ADDRESS);
	}

	public org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord getAddress() {
		return getValue(ADDRESS);
	}
}
