/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class PUnused extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1547795457;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> IN1 = createParameter("in1", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> OUT1 = createParameter("out1", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> OUT2 = createParameter("out2", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public PUnused() {
		super(org.jooq.SQLDialect.SQLSERVER, "p_unused", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO);

		addInParameter(IN1);
		addInOutParameter(OUT1);
		addInOutParameter(OUT2);
	}

	/**
	 * Set the <code>in1</code> parameter to the routine
	 */
	public void setIn1(java.lang.String value) {
		setValue(IN1, value);
	}

	/**
	 * Set the <code>out1</code> parameter to the routine
	 */
	public void setOut1(java.lang.Integer value) {
		setValue(OUT1, value);
	}

	/**
	 * Set the <code>out2</code> parameter to the routine
	 */
	public void setOut2(java.lang.Integer value) {
		setValue(OUT2, value);
	}

	public java.lang.Integer getOut1() {
		return getValue(OUT1);
	}

	public java.lang.Integer getOut2() {
		return getValue(OUT2);
	}
}
