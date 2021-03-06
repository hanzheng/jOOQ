/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class FilmActorRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord> {

	private static final long serialVersionUID = -283651042;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.film_actor.actor_id]
	 * REFERENCES actor [sakila.actor.actor_id]
	 * </pre></code>
	 */
	public void setActorId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ACTOR.ACTOR_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.film_actor.actor_id]
	 * REFERENCES actor [sakila.actor.actor_id]
	 * </pre></code>
	 */
	public java.lang.Short getActorId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ACTOR.ACTOR_ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.film_actor.actor_id]
	 * REFERENCES actor [sakila.actor.actor_id]
	 * </pre></code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.ActorRecord fetchActor() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Actor.ACTOR)
			.where(org.jooq.examples.mysql.sakila.tables.Actor.ACTOR.ACTOR_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ACTOR.ACTOR_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.film_actor.film_id]
	 * REFERENCES film [sakila.film.film_id]
	 * </pre></code>
	 */
	public void setFilmId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ACTOR.FILM_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.film_actor.film_id]
	 * REFERENCES film [sakila.film.film_id]
	 * </pre></code>
	 */
	public java.lang.Short getFilmId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ACTOR.FILM_ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.film_actor.film_id]
	 * REFERENCES film [sakila.film.film_id]
	 * </pre></code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.FilmRecord fetchFilm() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Film.FILM)
			.where(org.jooq.examples.mysql.sakila.tables.Film.FILM.FILM_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ACTOR.FILM_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ACTOR.LAST_UPDATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getLastUpdate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ACTOR.LAST_UPDATE);
	}

	/**
	 * Create a detached FilmActorRecord
	 */
	public FilmActorRecord() {
		super(org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ACTOR);
	}
}
