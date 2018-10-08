package co.proyectobase.myextra.util.myextra  ;

import com4j.ComEnum;

/**
 * <p>
 * Constants used by the ProxyType property
 * </p>
 */
public enum ProxyTypeConstants implements ComEnum {
  /**
   * <p>
   * Constants used by the ProxyType property
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  xPROXYTYPE_NONE(0),
  /**
   * <p>
   * Constants used by the ProxyType property
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  xPROXYTYPE_FTP(1),
  /**
   * <p>
   * Constants used by the ProxyType property
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  xPROXYTYPE_TELNET(1),
  /**
   * <p>
   * Constants used by the ProxyType property
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  xPROXYTYPE_SOCKS(2),
  ;

  private final int value;
  ProxyTypeConstants(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
