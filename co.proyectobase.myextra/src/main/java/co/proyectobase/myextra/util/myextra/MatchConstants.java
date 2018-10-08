package co.proyectobase.myextra.util.myextra  ;

import com4j.ComEnum;

/**
 * <p>
 * Constants used by WaitForString or WaitForStream
 * </p>
 */
public enum MatchConstants implements ComEnum {
  /**
   * <p>
   * Constants used by WaitForString or WaitForStream
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  xRegExp(1),
  /**
   * <p>
   * Constants used by WaitForString or WaitForStream
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  xNoCase(2),
  /**
   * <p>
   * Constants used by WaitForString or WaitForStream
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  xStrip(4),
  ;

  private final int value;
  MatchConstants(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
