/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all sequences in TEST
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public final class Sequences {

	/**
	 * The sequence TEST.TEST.S_AUTHOR_ID
	 */
	public static final org.jooq.Sequence<java.lang.Integer> S_AUTHOR_ID = new org.jooq.impl.SequenceImpl<java.lang.Integer>("S_AUTHOR_ID", org.jooq.test.oracle.generatedclasses.Test.TEST, org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The sequence TEST.TEST.S_961_BIG_INTEGER
	 */
	public static final org.jooq.Sequence<java.math.BigInteger> S_961_BIG_INTEGER = new org.jooq.impl.SequenceImpl<java.math.BigInteger>("S_961_BIG_INTEGER", org.jooq.test.oracle.generatedclasses.Test.TEST, org.jooq.impl.SQLDataType.DECIMAL_INTEGER);

	/**
	 * The sequence TEST.TEST.S_961_BYTE
	 */
	public static final org.jooq.Sequence<java.lang.Byte> S_961_BYTE = new org.jooq.impl.SequenceImpl<java.lang.Byte>("S_961_BYTE", org.jooq.test.oracle.generatedclasses.Test.TEST, org.jooq.impl.SQLDataType.TINYINT);

	/**
	 * The sequence TEST.TEST.S_961_INT
	 */
	public static final org.jooq.Sequence<java.lang.Integer> S_961_INT = new org.jooq.impl.SequenceImpl<java.lang.Integer>("S_961_INT", org.jooq.test.oracle.generatedclasses.Test.TEST, org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The sequence TEST.TEST.S_961_LONG
	 */
	public static final org.jooq.Sequence<java.lang.Long> S_961_LONG = new org.jooq.impl.SequenceImpl<java.lang.Long>("S_961_LONG", org.jooq.test.oracle.generatedclasses.Test.TEST, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The sequence TEST.TEST.S_961_SHORT
	 */
	public static final org.jooq.Sequence<java.lang.Short> S_961_SHORT = new org.jooq.impl.SequenceImpl<java.lang.Short>("S_961_SHORT", org.jooq.test.oracle.generatedclasses.Test.TEST, org.jooq.impl.SQLDataType.SMALLINT);

	/**
	 * No instances
	 */
	private Sequences() {}
}
