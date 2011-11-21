/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class FilmListRecord extends org.jooq.impl.TableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.FilmListRecord> {

	private static final long serialVersionUID = 256894785;

	/**
	 * An uncommented item
	 */
	public void setFid(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.FilmList.FILM_LIST.FID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Short getFid() {
		return getValue(org.jooq.examples.mysql.sakila.tables.FilmList.FILM_LIST.FID);
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.FilmList.FILM_LIST.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.examples.mysql.sakila.tables.FilmList.FILM_LIST.TITLE);
	}

	/**
	 * An uncommented item
	 */
	public void setDescription(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.FilmList.FILM_LIST.DESCRIPTION, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getDescription() {
		return getValue(org.jooq.examples.mysql.sakila.tables.FilmList.FILM_LIST.DESCRIPTION);
	}

	/**
	 * An uncommented item
	 */
	public void setCategory(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.FilmList.FILM_LIST.CATEGORY, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getCategory() {
		return getValue(org.jooq.examples.mysql.sakila.tables.FilmList.FILM_LIST.CATEGORY);
	}

	/**
	 * An uncommented item
	 */
	public void setPrice(java.math.BigDecimal value) {
		setValue(org.jooq.examples.mysql.sakila.tables.FilmList.FILM_LIST.PRICE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.math.BigDecimal getPrice() {
		return getValue(org.jooq.examples.mysql.sakila.tables.FilmList.FILM_LIST.PRICE);
	}

	/**
	 * An uncommented item
	 */
	public void setLength(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.FilmList.FILM_LIST.LENGTH, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Short getLength() {
		return getValue(org.jooq.examples.mysql.sakila.tables.FilmList.FILM_LIST.LENGTH);
	}

	/**
	 * An uncommented item
	 */
	public void setRating(org.jooq.examples.mysql.sakila.enums.FilmListRating value) {
		setValue(org.jooq.examples.mysql.sakila.tables.FilmList.FILM_LIST.RATING, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.examples.mysql.sakila.enums.FilmListRating getRating() {
		return getValue(org.jooq.examples.mysql.sakila.tables.FilmList.FILM_LIST.RATING);
	}

	/**
	 * An uncommented item
	 */
	public void setActors(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.FilmList.FILM_LIST.ACTORS, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getActors() {
		return getValue(org.jooq.examples.mysql.sakila.tables.FilmList.FILM_LIST.ACTORS);
	}

	/**
	 * Create a detached FilmListRecord
	 */
	public FilmListRecord() {
		super(org.jooq.examples.mysql.sakila.tables.FilmList.FILM_LIST);
	}
}
