package co.proyectobase.myextra.util.myextra  ;

/**
 * <p>
 * A character text region on which to perform operations.
 * </p>
 */
public enum ATM_AREA {
  /**
   * <p>
   * Operations flow around the right and left edges of screen.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  ATM_AREA_STREAM, // 0
  /**
   * <p>
   * Bounds operations by a rectangular block.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ATM_AREA_BLOCK, // 1
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ATM_AREA_POINT, // 2
}
