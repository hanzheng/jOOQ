/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class TBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.derby.generatedclasses.tables.records.TBookStoreRecord> {

	private static final long serialVersionUID = -1743622798;

	/**
	 * An uncommented item
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.TBookStore.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.TBookStore.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.TBookStore.NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getName() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.TBookStore.NAME);
	}

	/**
	 * An uncommented item
	 */
	public java.util.List<org.jooq.test.derby.generatedclasses.tables.records.TBookToBookStoreRecord> fetchTBookToBookStoreList() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.derby.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE)
			.where(org.jooq.test.derby.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME.equal(getValue(org.jooq.test.derby.generatedclasses.tables.TBookStore.NAME)))
			.fetch();
	}

	/**
	 * Create a detached TBookStoreRecord
	 */
	public TBookStoreRecord() {
		super(org.jooq.test.derby.generatedclasses.tables.TBookStore.T_BOOK_STORE);
	}

	/**
	 * Create an attached TBookStoreRecord
	 * @deprecated - 1.6.4 [#363, #789] - use the other constructor instead for unattached
	 * records, or {@link org.jooq.impl.Factory#newRecord(org.jooq.Table)} for attached ones
	 */
	@Deprecated
	public TBookStoreRecord(org.jooq.Configuration configuration) {
		super(org.jooq.test.derby.generatedclasses.tables.TBookStore.T_BOOK_STORE, configuration);
	}
}
