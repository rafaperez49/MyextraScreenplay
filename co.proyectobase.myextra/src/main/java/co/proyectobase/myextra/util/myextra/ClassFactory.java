package co.proyectobase.myextra.util.myextra  ;

import com4j.COM4J;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * Top-level object, providing access to all objects in EXTRA!
   */
  public static co.proyectobase.myextra.util.myextra._System createExtraSystem() {
    return COM4J.createInstance( co.proyectobase.myextra.util.myextra._System.class, "{2E91AFF2-8EBC-11CE-A16C-10005A6155A7}" );
  }

  /**
   * A collection of all open Session objects
   */
  public static co.proyectobase.myextra.util.myextra.Sessions createExtraSessions() {
    return COM4J.createInstance( co.proyectobase.myextra.util.myextra.Sessions.class, "{2E91AFF1-8EBC-11CE-A16C-10005A6155A7}" );
  }

  /**
   * Provides access to host data and EXTRA! functionality
   */
  public static co.proyectobase.myextra.util.myextra._Session createExtraSession() {
    return COM4J.createInstance( co.proyectobase.myextra.util.myextra._Session.class, "{7FAE9442-C040-11CD-B010-0000C06E6B8A}" );
  }

  /**
   * Provides access to the contents of the host screen's presentation space
   */
  public static co.proyectobase.myextra.util.myextra.Screen createExtraScreen() {
    return COM4J.createInstance( co.proyectobase.myextra.util.myextra.Screen.class, "{0A0F3721-9F5C-11CE-ADDE-0000C02F4A7A}" );
  }

  /**
   * Provides access to the Operator Information Area
   */
  public static co.proyectobase.myextra.util.myextra.OIA createExtraOIA() {
    return COM4J.createInstance( co.proyectobase.myextra.util.myextra.OIA.class, "{A3B414A1-D8B2-11CF-884D-08005AC0F29E}" );
  }

  /**
   * Provides access to a defined area of the screen
   */
  public static co.proyectobase.myextra.util.myextra.Area createExtraArea() {
    return COM4J.createInstance( co.proyectobase.myextra.util.myextra.Area.class, "{0A0F3723-9F5C-11CE-ADDE-0000C02F4A7A}" );
  }

  /**
   * A collection of available QuickPads
   */
  public static co.proyectobase.myextra.util.myextra.QuickPads createExtraQuickPads() {
    return COM4J.createInstance( co.proyectobase.myextra.util.myextra.QuickPads.class, "{2E91AFFB-8EBC-11CE-A16C-10005A6155A7}" );
  }

  /**
   * Provides access to a specific QuickPad object
   */
  public static co.proyectobase.myextra.util.myextra.QuickPad createExtraQuickPad() {
    return COM4J.createInstance( co.proyectobase.myextra.util.myextra.QuickPad.class, "{2E91AFF7-8EBC-11CE-A16C-10005A6155A7}" );
  }

  /**
   * A collection of available Toolbars
   */
  public static co.proyectobase.myextra.util.myextra.Toolbars createExtraToolbars() {
    return COM4J.createInstance( co.proyectobase.myextra.util.myextra.Toolbars.class, "{2E91AFFF-8EBC-11CE-A16C-10005A6155A7}" );
  }

  /**
   * Provides access to a specific Toolbar object
   */
  public static co.proyectobase.myextra.util.myextra.Toolbar createExtraToolbar() {
    return COM4J.createInstance( co.proyectobase.myextra.util.myextra.Toolbar.class, "{2E91AFFD-8EBC-11CE-A16C-10005A6155A7}" );
  }

  /**
   * Provides configuration stuff
   */
  public static co.proyectobase.myextra.util.myextra.HostOptions createExtraHostOptions() {
    return COM4J.createInstance( co.proyectobase.myextra.util.myextra.HostOptions.class, "{0571B7A5-F9B1-11CF-884D-08005AC0F29E}" );
  }

  /**
   * Menu Editing Facilities
   */
  public static co.proyectobase.myextra.util.myextra.MenuEdit createExtraMenuEdit() {
    return COM4J.createInstance( co.proyectobase.myextra.util.myextra.MenuEdit.class, "{88144130-1DC8-4E3D-AA75-40C9C8A13EDA}" );
  }

  /**
   * Provides access to the file transfer configuration options
   */
  public static co.proyectobase.myextra.util.myextra.FileTransferOptions createExtraFileTransfer() {
    return COM4J.createInstance( co.proyectobase.myextra.util.myextra.FileTransferOptions.class, "{2E91AFFF-8EBC-11CE-A16C-10005A6155A8}" );
  }

  /**
   * Provides access to the cursor configuration options
   */
  public static co.proyectobase.myextra.util.myextra.Cursor createExtraCursor() {
    return COM4J.createInstance( co.proyectobase.myextra.util.myextra.Cursor.class, "{2E91CFFF-8EBC-11CE-A16C-10005A6155A9}" );
  }

  /**
   * Provides access to the FTP configuration options
   */
  public static co.proyectobase.myextra.util.myextra.FTPOptions createExtraFTPOptions() {
    return COM4J.createInstance( co.proyectobase.myextra.util.myextra.FTPOptions.class, "{3E91CFFF-8EBC-11CE-A16C-10005A6155B0}" );
  }

  /**
   * Provides access to the Kermit configuration options
   */
  public static co.proyectobase.myextra.util.myextra.KermitOptions createExtraKermitOptions() {
    return COM4J.createInstance( co.proyectobase.myextra.util.myextra.KermitOptions.class, "{4E91CFFF-8EBC-11CE-A16C-10005A6155B1}" );
  }

  /**
   * Provides access to the Zmodem configuration options
   */
  public static co.proyectobase.myextra.util.myextra.ZmodemOptions createExtraZmodemOptions() {
    return COM4J.createInstance( co.proyectobase.myextra.util.myextra.ZmodemOptions.class, "{5E91CFFF-8EBC-11CE-A16C-10005A6155B2}" );
  }

  /**
   * Provides access to the Connectivity configuration options
   */
  public static co.proyectobase.myextra.util.myextra.Connectivity createExtraConnectivity() {
    return COM4J.createInstance( co.proyectobase.myextra.util.myextra.Connectivity.class, "{6E91CFFF-8EBC-11CE-A16C-10005A6155B3}" );
  }

  /**
   * Provides access to the Serial Setup options
   */
  public static co.proyectobase.myextra.util.myextra.SerialSetup createExtraSerialSetup() {
    return COM4J.createInstance( co.proyectobase.myextra.util.myextra.SerialSetup.class, "{7E91CFFF-8EBC-11CE-A16C-10005A6155B4}" );
  }

  /**
   * Provides access to the Telnet Setup options
   */
  public static co.proyectobase.myextra.util.myextra.TelnetSetup createExtraTelnetSetup() {
    return COM4J.createInstance( co.proyectobase.myextra.util.myextra.TelnetSetup.class, "{8E91CFFF-8EBC-11CE-A16C-10005A6155B5}" );
  }

  /**
   * Provides access to the Modem Setup options
   */
  public static co.proyectobase.myextra.util.myextra.ModemSetup createExtraModemSetup() {
    return COM4J.createInstance( co.proyectobase.myextra.util.myextra.ModemSetup.class, "{9E91CFFF-8EBC-11CE-A16C-10005A6155B6}" );
  }
}
