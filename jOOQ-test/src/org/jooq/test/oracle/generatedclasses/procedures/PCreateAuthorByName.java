/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.procedures;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class PCreateAuthorByName extends org.jooq.impl.StoredProcedureImpl {

	private static final long serialVersionUID = -331122380;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> FIRST_NAME = new org.jooq.impl.ParameterImpl<java.lang.String>("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> LAST_NAME = new org.jooq.impl.ParameterImpl<java.lang.String>("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * Create a new procedure call instance
	 */
	public PCreateAuthorByName() {
		super(org.jooq.SQLDialect.ORACLE, "P_CREATE_AUTHOR_BY_NAME", org.jooq.test.oracle.generatedclasses.Test.TEST);

		addInParameter(FIRST_NAME);
		addInParameter(LAST_NAME);
	}

	public void setFirstName(java.lang.String value) {
		setValue(FIRST_NAME, value);
	}

	public void setLastName(java.lang.String value) {
		setValue(LAST_NAME, value);
	}
}
