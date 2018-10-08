package co.proyectobase.myextra.util.myextra  ;

import com4j.ComEnum;

/**
 * <p>
 * Constants used by the OIA.ConnectionStatus property
 * </p>
 */
public enum OiaConnectionStatusConstants implements ComEnum {
  /**
   * <p>
   * Constants used by the OIA.ConnectionStatus property
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  xAPP_OWNED(1),
  /**
   * <p>
   * Constants used by the OIA.ConnectionStatus property
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  xSSCP(2),
  /**
   * <p>
   * Constants used by the OIA.ConnectionStatus property
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  xUNOWNED(3),
  ;

  private final int value;
  OiaConnectionStatusConstants(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
