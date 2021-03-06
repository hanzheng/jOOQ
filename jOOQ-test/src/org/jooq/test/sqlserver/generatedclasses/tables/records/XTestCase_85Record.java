/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class XTestCase_85Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_85Record> {

	private static final long serialVersionUID = -459694054;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dbo.x_test_case_85.x_unused_id, dbo.x_test_case_85.x_unused_name]
	 * REFERENCES x_unused [dbo.x_unused.id, dbo.x_unused.name]
	 * </pre></code>
	 */
	public void setXUnusedId(java.lang.Integer value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dbo.x_test_case_85.x_unused_id, dbo.x_test_case_85.x_unused_name]
	 * REFERENCES x_unused [dbo.x_unused.id, dbo.x_unused.name]
	 * </pre></code>
	 */
	public java.lang.Integer getXUnusedId() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dbo.x_test_case_85.x_unused_id, dbo.x_test_case_85.x_unused_name]
	 * REFERENCES x_unused [dbo.x_unused.id, dbo.x_unused.name]
	 * </pre></code>
	 */
	public org.jooq.test.sqlserver.generatedclasses.tables.records.XUnusedRecord fetchXUnused() {
		return create()
			.selectFrom(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.X_UNUSED.ID.equal(getValue(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_ID)))
			.and(org.jooq.test.sqlserver.generatedclasses.tables.XUnused.X_UNUSED.NAME.equal(getValue(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_NAME)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dbo.x_test_case_85.x_unused_id, dbo.x_test_case_85.x_unused_name]
	 * REFERENCES x_unused [dbo.x_unused.id, dbo.x_unused.name]
	 * </pre></code>
	 */
	public void setXUnusedName(java.lang.String value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_NAME, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dbo.x_test_case_85.x_unused_id, dbo.x_test_case_85.x_unused_name]
	 * REFERENCES x_unused [dbo.x_unused.id, dbo.x_unused.name]
	 * </pre></code>
	 */
	public java.lang.String getXUnusedName() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_NAME);
	}

	/**
	 * Create a detached XTestCase_85Record
	 */
	public XTestCase_85Record() {
		super(org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85);
	}
}
