package co.proyectobase.myextra.util.myextra  ;

import com4j.ComEnum;

/**
 * <p>
 * Constants used by the Session.Type property
 * </p>
 */
public enum SessTypeConstants implements ComEnum {
  /**
   * <p>
   * Constants used by the Session.Type property
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  x3270SESSION(1),
  /**
   * <p>
   * Constants used by the Session.Type property
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  x5250SESSION(2),
  /**
   * <p>
   * Constants used by the Session.Type property
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  xVTSESSION(3),
  ;

  private final int value;
  SessTypeConstants(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
