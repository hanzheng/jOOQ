/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.udt.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://www.jooq.org",
                            comments = "This class is generated by jOOQ")
public class UAddressTypeRecord extends org.jooq.impl.UDTRecordImpl<org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord> {

	private static final long serialVersionUID = -1086143922;


	/**
	 * An uncommented item
	 */
	public void setStreet(org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord value) {
		setValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.STREET, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord getStreet() {
		return getValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.STREET);
	}

	/**
	 * An uncommented item
	 */
	public void setZip(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.ZIP, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getZip() {
		return getValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.ZIP);
	}

	/**
	 * An uncommented item
	 */
	public void setCity(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.CITY, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getCity() {
		return getValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.CITY);
	}

	/**
	 * An uncommented item
	 */
	public void setCountry(org.jooq.test.postgres.generatedclasses.enums.UCountry value) {
		setValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.COUNTRY, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test.postgres.generatedclasses.enums.UCountry getCountry() {
		return getValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.COUNTRY);
	}

	/**
	 * An uncommented item
	 */
	public void setSince(java.sql.Date value) {
		setValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.SINCE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Date getSince() {
		return getValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.SINCE);
	}

	/**
	 * An uncommented item
	 */
	public void setCode(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.CODE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getCode() {
		return getValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.CODE);
	}

	public UAddressTypeRecord() {
		super(org.jooq.test.postgres.generatedclasses.udt.UAddressType.U_ADDRESS_TYPE);
	}
}
