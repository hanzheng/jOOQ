/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.oracle.sys.packages.dbms_xplan;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class DisplaySqlset extends org.jooq.impl.AbstractRoutine<java.lang.Object> {

	private static final long serialVersionUID = -1862603314;


	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (TABLE, DBMS_XPLAN_TYPE_TABLE) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.util.oracle.OracleDataType.getDefaultDataType("TABLE"));

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> SQLSET_NAME = createParameter("SQLSET_NAME", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> SQL_ID = createParameter("SQL_ID", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigInteger> PLAN_HASH_VALUE = createParameter("PLAN_HASH_VALUE", org.jooq.impl.SQLDataType.DECIMAL_INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> FORMAT = createParameter("FORMAT", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> SQLSET_OWNER = createParameter("SQLSET_OWNER", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * Create a new routine call instance
	 */
	public DisplaySqlset() {
		super(org.jooq.SQLDialect.ORACLE, "DISPLAY_SQLSET", org.jooq.examples.oracle.sys.Sys.SYS, org.jooq.examples.oracle.sys.packages.DbmsXplan.DBMS_XPLAN, org.jooq.util.oracle.OracleDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(SQLSET_NAME);
		addInParameter(SQL_ID);
		addInParameter(PLAN_HASH_VALUE);
		addInParameter(FORMAT);
		addInParameter(SQLSET_OWNER);
	}

	/**
	 * Set the <code>SQLSET_NAME</code> parameter to the routine
	 */
	public void setSqlsetName(java.lang.String value) {
		setValue(SQLSET_NAME, value);
	}

	/**
	 * Set the <code>SQLSET_NAME</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setSqlsetName(org.jooq.Field<java.lang.String> field) {
		setField(SQLSET_NAME, field);
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

	/**
	 * Set the <code>SQLSET_OWNER</code> parameter to the routine
	 */
	public void setSqlsetOwner(java.lang.String value) {
		setValue(SQLSET_OWNER, value);
	}

	/**
	 * Set the <code>SQLSET_OWNER</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setSqlsetOwner(org.jooq.Field<java.lang.String> field) {
		setField(SQLSET_OWNER, field);
	}
}
