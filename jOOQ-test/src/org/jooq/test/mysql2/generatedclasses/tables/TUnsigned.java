/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class TUnsigned extends org.jooq.impl.TableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.TUnsignedRecord> {

	private static final long serialVersionUID = -1677595345;

	/**
	 * The singleton instance of t_unsigned
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.TUnsigned T_UNSIGNED = new org.jooq.test.mysql2.generatedclasses.tables.TUnsigned();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.TUnsignedRecord> __RECORD_TYPE = org.jooq.test.mysql2.generatedclasses.tables.records.TUnsignedRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.TUnsignedRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TUnsignedRecord, org.joou.UByte> U_BYTE = createField("u_byte", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TUnsignedRecord, org.joou.UShort> U_SHORT = createField("u_short", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TUnsignedRecord, org.joou.UInteger> U_INT = createField("u_int", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TUnsignedRecord, org.joou.ULong> U_LONG = createField("u_long", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this);

	/**
	 * No further instances allowed
	 */
	private TUnsigned() {
		super("t_unsigned", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);
	}

	/**
	 * No further instances allowed
	 */
	private TUnsigned(java.lang.String alias) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, org.jooq.test.mysql2.generatedclasses.tables.TUnsigned.T_UNSIGNED);
	}

	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.TUnsigned as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.TUnsigned(alias);
	}
}
