/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.oracle.sys.packages.dbms_xplan;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class PrepareRecords extends org.jooq.impl.AbstractRoutine<java.lang.Object> {

	private static final long serialVersionUID = 566504082;


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
	public static final org.jooq.Parameter<org.jooq.Result<org.jooq.Record>> PLAN_CUR = createParameter("PLAN_CUR", org.jooq.impl.SQLDataType.RESULT);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> I_FORMAT_FLAGS = createParameter("I_FORMAT_FLAGS", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public PrepareRecords() {
		super(org.jooq.SQLDialect.ORACLE, "PREPARE_RECORDS", org.jooq.examples.oracle.sys.Sys.SYS, org.jooq.examples.oracle.sys.packages.DbmsXplan.DBMS_XPLAN, org.jooq.util.oracle.OracleDataType.getDefaultDataType("TABLE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(PLAN_CUR);
		addInParameter(I_FORMAT_FLAGS);
	}

	/**
	 * Set the <code>PLAN_CUR</code> parameter to the routine
	 */
	public void setPlanCur(org.jooq.Result<org.jooq.Record> value) {
		setValue(PLAN_CUR, value);
	}

	/**
	 * Set the <code>PLAN_CUR</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setPlanCur(org.jooq.Field<org.jooq.Result<org.jooq.Record>> field) {
		setField(PLAN_CUR, field);
	}

	/**
	 * Set the <code>I_FORMAT_FLAGS</code> parameter to the routine
	 */
	public void setIFormatFlags(java.lang.Integer value) {
		setValue(I_FORMAT_FLAGS, value);
	}

	/**
	 * Set the <code>I_FORMAT_FLAGS</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setIFormatFlags(org.jooq.Field<java.lang.Integer> field) {
		setField(I_FORMAT_FLAGS, field);
	}
}
