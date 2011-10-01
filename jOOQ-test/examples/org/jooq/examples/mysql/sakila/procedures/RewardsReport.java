/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.procedures;

/**
 * This class is generated by jOOQ.
 *
 * Provides a customizable report on best customers
 */
@javax.annotation.Generated(value    = "http://www.jooq.org",
                            comments = "This class is generated by jOOQ")
public class RewardsReport extends org.jooq.impl.StoredProcedureImpl {

	private static final long serialVersionUID = 889449216;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Byte> MIN_MONTHLY_PURCHASES = new org.jooq.impl.ParameterImpl<java.lang.Byte>("min_monthly_purchases", org.jooq.impl.SQLDataType.TINYINT);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> MIN_DOLLAR_AMOUNT_PURCHASED = new org.jooq.impl.ParameterImpl<java.math.BigDecimal>("min_dollar_amount_purchased", org.jooq.impl.SQLDataType.DECIMAL);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> COUNT_REWARDEES = new org.jooq.impl.ParameterImpl<java.lang.Integer>("count_rewardees", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new procedure call instance
	 */
	public RewardsReport() {
		super(org.jooq.SQLDialect.MYSQL, "rewards_report", org.jooq.examples.mysql.sakila.Sakila.SAKILA);

		addInParameter(MIN_MONTHLY_PURCHASES);
		addInParameter(MIN_DOLLAR_AMOUNT_PURCHASED);
		addOutParameter(COUNT_REWARDEES);
	}

	public void setMinMonthlyPurchases(java.lang.Byte value) {
		setValue(MIN_MONTHLY_PURCHASES, value);
	}

	public void setMinDollarAmountPurchased(java.math.BigDecimal value) {
		setValue(MIN_DOLLAR_AMOUNT_PURCHASED, value);
	}

	public java.lang.Integer getCountRewardees() {
		return getValue(COUNT_REWARDEES);
	}
}
