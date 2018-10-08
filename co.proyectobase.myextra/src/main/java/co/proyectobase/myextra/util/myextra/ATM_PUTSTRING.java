package co.proyectobase.myextra.util.myextra  ;

/**
 * <p>
 * How strings are handled with protected fields.
 * </p>
 */
public enum ATM_PUTSTRING {
  /**
   * <p>
   * If field is protected, stop the operation.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  ATM_PUTSTRING_STOP, // 0
  /**
   * <p>
   * Ignore input text for length of protected field (default).
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ATM_PUTSTRING_SPAN, // 1
  /**
   * <p>
   * If field is protected, do not ignore any input text.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ATM_PUTSTRING_SKIP, // 2
}
