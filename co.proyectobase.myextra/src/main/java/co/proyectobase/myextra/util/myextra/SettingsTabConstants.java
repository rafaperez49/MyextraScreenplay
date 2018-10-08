package co.proyectobase.myextra.util.myextra  ;

import com4j.ComEnum;

/**
 * <p>
 * Constants used by the InvokeSettingsDialog function
 * </p>
 */
public enum SettingsTabConstants implements ComEnum {
  /**
   * <p>
   * Constants used by the InvokeSettingsDialog function
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  xGeneralTab(0),
  /**
   * <p>
   * Constants used by the InvokeSettingsDialog function
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  xDisplayTab(1),
  /**
   * <p>
   * Constants used by the InvokeSettingsDialog function
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  xColorTab(2),
  /**
   * <p>
   * Constants used by the InvokeSettingsDialog function
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  xKeyboardTab(3),
  /**
   * <p>
   * Constants used by the InvokeSettingsDialog function
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  xLocalEditTab(4),
  /**
   * <p>
   * Constants used by the InvokeSettingsDialog function
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  xHistoryTab(5),
  /**
   * <p>
   * Constants used by the InvokeSettingsDialog function
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  xPrinterTab(6),
  /**
   * <p>
   * Constants used by the InvokeSettingsDialog function
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  xGraphicsTab(7),
  /**
   * <p>
   * Constants used by the InvokeSettingsDialog function
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  xAssignmentsTab(1),
  /**
   * <p>
   * Constants used by the InvokeSettingsDialog function
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  xAdvancedTab(1),
  /**
   * <p>
   * Constants used by the InvokeSettingsDialog function
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  xSecurityTab(2),
  /**
   * <p>
   * Constants used by the InvokeSettingsDialog function
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  xProxiesTab(1),
  /**
   * <p>
   * Constants used by the InvokeSettingsDialog function
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  xFileHandlingTab(2),
  /**
   * <p>
   * Constants used by the InvokeSettingsDialog function
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  xFoldersTab(3),
  /**
   * <p>
   * Constants used by the InvokeSettingsDialog function
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  xFileTypesTab(4),
  /**
   * <p>
   * Constants used by the InvokeSettingsDialog function
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  xFileDirectories(2),
  /**
   * <p>
   * Constants used by the InvokeSettingsDialog function
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  xGlobalLanguageSetting(3),
  ;

  private final int value;
  SettingsTabConstants(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
