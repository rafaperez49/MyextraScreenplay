package co.proyectobase.myextra.util.myextra  ;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.DefaultMethod;
import com4j.IID;
import com4j.MarshalAs;
import com4j.NativeType;
import com4j.Optional;
import com4j.ReturnValue;
import com4j.VTID;

/**
 * Provides access to host data and EXTRA! functionality
 */
@IID("{7FAE9441-C040-11CD-B010-0000C06E6B8A}")
public interface _Session extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Returns the name of the EXTRA! program
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  java.lang.String name();


  /**
   * <p>
   * Returns the System object
   * </p>
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Returns or sets the name of the Color scheme
   * </p>
   * <p>
   * Setter method for the COM property "ColorScheme"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  void colorScheme(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the name of the Color scheme
   * </p>
   * <p>
   * Getter method for the COM property "ColorScheme"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String colorScheme();


  /**
   * <p>
   * Returns the connection status of the session
   * </p>
   * <p>
   * Setter method for the COM property "Connected"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  void connected(
    int retval);


  /**
   * <p>
   * Returns the connection status of the session
   * </p>
   * <p>
   * Getter method for the COM property "Connected"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  int connected();


  /**
   * <p>
   * Returns or sets the name of the File Transfer scheme
   * </p>
   * <p>
   * Setter method for the COM property "FileTransferScheme"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  void fileTransferScheme(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the name of the File Transfer scheme
   * </p>
   * <p>
   * Getter method for the COM property "FileTransferScheme"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String fileTransferScheme();


  /**
   * <p>
   * Returns a string specifying the path and filename of the session
   * </p>
   * <p>
   * Getter method for the COM property "FullName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String fullName();


  /**
   * <p>
   * Returns or sets the height of the session window in pixels
   * </p>
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  void height(
    short retval);


  /**
   * <p>
   * Returns or sets the height of the session window in pixels
   * </p>
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  short height();


  /**
   * <p>
   * Returns or sets the name of the HotSpot scheme
   * </p>
   * <p>
   * Setter method for the COM property "HotSpotScheme"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(18)
  void hotSpotScheme(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the name of the HotSpot scheme
   * </p>
   * <p>
   * Getter method for the COM property "HotSpotScheme"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String hotSpotScheme();


  /**
   * <p>
   * Returns or sets the keyboard input state for the session
   * </p>
   * <p>
   * Setter method for the COM property "KeyboardLocked"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(20)
  void keyboardLocked(
    int retval);


  /**
   * <p>
   * Returns or sets the keyboard input state for the session
   * </p>
   * <p>
   * Getter method for the COM property "KeyboardLocked"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(21)
  int keyboardLocked();


  /**
   * <p>
   * Returns or sets the name of the key map
   * </p>
   * <p>
   * Setter method for the COM property "KeyMap"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(22)
  void keyMap(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the name of the key map
   * </p>
   * <p>
   * Getter method for the COM property "KeyMap"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String keyMap();


  /**
   * <p>
   * Returns or sets the horizontal position of the session in pixels
   * </p>
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param lLeft Mandatory int parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(24)
  void left(
    int lLeft);


  /**
   * <p>
   * Returns or sets the horizontal position of the session in pixels
   * </p>
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(25)
  int left();


  /**
   * <p>
   * Returns the parent of the object
   * </p>
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(26)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Returns the path of the the path of the session file
   * </p>
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String path();


  /**
   * <p>
   * Returns the collection of available QuickPads
   * </p>
   * <p>
   * Getter method for the COM property "QuickPads"
   * </p>
   * @param vIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(28)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject quickPads(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object vIndex);


  /**
   * <p>
   * Returns the save status of the session
   * </p>
   * <p>
   * Getter method for the COM property "Saved"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(29)
  boolean saved();


  /**
   * <p>
   * Returns the Screen object associated with the session
   * </p>
   * <p>
   * Getter method for the COM property "Screen"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(30)
  @ReturnValue(type=NativeType.Dispatch)
  Screen screen();


  /**
   * <p>
   * Returns the collection of available Toolbars
   * </p>
   * <p>
   * Getter method for the COM property "Toolbars"
   * </p>
   * @param vIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(31)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject toolbars(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object vIndex);


  /**
   * <p>
   * Returns or sets the vertical position of the session in pixels
   * </p>
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param lLeft Mandatory int parameter.
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(32)
  void top(
    int lLeft);


  /**
   * <p>
   * Returns or sets the vertical position of the session in pixels
   * </p>
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(33)
  int top();


  /**
   * <p>
   * Returns an integer indicating the session type
   * </p>
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(34)
  short type();


  /**
   * <p>
   * Sets or returns the visibility status of the Session
   * </p>
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(35)
  void visible(
    int retval);


  /**
   * <p>
   * Sets or returns the visibility status of the Session
   * </p>
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(36)
  int visible();


  /**
   * <p>
   * Returns or sets the width of the session window in pixels
   * </p>
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param lLeft Mandatory int parameter.
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(37)
  void width(
    int lLeft);


  /**
   * <p>
   * Returns or sets the width of the session window in pixels
   * </p>
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(38)
  int width();


  /**
   * <p>
   * Returns or sets the state of the session window
   * </p>
   * <p>
   * Setter method for the COM property "WindowState"
   * </p>
   * @param lLeft Mandatory short parameter.
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(39)
  void windowState(
    short lLeft);


  /**
   * <p>
   * Returns or sets the state of the session window
   * </p>
   * <p>
   * Getter method for the COM property "WindowState"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(40)
  short windowState();


  /**
   * <p>
   * Returns or sets the name of the Edit scheme
   * </p>
   * <p>
   * Setter method for the COM property "EditScheme"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(41)
  void editScheme(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the name of the Edit scheme
   * </p>
   * <p>
   * Getter method for the COM property "EditScheme"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(42)
  java.lang.String editScheme();


  /**
   * <p>
   * Returns or sets the host operating system used by file transfers
   * </p>
   * <p>
   * Setter method for the COM property "FileTransferHostOS"
   * </p>
   * @param lLeft Mandatory short parameter.
   */

  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
  @VTID(43)
  void fileTransferHostOS(
    short lLeft);


  /**
   * <p>
   * Returns or sets the host operating system used by file transfers
   * </p>
   * <p>
   * Getter method for the COM property "FileTransferHostOS"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
  @VTID(44)
  short fileTransferHostOS();


  /**
   * <p>
   * Returns or sets the recognition time used by Record Pages
   * </p>
   * <p>
   * Setter method for the COM property "PageRecognitionTime"
   * </p>
   * @param lLeft Mandatory short parameter.
   */

  @DISPID(43) //= 0x2b. The runtime will prefer the VTID if present
  @VTID(45)
  void pageRecognitionTime(
    short lLeft);


  /**
   * <p>
   * Returns or sets the recognition time used by Record Pages
   * </p>
   * <p>
   * Getter method for the COM property "PageRecognitionTime"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(43) //= 0x2b. The runtime will prefer the VTID if present
  @VTID(46)
  short pageRecognitionTime();


  /**
   * <p>
   * Sets or returns the quiet status of the Session
   * </p>
   * <p>
   * Setter method for the COM property "Quiet"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(45) //= 0x2d. The runtime will prefer the VTID if present
  @VTID(47)
  void quiet(
    int retval);


  /**
   * <p>
   * Sets or returns the quiet status of the Session
   * </p>
   * <p>
   * Getter method for the COM property "Quiet"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(45) //= 0x2d. The runtime will prefer the VTID if present
  @VTID(48)
  int quiet();


  /**
   * <p>
   * Returns the name of the connected (or last connected) host
   * </p>
   * <p>
   * Getter method for the COM property "HostName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(48) //= 0x30. The runtime will prefer the VTID if present
  @VTID(49)
  java.lang.String hostName();


  /**
   * <p>
   * Returns or sets the font size for the session
   * </p>
   * <p>
   * Setter method for the COM property "Font"
   * </p>
   * @param sSize Mandatory java.lang.String parameter.
   */

  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
  @VTID(50)
  void font(
    java.lang.String sSize);


  /**
   * <p>
   * Returns or sets the font size for the session
   * </p>
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
  @VTID(51)
  java.lang.String font();


  /**
   * <p>
   * Returns or sets the language for the session
   * </p>
   * <p>
   * Setter method for the COM property "Language"
   * </p>
   * @param sSize Mandatory java.lang.String parameter.
   */

  @DISPID(51) //= 0x33. The runtime will prefer the VTID if present
  @VTID(52)
  void language(
    java.lang.String sSize);


  /**
   * <p>
   * Returns or sets the language for the session
   * </p>
   * <p>
   * Getter method for the COM property "Language"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(51) //= 0x33. The runtime will prefer the VTID if present
  @VTID(53)
  java.lang.String language();


  /**
   * <p>
   * Returns or sets the Hold Screen state of the Session
   * </p>
   * <p>
   * Setter method for the COM property "HoldScreen"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(54) //= 0x36. The runtime will prefer the VTID if present
  @VTID(54)
  void holdScreen(
    int retval);


  /**
   * <p>
   * Returns or sets the Hold Screen state of the Session
   * </p>
   * <p>
   * Getter method for the COM property "HoldScreen"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(54) //= 0x36. The runtime will prefer the VTID if present
  @VTID(55)
  int holdScreen();


  /**
   * <p>
   * Returns or sets the Auto Connect state of the Session
   * </p>
   * <p>
   * Setter method for the COM property "AutoConnect"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(56) //= 0x38. The runtime will prefer the VTID if present
  @VTID(56)
  void autoConnect(
    int retval);


  /**
   * <p>
   * Returns or sets the Auto Connect state of the Session
   * </p>
   * <p>
   * Getter method for the COM property "AutoConnect"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(56) //= 0x38. The runtime will prefer the VTID if present
  @VTID(57)
  int autoConnect();


  /**
   * <p>
   * Returns or sets the Local Mode state of the Session
   * </p>
   * <p>
   * Setter method for the COM property "Local"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(57) //= 0x39. The runtime will prefer the VTID if present
  @VTID(58)
  void local(
    int retval);


  /**
   * <p>
   * Returns or sets the Local Mode state of the Session
   * </p>
   * <p>
   * Getter method for the COM property "Local"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(57) //= 0x39. The runtime will prefer the VTID if present
  @VTID(59)
  int local();


  /**
   * <p>
   * Returns the FileTransferOptions object associated with the session
   * </p>
   * <p>
   * Getter method for the COM property "FileTransferOptions"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(58) //= 0x3a. The runtime will prefer the VTID if present
  @VTID(60)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject fileTransferOptions();


  /**
   * <p>
   * Returns the Cursor object associated with the session
   * </p>
   * <p>
   * Getter method for the COM property "Cursor"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(59) //= 0x3b. The runtime will prefer the VTID if present
  @VTID(61)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject cursor();


  /**
   * <p>
   * Returns the Connectivity object associated with the session
   * </p>
   * <p>
   * Getter method for the COM property "Connectivity"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(60) //= 0x3c. The runtime will prefer the VTID if present
  @VTID(62)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject connectivity();


  /**
   * <p>
   * Returns the MenuEdit object associated with the session
   * </p>
   * <p>
   * Getter method for the COM property "MenuEdit"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(66) //= 0x42. The runtime will prefer the VTID if present
  @VTID(63)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject menuEdit();


  /**
   * <p>
   * Returns or sets the status of the session menu bar
   * </p>
   * <p>
   * Setter method for the COM property "Menu"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(69) //= 0x45. The runtime will prefer the VTID if present
  @VTID(64)
  void menu(
    int retval);


  /**
   * <p>
   * Returns or sets the status of the session menu bar
   * </p>
   * <p>
   * Getter method for the COM property "Menu"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(69) //= 0x45. The runtime will prefer the VTID if present
  @VTID(65)
  int menu();


  /**
   * <p>
   * Returns or sets the name of the Menu scheme
   * </p>
   * <p>
   * Setter method for the COM property "MenuScheme"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(70) //= 0x46. The runtime will prefer the VTID if present
  @VTID(66)
  void menuScheme(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the name of the Menu scheme
   * </p>
   * <p>
   * Getter method for the COM property "MenuScheme"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(70) //= 0x46. The runtime will prefer the VTID if present
  @VTID(67)
  java.lang.String menuScheme();


  /**
   * <p>
   * Specifies whether or not incoming data is written into a file
   * </p>
   * <p>
   * Setter method for the COM property "Capture"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(75) //= 0x4b. The runtime will prefer the VTID if present
  @VTID(68)
  void capture(
    int retval);


  /**
   * <p>
   * Specifies whether or not incoming data is written into a file
   * </p>
   * <p>
   * Getter method for the COM property "Capture"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(75) //= 0x4b. The runtime will prefer the VTID if present
  @VTID(69)
  int capture();


  /**
   * <p>
   * Returns a handle to the session window
   * </p>
   * <p>
   * Getter method for the COM property "WindowHandle"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(76) //= 0x4c. The runtime will prefer the VTID if present
  @VTID(70)
  int windowHandle();


  /**
   * <p>
   * Determines if the startup macro will automatically run when session is reconnected.
   * </p>
   * <p>
   * Setter method for the COM property "RunMacroOnConnect"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(78) //= 0x4e. The runtime will prefer the VTID if present
  @VTID(71)
  void runMacroOnConnect(
    int retval);


  /**
   * <p>
   * Determines if the startup macro will automatically run when session is reconnected.
   * </p>
   * <p>
   * Getter method for the COM property "RunMacroOnConnect"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(78) //= 0x4e. The runtime will prefer the VTID if present
  @VTID(72)
  int runMacroOnConnect();


  /**
   * <p>
   * Makes the session the active window
   * </p>
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(73)
  void activate();


  /**
   * <p>
   * Closes the session
   * </p>
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(74)
  void close();


  /**
   * <p>
   * Navigates to a specified screen
   * </p>
   * @param vIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(75)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject navigateTo(
    @MarshalAs(NativeType.VARIANT) java.lang.Object vIndex);


  /**
   * <p>
   * Receives a file from the host
   * </p>
   * @param pcFileName Mandatory java.lang.Object parameter.
   * @param hostFileName Mandatory java.lang.Object parameter.
   * @param quiet Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(76)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject receiveFile(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pcFileName,
    @MarshalAs(NativeType.VARIANT) java.lang.Object hostFileName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object quiet);


  /**
   * <p>
   * Saves revised session settings
   * </p>
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(77)
  void save();


  /**
   * <p>
   * Saves a copy of the specified session to a new file
   * </p>
   * @param name Mandatory java.lang.Object parameter.
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(78)
  void saveAs(
    @MarshalAs(NativeType.VARIANT) java.lang.Object name);


  /**
   * <p>
   * Sends a file from the PC to the host
   * </p>
   * @param pcFileName Mandatory java.lang.Object parameter.
   * @param hostFileName Mandatory java.lang.Object parameter.
   * @param quiet Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
  @VTID(79)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject sendFile(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pcFileName,
    @MarshalAs(NativeType.VARIANT) java.lang.Object hostFileName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object quiet);


  /**
   * <p>
   * Returns a string containing the path of the requested directory
   * </p>
   * @param dirType Mandatory short parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(46) //= 0x2e. The runtime will prefer the VTID if present
  @VTID(80)
  java.lang.String getDirectory(
    short dirType);


  /**
   * <p>
   * Returns the display to its power-up operating state
   * </p>
   */

  @DISPID(47) //= 0x2f. The runtime will prefer the VTID if present
  @VTID(81)
  void reset();


  /**
   * <p>
   * Prints the current host screen
   * </p>
   */

  @DISPID(49) //= 0x31. The runtime will prefer the VTID if present
  @VTID(82)
  void printDisplay();


  /**
   * <p>
   * Increases the session font size by one increment
   * </p>
   */

  @DISPID(52) //= 0x34. The runtime will prefer the VTID if present
  @VTID(83)
  void enlargeFont();


  /**
   * <p>
   * Reduces the session font size by one increment
   * </p>
   */

  @DISPID(53) //= 0x35. The runtime will prefer the VTID if present
  @VTID(84)
  void reduceFont();


  /**
   * <p>
   * Removes all information from the History buffer
   * </p>
   */

  @DISPID(55) //= 0x37. The runtime will prefer the VTID if present
  @VTID(85)
  void clearHistory();


  /**
   * <p>
   * Invokes the File Transfer dialog box
   * </p>
   */

  @DISPID(61) //= 0x3d. The runtime will prefer the VTID if present
  @VTID(86)
  void transferFile();


  /**
   * <p>
   * Indicates the end of a print job, and sends a form feed to the print job, ejecting the current page
   * </p>
   */

  @DISPID(62) //= 0x3e. The runtime will prefer the VTID if present
  @VTID(87)
  void closePrintJob();


  /**
   * <p>
   * Clears the communications port and ANSI interpreter
   * </p>
   */

  @DISPID(63) //= 0x3f. The runtime will prefer the VTID if present
  @VTID(88)
  void clearComm();


  /**
   * <p>
   * Waits for disconnection from the host system.
   * </p>
   * @param nTimeout Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(64) //= 0x40. The runtime will prefer the VTID if present
  @VTID(89)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject waitForDisconnect(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object nTimeout);


  /**
   * <p>
   * Waits for specified milliseconds to pass
   * </p>
   * @param nMilliseconds Optional parameter. Default value is com4j.Variant.getMissing()
   * @param bContinuous Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(65) //= 0x41. The runtime will prefer the VTID if present
  @VTID(90)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject waitForTimer(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object nMilliseconds,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object bContinuous);


  /**
   * <p>
   * Displays Extra! Settings Dialog
   * </p>
   * @param sPageType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sSelectPage Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(67) //= 0x43. The runtime will prefer the VTID if present
  @VTID(91)
  void invokeSettingsDialog(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object sPageType,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object sSelectPage);


  /**
   * @param sOptions Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(68) //= 0x44. The runtime will prefer the VTID if present
  @VTID(92)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject transferProgress(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object sOptions);


  /**
   * <p>
   * Sets a title with the string that is passed in
   * </p>
   * @param inTitle Mandatory java.lang.String parameter.
   */

  @DISPID(71) //= 0x47. The runtime will prefer the VTID if present
  @VTID(93)
  void title(
    java.lang.String inTitle);


  /**
   * <p>
   * Sets up capturing the incoming data to go to a file
   * </p>
   * @param fileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param append Optional parameter. Default value is com4j.Variant.getMissing()
   * @param enableCapture Optional parameter. Default value is com4j.Variant.getMissing()
   * @param stripEscSeq Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(72) //= 0x48. The runtime will prefer the VTID if present
  @VTID(94)
  void captureSetup(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fileName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object append,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object enableCapture,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object stripEscSeq);


  /**
   * <p>
   * Closes the session
   * </p>
   * @param options Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(73) //= 0x49. The runtime will prefer the VTID if present
  @VTID(95)
  void closeEx(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object options);


  /**
   * <p>
   * Displays the specified string on the status bar
   * </p>
   * @param varText Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(74) //= 0x4a. The runtime will prefer the VTID if present
  @VTID(96)
  void updateStatusBar(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varText);


  /**
   * <p>
   * Initiates TN3270 negotiation of Express Logon to a host application
   * </p>
   * @param applID Mandatory java.lang.Object parameter.
   * @param nWaitTime Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(77) //= 0x4d. The runtime will prefer the VTID if present
  @VTID(97)
  int initializeELF(
    @MarshalAs(NativeType.VARIANT) java.lang.Object applID,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object nWaitTime);


  /**
   * <p>
   * Returns or sets the session startup macro
   * </p>
   * <p>
   * Setter method for the COM property "StartupScript"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(79) //= 0x4f. The runtime will prefer the VTID if present
  @VTID(98)
  void startupScript(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the session startup macro
   * </p>
   * <p>
   * Getter method for the COM property "StartupScript"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(79) //= 0x4f. The runtime will prefer the VTID if present
  @VTID(99)
  java.lang.String startupScript();


  // Properties:
}
