package co.proyectobase.myextra.util.myextra  ;

import com4j.ComEnum;

/**
 * <p>
 * Constants used by the OIA.ErrorStatus property
 * </p>
 */
public enum OIAErrorStatusConstants implements ComEnum {
  /**
   * <p>
   * Constants used by the OIA.ErrorStatus property
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  xPROG_CHECK(1),
  /**
   * <p>
   * Constants used by the OIA.ErrorStatus property
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  xCOMM_CHECK(2),
  /**
   * <p>
   * Constants used by the OIA.ErrorStatus property
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  xMACHINE_CHECK(3),
  ;

  private final int value;
  OIAErrorStatusConstants(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
