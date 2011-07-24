/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class LanguageRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.LanguageRecord> {

	private static final long serialVersionUID = -827917759;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setLanguageId(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Byte getLanguageId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE_ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.FilmRecord> fetchFilmListByLanguageId() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Film.FILM)
			.where(org.jooq.examples.mysql.sakila.tables.Film.LANGUAGE_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE_ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 *
	 * @deprecated Because of risk of ambiguity (#187), code generation for this<br/>
	 *             method will not be supported anymore, soon.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.FilmRecord> getFilmListByLanguageId() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Film.FILM)
			.where(org.jooq.examples.mysql.sakila.tables.Film.LANGUAGE_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE_ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.FilmRecord> fetchFilmListByOriginalLanguageId() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Film.FILM)
			.where(org.jooq.examples.mysql.sakila.tables.Film.ORIGINAL_LANGUAGE_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE_ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 *
	 * @deprecated Because of risk of ambiguity (#187), code generation for this<br/>
	 *             method will not be supported anymore, soon.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.FilmRecord> getFilmListByOriginalLanguageId() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Film.FILM)
			.where(org.jooq.examples.mysql.sakila.tables.Film.ORIGINAL_LANGUAGE_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE_ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Language.NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getName() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Language.NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Language.LAST_UPDATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getLastUpdate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Language.LAST_UPDATE);
	}

	/**
	 * Create a detached LanguageRecord
	 */
	public LanguageRecord() {
		super(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE);
	}

	/**
	 * Create an attached LanguageRecord
	 */
	public LanguageRecord(org.jooq.Configuration configuration) {
		super(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE, configuration);
	}
}
