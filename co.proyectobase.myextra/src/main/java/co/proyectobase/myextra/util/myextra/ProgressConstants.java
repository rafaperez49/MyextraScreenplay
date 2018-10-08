package co.proyectobase.myextra.util.myextra  ;

import com4j.ComEnum;

/**
 */
public enum ProgressConstants implements ComEnum {
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  xProgress_NoStart(2),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  xProgress_NoContinue(8),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  xProgress_NoEnd(4),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  xProgress_NoBetween(1),
  ;

  private final int value;
  ProgressConstants(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
