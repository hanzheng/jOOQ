/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.oracle.sys.packages.dbms_xplan;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class DisplayAwr extends org.jooq.impl.AbstractRoutine<java.lang.Object> {

	private static final long serialVersionUID = -1055688121;


	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (TABLE, DBMS_XPLAN_TYPE_TABLE) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> RETURN_VALUE = new org.jooq.impl.ParameterImpl<java.lang.Object>("RETURN_VALUE", org.jooq.util.oracle.OracleDataType.getDefaultDataType("TABLE"));

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> SQL_ID = new org.jooq.impl.ParameterImpl<java.lang.String>("SQL_ID", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigInteger> PLAN_HASH_VALUE = new org.jooq.impl.ParameterImpl<java.math.BigInteger>("PLAN_HASH_VALUE", org.jooq.impl.SQLDataType.DECIMAL_INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigInteger> DB_ID = new org.jooq.impl.ParameterImpl<java.math.BigInteger>("DB_ID", org.jooq.impl.SQLDataType.DECIMAL_INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> FORMAT = new org.jooq.impl.ParameterImpl<java.lang.String>("FORMAT", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * Create a new routine call instance
	 */
	public DisplayAwr() {
		super(org.jooq.SQLDialect.ORACLE, "DISPLAY_AWR", org.jooq.examples.oracle.sys.Sys.SYS, org.jooq.examples.oracle.sys.packages.DbmsXplan.DBMS_XPLAN, org.jooq.util.oracle.OracleDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(SQL_ID);
		addInParameter(PLAN_HASH_VALUE);
		addInParameter(DB_ID);
		addInParameter(FORMAT);
	}

	/**
	 * Set the <code>SQL_ID</code> parameter to the routine
	 */
	public void setSqlId(java.lang.String value) {
		setValue(SQL_ID, value);
	}

	/**
	 * Set the <code>SQL_ID</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setSqlId(org.jooq.Field<java.lang.String> field) {
		setField(SQL_ID, field);
	}

	/**
	 * Set the <code>PLAN_HASH_VALUE</code> parameter to the routine
	 */
	public void setPlanHashValue(java.math.BigInteger value) {
		setValue(PLAN_HASH_VALUE, value);
	}

	/**
	 * Set the <code>PLAN_HASH_VALUE</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setPlanHashValue(org.jooq.Field<java.math.BigInteger> field) {
		setField(PLAN_HASH_VALUE, field);
	}

	/**
	 * Set the <code>DB_ID</code> parameter to the routine
	 */
	public void setDbId(java.math.BigInteger value) {
		setValue(DB_ID, value);
	}

	/**
	 * Set the <code>DB_ID</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setDbId(org.jooq.Field<java.math.BigInteger> field) {
		setField(DB_ID, field);
	}

	/**
	 * Set the <code>FORMAT</code> parameter to the routine
	 */
	public void setFormat(java.lang.String value) {
		setValue(FORMAT, value);
	}

	/**
	 * Set the <code>FORMAT</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setFormat(org.jooq.Field<java.lang.String> field) {
		setField(FORMAT, field);
	}
}
