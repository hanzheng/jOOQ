/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://www.jooq.org",
                            comments = "This class is generated by jOOQ")
public class TTriggers extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.db2.generatedclasses.tables.records.TTriggersRecord> {

	private static final long serialVersionUID = 1915631886;

	/**
	 * The singleton instance of T_TRIGGERS
	 */
	public static final org.jooq.test.db2.generatedclasses.tables.TTriggers T_TRIGGERS = new org.jooq.test.db2.generatedclasses.tables.TTriggers();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.db2.generatedclasses.tables.records.TTriggersRecord> __RECORD_TYPE = org.jooq.test.db2.generatedclasses.tables.records.TTriggersRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.db2.generatedclasses.tables.records.TTriggersRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> ID_GENERATED = new org.jooq.impl.TableFieldImpl<org.jooq.test.db2.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer>("ID_GENERATED", org.jooq.impl.SQLDataType.INTEGER, T_TRIGGERS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.db2.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer>("ID", org.jooq.impl.SQLDataType.INTEGER, T_TRIGGERS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> COUNTER = new org.jooq.impl.TableFieldImpl<org.jooq.test.db2.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer>("COUNTER", org.jooq.impl.SQLDataType.INTEGER, T_TRIGGERS);

	/**
	 * No further instances allowed
	 */
	private TTriggers() {
		super("T_TRIGGERS", org.jooq.test.db2.generatedclasses.Lukas.LUKAS);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.TTriggersRecord> getMainKey() {
		return org.jooq.test.db2.generatedclasses.Keys.PK_T_TRIGGERS;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.TTriggersRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.TTriggersRecord>>asList(org.jooq.test.db2.generatedclasses.Keys.PK_T_TRIGGERS);
	}
}
