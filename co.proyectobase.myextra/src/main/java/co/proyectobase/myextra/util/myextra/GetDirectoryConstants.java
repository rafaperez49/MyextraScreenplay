package co.proyectobase.myextra.util.myextra  ;

import com4j.ComEnum;

/**
 * <p>
 * Constants used by the System.GetDirectory and Session.GetDirectory methods
 * </p>
 */
public enum GetDirectoryConstants implements ComEnum {
  /**
   * <p>
   * Constants used by the System.GetDirectory and Session.GetDirectory methods
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  xDIRECTORY_CURRENT(1),
  /**
   * <p>
   * Constants used by the System.GetDirectory and Session.GetDirectory methods
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  xDIRECTORY_MACRO(2),
  /**
   * <p>
   * Constants used by the System.GetDirectory and Session.GetDirectory methods
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  xDIRECTORY_BASE(3),
  /**
   * <p>
   * Constants used by the System.GetDirectory and Session.GetDirectory methods
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  xDIRECTORY_WINDOWS(4),
  /**
   * <p>
   * Constants used by the System.GetDirectory and Session.GetDirectory methods
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  xDIRECTORY_SYSTEM(5),
  /**
   * <p>
   * Constants used by the System.GetDirectory and Session.GetDirectory methods
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  xDIRECTORY_HOME(6),
  /**
   * <p>
   * Constants used by the System.GetDirectory and Session.GetDirectory methods
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  xDIRECTORY_COMMON(7),
  ;

  private final int value;
  GetDirectoryConstants(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
