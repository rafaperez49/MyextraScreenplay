package co.proyectobase.myextra.util.myextra  ;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.DefaultMethod;
import com4j.IID;
import com4j.NativeType;
import com4j.ReturnValue;
import com4j.VTID;

/**
 * Provides configuration stuff
 */
@IID("{0571B7A4-F9B1-11CF-884D-08005AC0F29E}")
public interface HostOptions extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Returns the System object
   * </p>
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Returns the parent of the object
   * </p>
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Returns or sets the autowrap flag
   * </p>
   * <p>
   * Setter method for the COM property "AutoWrap"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  void autoWrap(
    int retval);


  /**
   * <p>
   * Returns or sets the autowrap flag
   * </p>
   * <p>
   * Getter method for the COM property "AutoWrap"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  int autoWrap();


  /**
   * <p>
   * Returns or sets the number of columns for terminal display
   * </p>
   * <p>
   * Setter method for the COM property "Columns"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  void columns(
    int retval);


  /**
   * <p>
   * Returns or sets the number of columns for terminal display
   * </p>
   * <p>
   * Getter method for the COM property "Columns"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  int columns();


  /**
   * <p>
   * Returns or sets the number of lines on a page
   * </p>
   * <p>
   * Setter method for the COM property "Lines"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  void lines(
    short retval);


  /**
   * <p>
   * Returns or sets the number of lines on a page
   * </p>
   * <p>
   * Getter method for the COM property "Lines"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  short lines();


  /**
   * <p>
   * Returns or sets howmuch of screen to scroll
   * </p>
   * <p>
   * Setter method for the COM property "Scroll"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  void scroll(
    short retval);


  /**
   * <p>
   * Returns or sets howmuch of screen to scroll
   * </p>
   * <p>
   * Getter method for the COM property "Scroll"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  short scroll();


  /**
   * <p>
   * Returns or sets the use of VTstatus line
   * </p>
   * <p>
   * Setter method for the COM property "StatusDisplay"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  void statusDisplay(
    short retval);


  /**
   * <p>
   * Returns or sets the use of VTstatus line
   * </p>
   * <p>
   * Getter method for the COM property "StatusDisplay"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  short statusDisplay();


  /**
   * <p>
   * Returns or sets whether to couple cursor to left and right scrolling
   * </p>
   * <p>
   * Setter method for the COM property "HorizontalCoupling"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  void horizontalCoupling(
    int retval);


  /**
   * <p>
   * Returns or sets whether to couple cursor to left and right scrolling
   * </p>
   * <p>
   * Getter method for the COM property "HorizontalCoupling"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(20)
  int horizontalCoupling();


  /**
   * <p>
   * Returns or sets whether to couple cursor to up and down scrolling
   * </p>
   * <p>
   * Setter method for the COM property "VerticalCoupling"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  void verticalCoupling(
    int retval);


  /**
   * <p>
   * Returns or sets whether to couple cursor to up and down scrolling
   * </p>
   * <p>
   * Getter method for the COM property "VerticalCoupling"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(22)
  int verticalCoupling();


  /**
   * <p>
   * Returns or sets whether to display page from page memory when cursor moves to that page
   * </p>
   * <p>
   * Setter method for the COM property "PageCoupling"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  void pageCoupling(
    int retval);


  /**
   * <p>
   * Returns or sets whether to display page from page memory when cursor moves to that page
   * </p>
   * <p>
   * Getter method for the COM property "PageCoupling"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(24)
  int pageCoupling();


  /**
   * <p>
   * Returns or sets which new line sequence to send
   * </p>
   * <p>
   * Setter method for the COM property "NewLine"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
  void newLine(
    int retval);


  /**
   * <p>
   * Returns or sets which new line sequence to send
   * </p>
   * <p>
   * Getter method for the COM property "NewLine"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(26)
  int newLine();


  /**
   * <p>
   * Returns or sets whether to display control characters, or just process them
   * </p>
   * <p>
   * Setter method for the COM property "DisplayControls"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(27)
  void displayControls(
    int retval);


  /**
   * <p>
   * Returns or sets whether to display control characters, or just process them
   * </p>
   * <p>
   * Getter method for the COM property "DisplayControls"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(28)
  int displayControls();


  /**
   * <p>
   * Returns or sets whether to reverse current foreground and background color
   * </p>
   * <p>
   * Setter method for the COM property "InverseScreen"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(29)
  void inverseScreen(
    int retval);


  /**
   * <p>
   * Returns or sets whether to reverse current foreground and background color
   * </p>
   * <p>
   * Getter method for the COM property "InverseScreen"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(30)
  int inverseScreen();


  /**
   * <p>
   * Returns or sets whether to store information no longer displayed on the screen in the history buffer
   * </p>
   * <p>
   * Setter method for the COM property "HistoryEnable"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(31)
  void historyEnable(
    int retval);


  /**
   * <p>
   * Returns or sets whether to store information no longer displayed on the screen in the history buffer
   * </p>
   * <p>
   * Getter method for the COM property "HistoryEnable"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(32)
  int historyEnable();


  /**
   * <p>
   * Returns or sets the maximum size of history buffer
   * </p>
   * <p>
   * Setter method for the COM property "HistoryMaxSize"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(33)
  void historyMaxSize(
    short retval);


  /**
   * <p>
   * Returns or sets the maximum size of history buffer
   * </p>
   * <p>
   * Getter method for the COM property "HistoryMaxSize"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(34)
  short historyMaxSize();


  /**
   * <p>
   * Returns or sets whether history scrolls off the top line
   * </p>
   * <p>
   * Setter method for the COM property "HistoryScrollingRegion"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(35)
  void historyScrollingRegion(
    int retval);


  /**
   * <p>
   * Returns or sets whether history scrolls off the top line
   * </p>
   * <p>
   * Getter method for the COM property "HistoryScrollingRegion"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(36)
  int historyScrollingRegion();


  /**
   * <p>
   * Returns or sets whether stores history in speified file
   * </p>
   * <p>
   * Setter method for the COM property "HistoryRetain"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(37)
  void historyRetain(
    int retval);


  /**
   * <p>
   * Returns or sets whether stores history in speified file
   * </p>
   * <p>
   * Getter method for the COM property "HistoryRetain"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(38)
  int historyRetain();


  /**
   * <p>
   * Returns or sets the name of the file in which to store the history
   * </p>
   * <p>
   * Setter method for the COM property "HistoryFile"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(39)
  void historyFile(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the name of the file in which to store the history
   * </p>
   * <p>
   * Getter method for the COM property "HistoryFile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(40)
  java.lang.String historyFile();


  /**
   * <p>
   * Returns or sets whether to store image in a Display List
   * </p>
   * <p>
   * Setter method for the COM property "GraphicsDisplayList"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(41)
  void graphicsDisplayList(
    int retval);


  /**
   * <p>
   * Returns or sets whether to store image in a Display List
   * </p>
   * <p>
   * Getter method for the COM property "GraphicsDisplayList"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(42)
  int graphicsDisplayList();


  /**
   * <p>
   * Returns or sets whether to store image in a bitmap
   * </p>
   * <p>
   * Setter method for the COM property "GraphicsBitMap"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(43)
  void graphicsBitMap(
    int retval);


  /**
   * <p>
   * Returns or sets whether to store image in a bitmap
   * </p>
   * <p>
   * Getter method for the COM property "GraphicsBitMap"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(44)
  int graphicsBitMap();


  /**
   * <p>
   * Returns or sets whether to display graphics cursor
   * </p>
   * <p>
   * Setter method for the COM property "GraphicsCursor"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(45)
  void graphicsCursor(
    int retval);


  /**
   * <p>
   * Returns or sets whether to display graphics cursor
   * </p>
   * <p>
   * Getter method for the COM property "GraphicsCursor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(46)
  int graphicsCursor();


  /**
   * <p>
   * Returns or sets whether to send macrograph contents
   * </p>
   * <p>
   * Setter method for the COM property "GraphicsMacroReport"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(47)
  void graphicsMacroReport(
    int retval);


  /**
   * <p>
   * Returns or sets whether to send macrograph contents
   * </p>
   * <p>
   * Getter method for the COM property "GraphicsMacroReport"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(48)
  int graphicsMacroReport();


  /**
   * <p>
   * Returns or sets whether to let sixel scroll the screen
   * </p>
   * <p>
   * Setter method for the COM property "SixelScrolling"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(49)
  void sixelScrolling(
    int retval);


  /**
   * <p>
   * Returns or sets whether to let sixel scroll the screen
   * </p>
   * <p>
   * Getter method for the COM property "SixelScrolling"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(50)
  int sixelScrolling();


  /**
   * <p>
   * Returns or sets whether to use solid background to ensure proper display of style lines
   * </p>
   * <p>
   * Setter method for the COM property "StyledLines"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(51)
  void styledLines(
    int retval);


  /**
   * <p>
   * Returns or sets whether to use solid background to ensure proper display of style lines
   * </p>
   * <p>
   * Getter method for the COM property "StyledLines"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(52)
  int styledLines();


  /**
   * <p>
   * Returns or sets whether to ignore host request to print graphics
   * </p>
   * <p>
   * Setter method for the COM property "SixelIgnorePrintRequests"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(53)
  void sixelIgnorePrintRequests(
    int retval);


  /**
   * <p>
   * Returns or sets whether to ignore host request to print graphics
   * </p>
   * <p>
   * Getter method for the COM property "SixelIgnorePrintRequests"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(54)
  int sixelIgnorePrintRequests();


  /**
   * <p>
   * Returns or sets whether to send background color
   * </p>
   * <p>
   * Setter method for the COM property "SixelBackgroundPrinting"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(55)
  void sixelBackgroundPrinting(
    int retval);


  /**
   * <p>
   * Returns or sets whether to send background color
   * </p>
   * <p>
   * Getter method for the COM property "SixelBackgroundPrinting"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(56)
  int sixelBackgroundPrinting();


  /**
   * <p>
   * Returns or sets whether to send color sixels
   * </p>
   * <p>
   * Setter method for the COM property "SixelColorPrinting"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(57)
  void sixelColorPrinting(
    int retval);


  /**
   * <p>
   * Returns or sets whether to send color sixels
   * </p>
   * <p>
   * Getter method for the COM property "SixelColorPrinting"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(58)
  int sixelColorPrinting();


  /**
   * <p>
   * Returns or sets the aspect ratio
   * </p>
   * <p>
   * Setter method for the COM property "SixelGraphicsLevel"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(59)
  void sixelGraphicsLevel(
    short retval);


  /**
   * <p>
   * Returns or sets the aspect ratio
   * </p>
   * <p>
   * Getter method for the COM property "SixelGraphicsLevel"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(60)
  short sixelGraphicsLevel();


  /**
   * <p>
   * Returns or sets the size of sixel image
   * </p>
   * <p>
   * Setter method for the COM property "SixelPrintOption"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(61)
  void sixelPrintOption(
    short retval);


  /**
   * <p>
   * Returns or sets the size of sixel image
   * </p>
   * <p>
   * Getter method for the COM property "SixelPrintOption"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(62)
  short sixelPrintOption();


  /**
   * <p>
   * Returns or sets the color encoding method
   * </p>
   * <p>
   * Setter method for the COM property "SixelColorSpecification"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(63)
  void sixelColorSpecification(
    short retval);


  /**
   * <p>
   * Returns or sets the color encoding method
   * </p>
   * <p>
   * Getter method for the COM property "SixelColorSpecification"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(64)
  short sixelColorSpecification();


  /**
   * <p>
   * Returns or sets action to take after receiving CR
   * </p>
   * <p>
   * Setter method for the COM property "TektronixCRAddsLF"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(65)
  void tektronixCRAddsLF(
    int retval);


  /**
   * <p>
   * Returns or sets action to take after receiving CR
   * </p>
   * <p>
   * Getter method for the COM property "TektronixCRAddsLF"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(66)
  int tektronixCRAddsLF();


  /**
   * <p>
   * Returns or sets action to take after receiving LF
   * </p>
   * <p>
   * Setter method for the COM property "TektronixLFAddsCR"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(67)
  void tektronixLFAddsCR(
    int retval);


  /**
   * <p>
   * Returns or sets action to take after receiving LF
   * </p>
   * <p>
   * Getter method for the COM property "TektronixLFAddsCR"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(68)
  int tektronixLFAddsCR();


  /**
   * <p>
   * Returns or sets action to take after receiving BS
   * </p>
   * <p>
   * Setter method for the COM property "TektronixBSDoesDEL"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(69)
  void tektronixBSDoesDEL(
    int retval);


  /**
   * <p>
   * Returns or sets action to take after receiving BS
   * </p>
   * <p>
   * Getter method for the COM property "TektronixBSDoesDEL"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(70)
  int tektronixBSDoesDEL();


  /**
   * <p>
   * Returns or sets action to take after receiving DEL
   * </p>
   * <p>
   * Setter method for the COM property "TektronixDELIgnored"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(71)
  void tektronixDELIgnored(
    int retval);


  /**
   * <p>
   * Returns or sets action to take after receiving DEL
   * </p>
   * <p>
   * Getter method for the COM property "TektronixDELIgnored"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(72)
  int tektronixDELIgnored();


  /**
   * <p>
   * Returns or sets GIN position report terminator
   * </p>
   * <p>
   * Setter method for the COM property "TektronixGINTerminator"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(73)
  void tektronixGINTerminator(
    short retval);


  /**
   * <p>
   * Returns or sets GIN position report terminator
   * </p>
   * <p>
   * Getter method for the COM property "TektronixGINTerminator"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(74)
  short tektronixGINTerminator();


  /**
   * <p>
   * Returns or sets whether to interpret VT640 sequences
   * </p>
   * <p>
   * Setter method for the COM property "TektronixVT640Compatible"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(75)
  void tektronixVT640Compatible(
    int retval);


  /**
   * <p>
   * Returns or sets whether to interpret VT640 sequences
   * </p>
   * <p>
   * Getter method for the COM property "TektronixVT640Compatible"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(76)
  int tektronixVT640Compatible();


  /**
   * <p>
   * Returns or sets the character size
   * </p>
   * <p>
   * Setter method for the COM property "TektronixEnlargedCharacter"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(77)
  void tektronixEnlargedCharacter(
    int retval);


  /**
   * <p>
   * Returns or sets the character size
   * </p>
   * <p>
   * Getter method for the COM property "TektronixEnlargedCharacter"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(78)
  int tektronixEnlargedCharacter();


  /**
   * <p>
   * Returns or sets the type of font to use
   * </p>
   * <p>
   * Setter method for the COM property "TektronixVectorFont"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(79)
  void tektronixVectorFont(
    int retval);


  /**
   * <p>
   * Returns or sets the type of font to use
   * </p>
   * <p>
   * Getter method for the COM property "TektronixVectorFont"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(80)
  int tektronixVectorFont();


  /**
   * <p>
   * Returns or sets the character set to use
   * </p>
   * <p>
   * Setter method for the COM property "TektronixCharacterSet"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(81)
  void tektronixCharacterSet(
    short retval);


  /**
   * <p>
   * Returns or sets the character set to use
   * </p>
   * <p>
   * Getter method for the COM property "TektronixCharacterSet"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(82)
  short tektronixCharacterSet();


  /**
   * <p>
   * Returns or sets how to map 4014 line styles to Windows colors
   * </p>
   * <p>
   * Setter method for the COM property "TektronixLineStyleMap"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
  @VTID(83)
  void tektronixLineStyleMap(
    short retval);


  /**
   * <p>
   * Returns or sets how to map 4014 line styles to Windows colors
   * </p>
   * <p>
   * Getter method for the COM property "TektronixLineStyleMap"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
  @VTID(84)
  short tektronixLineStyleMap();


  /**
   * <p>
   * Returns or sets the setting of Page Full Condition
   * </p>
   * <p>
   * Setter method for the COM property "TektronixMarginControl"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(85)
  void tektronixMarginControl(
    short retval);


  /**
   * <p>
   * Returns or sets the setting of Page Full Condition
   * </p>
   * <p>
   * Getter method for the COM property "TektronixMarginControl"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(86)
  short tektronixMarginControl();


  /**
   * <p>
   * Returns or sets whether to produce hardcopy when Page Full Condition reached
   * </p>
   * <p>
   * Setter method for the COM property "TektronixAutoPrint"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(87)
  void tektronixAutoPrint(
    int retval);


  /**
   * <p>
   * Returns or sets whether to produce hardcopy when Page Full Condition reached
   * </p>
   * <p>
   * Getter method for the COM property "TektronixAutoPrint"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(88)
  int tektronixAutoPrint();


  /**
   * <p>
   * Returns or sets the size of emulation window
   * </p>
   * <p>
   * Setter method for the COM property "TektronixDisplay"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
  @VTID(89)
  void tektronixDisplay(
    short retval);


  /**
   * <p>
   * Returns or sets the size of emulation window
   * </p>
   * <p>
   * Getter method for the COM property "TektronixDisplay"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
  @VTID(90)
  short tektronixDisplay();


  /**
   * <p>
   * Returns or sets whether to erase existing characters (including spaces) in the area to be written
   * </p>
   * <p>
   * Setter method for the COM property "TektronixOverwrite"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(125) //= 0x7d. The runtime will prefer the VTID if present
  @VTID(91)
  void tektronixOverwrite(
    int retval);


  /**
   * <p>
   * Returns or sets whether to erase existing characters (including spaces) in the area to be written
   * </p>
   * <p>
   * Getter method for the COM property "TektronixOverwrite"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(125) //= 0x7d. The runtime will prefer the VTID if present
  @VTID(92)
  int tektronixOverwrite();


  /**
   * <p>
   * Returns or sets whether the keypad keys send number or control sequences when pressed
   * </p>
   * <p>
   * Setter method for the COM property "KeypadModeApplication"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(43) //= 0x2b. The runtime will prefer the VTID if present
  @VTID(93)
  void keypadModeApplication(
    int retval);


  /**
   * <p>
   * Returns or sets whether the keypad keys send number or control sequences when pressed
   * </p>
   * <p>
   * Getter method for the COM property "KeypadModeApplication"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(43) //= 0x2b. The runtime will prefer the VTID if present
  @VTID(94)
  int keypadModeApplication();


  /**
   * <p>
   * Returns or sets whether the cursor keys send ANSI cursor control sequences or control functions when pressed
   * </p>
   * <p>
   * Setter method for the COM property "CursorKeyModeApplication"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(44) //= 0x2c. The runtime will prefer the VTID if present
  @VTID(95)
  void cursorKeyModeApplication(
    int retval);


  /**
   * <p>
   * Returns or sets whether the cursor keys send ANSI cursor control sequences or control functions when pressed
   * </p>
   * <p>
   * Getter method for the COM property "CursorKeyModeApplication"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(44) //= 0x2c. The runtime will prefer the VTID if present
  @VTID(96)
  int cursorKeyModeApplication();


  /**
   * <p>
   * Returns or sets whether the BACKSPACE key sends DEL or BS character when pressed
   * </p>
   * <p>
   * Setter method for the COM property "BackspaceDoesDelete"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(45) //= 0x2d. The runtime will prefer the VTID if present
  @VTID(97)
  void backspaceDoesDelete(
    int retval);


  /**
   * <p>
   * Returns or sets whether the BACKSPACE key sends DEL or BS character when pressed
   * </p>
   * <p>
   * Getter method for the COM property "BackspaceDoesDelete"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(45) //= 0x2d. The runtime will prefer the VTID if present
  @VTID(98)
  int backspaceDoesDelete();


  /**
   * <p>
   * Returns or sets the action to take when F1 key is pressed
   * </p>
   * <p>
   * Setter method for the COM property "F1Key"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(46) //= 0x2e. The runtime will prefer the VTID if present
  @VTID(99)
  void f1Key(
    short retval);


  /**
   * <p>
   * Returns or sets the action to take when F1 key is pressed
   * </p>
   * <p>
   * Getter method for the COM property "F1Key"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(46) //= 0x2e. The runtime will prefer the VTID if present
  @VTID(100)
  short f1Key();


  /**
   * <p>
   * Returns or sets the action to take when F2 key is pressed
   * </p>
   * <p>
   * Setter method for the COM property "F2Key"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(47) //= 0x2f. The runtime will prefer the VTID if present
  @VTID(101)
  void f2Key(
    short retval);


  /**
   * <p>
   * Returns or sets the action to take when F2 key is pressed
   * </p>
   * <p>
   * Getter method for the COM property "F2Key"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(47) //= 0x2f. The runtime will prefer the VTID if present
  @VTID(102)
  short f2Key();


  /**
   * <p>
   * Returns or sets the action to take when F3 key is pressed
   * </p>
   * <p>
   * Setter method for the COM property "F3Key"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(48) //= 0x30. The runtime will prefer the VTID if present
  @VTID(103)
  void f3Key(
    short retval);


  /**
   * <p>
   * Returns or sets the action to take when F3 key is pressed
   * </p>
   * <p>
   * Getter method for the COM property "F3Key"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(48) //= 0x30. The runtime will prefer the VTID if present
  @VTID(104)
  short f3Key();


  /**
   * <p>
   * Returns or sets the action to take when F4 key is pressed
   * </p>
   * <p>
   * Setter method for the COM property "F4Key"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(49) //= 0x31. The runtime will prefer the VTID if present
  @VTID(105)
  void f4Key(
    short retval);


  /**
   * <p>
   * Returns or sets the action to take when F4 key is pressed
   * </p>
   * <p>
   * Getter method for the COM property "F4Key"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(49) //= 0x31. The runtime will prefer the VTID if present
  @VTID(106)
  short f4Key();


  /**
   * <p>
   * Returns or sets the action to take when F5 key is pressed
   * </p>
   * <p>
   * Setter method for the COM property "F5Key"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
  @VTID(107)
  void f5Key(
    short retval);


  /**
   * <p>
   * Returns or sets the action to take when F5 key is pressed
   * </p>
   * <p>
   * Getter method for the COM property "F5Key"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
  @VTID(108)
  short f5Key();


  /**
   * <p>
   * Returns or sets whether the bell sounds when the text cursor reaches the right margin
   * </p>
   * <p>
   * Setter method for the COM property "MarginBell"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(51) //= 0x33. The runtime will prefer the VTID if present
  @VTID(109)
  void marginBell(
    int retval);


  /**
   * <p>
   * Returns or sets whether the bell sounds when the text cursor reaches the right margin
   * </p>
   * <p>
   * Getter method for the COM property "MarginBell"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(51) //= 0x33. The runtime will prefer the VTID if present
  @VTID(110)
  int marginBell();


  /**
   * <p>
   * Returns or sets whether the bell sounds when an operationg error occurs or the terminal receives the ASCII BEL character
   * </p>
   * <p>
   * Setter method for the COM property "WarningBell"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(52) //= 0x34. The runtime will prefer the VTID if present
  @VTID(111)
  void warningBell(
    int retval);


  /**
   * <p>
   * Returns or sets whether the bell sounds when an operationg error occurs or the terminal receives the ASCII BEL character
   * </p>
   * <p>
   * Getter method for the COM property "WarningBell"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(52) //= 0x34. The runtime will prefer the VTID if present
  @VTID(112)
  int warningBell();


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F6
   * </p>
   * <p>
   * Setter method for the COM property "UDKF6Key"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(53) //= 0x35. The runtime will prefer the VTID if present
  @VTID(113)
  void udkF6Key(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F6
   * </p>
   * <p>
   * Getter method for the COM property "UDKF6Key"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(53) //= 0x35. The runtime will prefer the VTID if present
  @VTID(114)
  java.lang.String udkF6Key();


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F7
   * </p>
   * <p>
   * Setter method for the COM property "UDKF7Key"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(54) //= 0x36. The runtime will prefer the VTID if present
  @VTID(115)
  void udkF7Key(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F7
   * </p>
   * <p>
   * Getter method for the COM property "UDKF7Key"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(54) //= 0x36. The runtime will prefer the VTID if present
  @VTID(116)
  java.lang.String udkF7Key();


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F8
   * </p>
   * <p>
   * Setter method for the COM property "UDKF8Key"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(55) //= 0x37. The runtime will prefer the VTID if present
  @VTID(117)
  void udkF8Key(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F8
   * </p>
   * <p>
   * Getter method for the COM property "UDKF8Key"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(55) //= 0x37. The runtime will prefer the VTID if present
  @VTID(118)
  java.lang.String udkF8Key();


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F9
   * </p>
   * <p>
   * Setter method for the COM property "UDKF9Key"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(56) //= 0x38. The runtime will prefer the VTID if present
  @VTID(119)
  void udkF9Key(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F9
   * </p>
   * <p>
   * Getter method for the COM property "UDKF9Key"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(56) //= 0x38. The runtime will prefer the VTID if present
  @VTID(120)
  java.lang.String udkF9Key();


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F10
   * </p>
   * <p>
   * Setter method for the COM property "UDKF10Key"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(57) //= 0x39. The runtime will prefer the VTID if present
  @VTID(121)
  void udkF10Key(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F10
   * </p>
   * <p>
   * Getter method for the COM property "UDKF10Key"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(57) //= 0x39. The runtime will prefer the VTID if present
  @VTID(122)
  java.lang.String udkF10Key();


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F11
   * </p>
   * <p>
   * Setter method for the COM property "UDKF11Key"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(58) //= 0x3a. The runtime will prefer the VTID if present
  @VTID(123)
  void udkF11Key(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F11
   * </p>
   * <p>
   * Getter method for the COM property "UDKF11Key"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(58) //= 0x3a. The runtime will prefer the VTID if present
  @VTID(124)
  java.lang.String udkF11Key();


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F12
   * </p>
   * <p>
   * Setter method for the COM property "UDKF12Key"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(59) //= 0x3b. The runtime will prefer the VTID if present
  @VTID(125)
  void udkF12Key(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F12
   * </p>
   * <p>
   * Getter method for the COM property "UDKF12Key"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(59) //= 0x3b. The runtime will prefer the VTID if present
  @VTID(126)
  java.lang.String udkF12Key();


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F13
   * </p>
   * <p>
   * Setter method for the COM property "UDKF13Key"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(60) //= 0x3c. The runtime will prefer the VTID if present
  @VTID(127)
  void udkF13Key(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F13
   * </p>
   * <p>
   * Getter method for the COM property "UDKF13Key"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(60) //= 0x3c. The runtime will prefer the VTID if present
  @VTID(128)
  java.lang.String udkF13Key();


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F14
   * </p>
   * <p>
   * Setter method for the COM property "UDKF14Key"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(61) //= 0x3d. The runtime will prefer the VTID if present
  @VTID(129)
  void udkF14Key(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F14
   * </p>
   * <p>
   * Getter method for the COM property "UDKF14Key"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(61) //= 0x3d. The runtime will prefer the VTID if present
  @VTID(130)
  java.lang.String udkF14Key();


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F15
   * </p>
   * <p>
   * Setter method for the COM property "UDKF15Key"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(62) //= 0x3e. The runtime will prefer the VTID if present
  @VTID(131)
  void udkF15Key(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F15
   * </p>
   * <p>
   * Getter method for the COM property "UDKF15Key"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(62) //= 0x3e. The runtime will prefer the VTID if present
  @VTID(132)
  java.lang.String udkF15Key();


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F16
   * </p>
   * <p>
   * Setter method for the COM property "UDKF16Key"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(63) //= 0x3f. The runtime will prefer the VTID if present
  @VTID(133)
  void udkF16Key(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F16
   * </p>
   * <p>
   * Getter method for the COM property "UDKF16Key"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(63) //= 0x3f. The runtime will prefer the VTID if present
  @VTID(134)
  java.lang.String udkF16Key();


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F17
   * </p>
   * <p>
   * Setter method for the COM property "UDKF17Key"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(64) //= 0x40. The runtime will prefer the VTID if present
  @VTID(135)
  void udkF17Key(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F17
   * </p>
   * <p>
   * Getter method for the COM property "UDKF17Key"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64) //= 0x40. The runtime will prefer the VTID if present
  @VTID(136)
  java.lang.String udkF17Key();


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F18
   * </p>
   * <p>
   * Setter method for the COM property "UDKF18Key"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(65) //= 0x41. The runtime will prefer the VTID if present
  @VTID(137)
  void udkF18Key(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F18
   * </p>
   * <p>
   * Getter method for the COM property "UDKF18Key"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(65) //= 0x41. The runtime will prefer the VTID if present
  @VTID(138)
  java.lang.String udkF18Key();


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F19
   * </p>
   * <p>
   * Setter method for the COM property "UDKF19Key"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(66) //= 0x42. The runtime will prefer the VTID if present
  @VTID(139)
  void udkF19Key(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F19
   * </p>
   * <p>
   * Getter method for the COM property "UDKF19Key"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(66) //= 0x42. The runtime will prefer the VTID if present
  @VTID(140)
  java.lang.String udkF19Key();


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F20
   * </p>
   * <p>
   * Setter method for the COM property "UDKF20Key"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(67) //= 0x43. The runtime will prefer the VTID if present
  @VTID(141)
  void udkF20Key(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets assignment for the user-defined key Shift-F20
   * </p>
   * <p>
   * Getter method for the COM property "UDKF20Key"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(67) //= 0x43. The runtime will prefer the VTID if present
  @VTID(142)
  java.lang.String udkF20Key();


  /**
   * <p>
   * Returns or sets whether to use local edit mode
   * </p>
   * <p>
   * Setter method for the COM property "EditMode"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(68) //= 0x44. The runtime will prefer the VTID if present
  @VTID(143)
  void editMode(
    short retval);


  /**
   * <p>
   * Returns or sets whether to use local edit mode
   * </p>
   * <p>
   * Getter method for the COM property "EditMode"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(68) //= 0x44. The runtime will prefer the VTID if present
  @VTID(144)
  short editMode();


  /**
   * <p>
   * Returns or sets how the F6 through F20 function keys work in local edit mode
   * </p>
   * <p>
   * Setter method for the COM property "EditFunctionKeys"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(69) //= 0x45. The runtime will prefer the VTID if present
  @VTID(145)
  void editFunctionKeys(
    short retval);


  /**
   * <p>
   * Returns or sets how the F6 through F20 function keys work in local edit mode
   * </p>
   * <p>
   * Getter method for the COM property "EditFunctionKeys"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(69) //= 0x45. The runtime will prefer the VTID if present
  @VTID(146)
  short editFunctionKeys();


  /**
   * <p>
   * Returns or sets character to use to signal the end of line in a block of data
   * </p>
   * <p>
   * Setter method for the COM property "EditEOLChars"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(70) //= 0x46. The runtime will prefer the VTID if present
  @VTID(147)
  void editEOLChars(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets character to use to signal the end of line in a block of data
   * </p>
   * <p>
   * Getter method for the COM property "EditEOLChars"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(70) //= 0x46. The runtime will prefer the VTID if present
  @VTID(148)
  java.lang.String editEOLChars();


  /**
   * <p>
   * Returns or sets character to use to signal the end of block of data
   * </p>
   * <p>
   * Setter method for the COM property "EditEOBChars"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(71) //= 0x47. The runtime will prefer the VTID if present
  @VTID(149)
  void editEOBChars(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets character to use to signal the end of block of data
   * </p>
   * <p>
   * Getter method for the COM property "EditEOBChars"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(71) //= 0x47. The runtime will prefer the VTID if present
  @VTID(150)
  java.lang.String editEOBChars();


  /**
   * <p>
   * Returns or sets whether to send scrolling region or block, based on VT131Transfer value
   * </p>
   * <p>
   * Setter method for the COM property "EditTransferTermination"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(72) //= 0x48. The runtime will prefer the VTID if present
  @VTID(151)
  void editTransferTermination(
    int retval);


  /**
   * <p>
   * Returns or sets whether to send scrolling region or block, based on VT131Transfer value
   * </p>
   * <p>
   * Getter method for the COM property "EditTransferTermination"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(72) //= 0x48. The runtime will prefer the VTID if present
  @VTID(152)
  int editTransferTermination();


  /**
   * <p>
   * Returns or sets whether to send a record separator in place of unused character fields and spaces in a data block, or space character in place of unused characters
   * </p>
   * <p>
   * Setter method for the COM property "EditSpaceCompression"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(73) //= 0x49. The runtime will prefer the VTID if present
  @VTID(153)
  void editSpaceCompression(
    int retval);


  /**
   * <p>
   * Returns or sets whether to send a record separator in place of unused character fields and spaces in a data block, or space character in place of unused characters
   * </p>
   * <p>
   * Getter method for the COM property "EditSpaceCompression"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(73) //= 0x49. The runtime will prefer the VTID if present
  @VTID(154)
  int editSpaceCompression();


  /**
   * <p>
   * Returns or sets whether to send a line of eligible characters, or a full or partial page
   * </p>
   * <p>
   * Setter method for the COM property "EditLineTransmit"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(74) //= 0x4a. The runtime will prefer the VTID if present
  @VTID(155)
  void editLineTransmit(
    int retval);


  /**
   * <p>
   * Returns or sets whether to send a line of eligible characters, or a full or partial page
   * </p>
   * <p>
   * Getter method for the COM property "EditLineTransmit"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(74) //= 0x4a. The runtime will prefer the VTID if present
  @VTID(156)
  int editLineTransmit();


  /**
   * <p>
   * Returns or sets whether to scroll at the end of the screen in line transmit mode
   * </p>
   * <p>
   * Setter method for the COM property "EditNewLineScrolling"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(75) //= 0x4b. The runtime will prefer the VTID if present
  @VTID(157)
  void editNewLineScrolling(
    int retval);


  /**
   * <p>
   * Returns or sets whether to scroll at the end of the screen in line transmit mode
   * </p>
   * <p>
   * Getter method for the COM property "EditNewLineScrolling"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(75) //= 0x4b. The runtime will prefer the VTID if present
  @VTID(158)
  int editNewLineScrolling();


  /**
   * <p>
   * Returns or sets which type of character to erase
   * </p>
   * <p>
   * Setter method for the COM property "EditEraseAll"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(76) //= 0x4c. The runtime will prefer the VTID if present
  @VTID(159)
  void editEraseAll(
    int retval);


  /**
   * <p>
   * Returns or sets which type of character to erase
   * </p>
   * <p>
   * Getter method for the COM property "EditEraseAll"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(76) //= 0x4c. The runtime will prefer the VTID if present
  @VTID(160)
  int editEraseAll();


  /**
   * <p>
   * Returns or sets how to switch modes
   * </p>
   * <p>
   * Setter method for the COM property "EditKeyImmediate"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(77) //= 0x4d. The runtime will prefer the VTID if present
  @VTID(161)
  void editKeyImmediate(
    int retval);


  /**
   * <p>
   * Returns or sets how to switch modes
   * </p>
   * <p>
   * Getter method for the COM property "EditKeyImmediate"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(77) //= 0x4d. The runtime will prefer the VTID if present
  @VTID(162)
  int editKeyImmediate();


  /**
   * <p>
   * Returns or sets how to send data to the host
   * </p>
   * <p>
   * Setter method for the COM property "EditTransmitImmediate"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(78) //= 0x4e. The runtime will prefer the VTID if present
  @VTID(163)
  void editTransmitImmediate(
    int retval);


  /**
   * <p>
   * Returns or sets how to send data to the host
   * </p>
   * <p>
   * Getter method for the COM property "EditTransmitImmediate"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(78) //= 0x4e. The runtime will prefer the VTID if present
  @VTID(164)
  int editTransmitImmediate();


  /**
   * <p>
   * Returns or sets what terminal type to use to send data
   * </p>
   * <p>
   * Setter method for the COM property "EditVT131Transfer"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(79) //= 0x4f. The runtime will prefer the VTID if present
  @VTID(165)
  void editVT131Transfer(
    int retval);


  /**
   * <p>
   * Returns or sets what terminal type to use to send data
   * </p>
   * <p>
   * Getter method for the COM property "EditVT131Transfer"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(79) //= 0x4f. The runtime will prefer the VTID if present
  @VTID(166)
  int editVT131Transfer();


  /**
   * <p>
   * Returns or sets which type of character to send
   * </p>
   * <p>
   * Setter method for the COM property "EditGuardedAreaAll"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(80) //= 0x50. The runtime will prefer the VTID if present
  @VTID(167)
  void editGuardedAreaAll(
    int retval);


  /**
   * <p>
   * Returns or sets which type of character to send
   * </p>
   * <p>
   * Getter method for the COM property "EditGuardedAreaAll"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(80) //= 0x50. The runtime will prefer the VTID if present
  @VTID(168)
  int editGuardedAreaAll();


  /**
   * <p>
   * Returns or sets which characters to send
   * </p>
   * <p>
   * Setter method for the COM property "EditSelectedAreaAll"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(169)
  void editSelectedAreaAll(
    int retval);


  /**
   * <p>
   * Returns or sets which characters to send
   * </p>
   * <p>
   * Getter method for the COM property "EditSelectedAreaAll"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(170)
  int editSelectedAreaAll();


  /**
   * <p>
   * Returns or sets which selected area to send
   * </p>
   * <p>
   * Setter method for the COM property "EditMultipleArea"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(82) //= 0x52. The runtime will prefer the VTID if present
  @VTID(171)
  void editMultipleArea(
    int retval);


  /**
   * <p>
   * Returns or sets which selected area to send
   * </p>
   * <p>
   * Getter method for the COM property "EditMultipleArea"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(82) //= 0x52. The runtime will prefer the VTID if present
  @VTID(172)
  int editMultipleArea();


  /**
   * <p>
   * Returns or sets how the printing occurs
   * </p>
   * <p>
   * Setter method for the COM property "PrintMode"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(83) //= 0x53. The runtime will prefer the VTID if present
  @VTID(173)
  void printMode(
    short retval);


  /**
   * <p>
   * Returns or sets how the printing occurs
   * </p>
   * <p>
   * Getter method for the COM property "PrintMode"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(83) //= 0x53. The runtime will prefer the VTID if present
  @VTID(174)
  short printMode();


  /**
   * <p>
   * Returns or sets the time to wait after receiving last piece of data before flushing buffered data
   * </p>
   * <p>
   * Setter method for the COM property "PrintCloseIdle"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(84) //= 0x54. The runtime will prefer the VTID if present
  @VTID(175)
  void printCloseIdle(
    short retval);


  /**
   * <p>
   * Returns or sets the time to wait after receiving last piece of data before flushing buffered data
   * </p>
   * <p>
   * Getter method for the COM property "PrintCloseIdle"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(84) //= 0x54. The runtime will prefer the VTID if present
  @VTID(176)
  short printCloseIdle();


  /**
   * <p>
   * Returns or sets how much of page memory to print
   * </p>
   * <p>
   * Setter method for the COM property "PrintExtent"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(85) //= 0x55. The runtime will prefer the VTID if present
  @VTID(177)
  void printExtent(
    short retval);


  /**
   * <p>
   * Returns or sets how much of page memory to print
   * </p>
   * <p>
   * Getter method for the COM property "PrintExtent"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(85) //= 0x55. The runtime will prefer the VTID if present
  @VTID(178)
  short printExtent();


  /**
   * <p>
   * Returns or sets whether to send a form feed at end of print job
   * </p>
   * <p>
   * Setter method for the COM property "PrintTerminator"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(86) //= 0x56. The runtime will prefer the VTID if present
  @VTID(179)
  void printTerminator(
    int retval);


  /**
   * <p>
   * Returns or sets whether to send a form feed at end of print job
   * </p>
   * <p>
   * Getter method for the COM property "PrintTerminator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(86) //= 0x56. The runtime will prefer the VTID if present
  @VTID(180)
  int printTerminator();


  /**
   * <p>
   * Returns or sets whether to translate LA210 printer codes form the host to the printer type connected to the personal computer
   * </p>
   * <p>
   * Setter method for the COM property "PrintEmulateANSI"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(87) //= 0x57. The runtime will prefer the VTID if present
  @VTID(181)
  void printEmulateANSI(
    int retval);


  /**
   * <p>
   * Returns or sets whether to translate LA210 printer codes form the host to the printer type connected to the personal computer
   * </p>
   * <p>
   * Getter method for the COM property "PrintEmulateANSI"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(87) //= 0x57. The runtime will prefer the VTID if present
  @VTID(182)
  int printEmulateANSI();


  /**
   * <p>
   * Returns or sets whether to print the current screen background
   * </p>
   * <p>
   * Setter method for the COM property "PrintBackground"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(88) //= 0x58. The runtime will prefer the VTID if present
  @VTID(183)
  void printBackground(
    int retval);


  /**
   * <p>
   * Returns or sets whether to print the current screen background
   * </p>
   * <p>
   * Getter method for the COM property "PrintBackground"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(88) //= 0x58. The runtime will prefer the VTID if present
  @VTID(184)
  int printBackground();


  /**
   * <p>
   * Returns or sets whether to print color on a color printer
   * </p>
   * <p>
   * Setter method for the COM property "PrintColors"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(89) //= 0x59. The runtime will prefer the VTID if present
  @VTID(185)
  void printColors(
    int retval);


  /**
   * <p>
   * Returns or sets whether to print color on a color printer
   * </p>
   * <p>
   * Getter method for the COM property "PrintColors"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(89) //= 0x59. The runtime will prefer the VTID if present
  @VTID(186)
  int printColors();


  /**
   * <p>
   * Returns or sets whether to swap the darkest and brightest palette colors for printing
   * </p>
   * <p>
   * Setter method for the COM property "PrintReverseBlackWhite"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(90) //= 0x5a. The runtime will prefer the VTID if present
  @VTID(187)
  void printReverseBlackWhite(
    int retval);


  /**
   * <p>
   * Returns or sets whether to swap the darkest and brightest palette colors for printing
   * </p>
   * <p>
   * Getter method for the COM property "PrintReverseBlackWhite"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(90) //= 0x5a. The runtime will prefer the VTID if present
  @VTID(188)
  int printReverseBlackWhite();


  /**
   * <p>
   * Returns or sets whether to use bitmap printing method
   * </p>
   * <p>
   * Setter method for the COM property "PrintUseBitmap"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(91) //= 0x5b. The runtime will prefer the VTID if present
  @VTID(189)
  void printUseBitmap(
    int retval);


  /**
   * <p>
   * Returns or sets whether to use bitmap printing method
   * </p>
   * <p>
   * Getter method for the COM property "PrintUseBitmap"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(91) //= 0x5b. The runtime will prefer the VTID if present
  @VTID(190)
  int printUseBitmap();


  /**
   * <p>
   * Returns or sets whether to use fixed-pitch font
   * </p>
   * <p>
   * Setter method for the COM property "PrintAutoFontSelect"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(92) //= 0x5c. The runtime will prefer the VTID if present
  @VTID(191)
  void printAutoFontSelect(
    int retval);


  /**
   * <p>
   * Returns or sets whether to use fixed-pitch font
   * </p>
   * <p>
   * Getter method for the COM property "PrintAutoFontSelect"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(92) //= 0x5c. The runtime will prefer the VTID if present
  @VTID(192)
  int printAutoFontSelect();


  /**
   * <p>
   * Returns or sets which font to use. Not valid if you use Automatic
   * </p>
   * <p>
   * Setter method for the COM property "PrintFont"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(93) //= 0x5d. The runtime will prefer the VTID if present
  @VTID(193)
  void printFont(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets which font to use. Not valid if you use Automatic
   * </p>
   * <p>
   * Getter method for the COM property "PrintFont"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(93) //= 0x5d. The runtime will prefer the VTID if present
  @VTID(194)
  java.lang.String printFont();


  /**
   * <p>
   * Returns or sets what style font to use
   * </p>
   * <p>
   * Setter method for the COM property "PrintFontStyle"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(94) //= 0x5e. The runtime will prefer the VTID if present
  @VTID(195)
  void printFontStyle(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets what style font to use
   * </p>
   * <p>
   * Getter method for the COM property "PrintFontStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(94) //= 0x5e. The runtime will prefer the VTID if present
  @VTID(196)
  java.lang.String printFontStyle();


  /**
   * <p>
   * Returns or sets what size font to use. Not valid id you use Automatic
   * </p>
   * <p>
   * Setter method for the COM property "PrintFontSize"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(95) //= 0x5f. The runtime will prefer the VTID if present
  @VTID(197)
  void printFontSize(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets what size font to use. Not valid id you use Automatic
   * </p>
   * <p>
   * Getter method for the COM property "PrintFontSize"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(95) //= 0x5f. The runtime will prefer the VTID if present
  @VTID(198)
  java.lang.String printFontSize();


  /**
   * <p>
   * Returns or sets whether to send print jobs directly to the printer without interpretation by the printer driver
   * </p>
   * <p>
   * Setter method for the COM property "BypassPrinterDriver"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(199)
  void bypassPrinterDriver(
    int retval);


  /**
   * <p>
   * Returns or sets whether to send print jobs directly to the printer without interpretation by the printer driver
   * </p>
   * <p>
   * Getter method for the COM property "BypassPrinterDriver"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(200)
  int bypassPrinterDriver();


  /**
   * <p>
   * Returns or sets the terminal mode for EXTRA! to emulate
   * </p>
   * <p>
   * Setter method for the COM property "TerminalMode"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(96) //= 0x60. The runtime will prefer the VTID if present
  @VTID(201)
  void terminalMode(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the terminal mode for EXTRA! to emulate
   * </p>
   * <p>
   * Getter method for the COM property "TerminalMode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(96) //= 0x60. The runtime will prefer the VTID if present
  @VTID(202)
  java.lang.String terminalMode();


  /**
   * <p>
   * Returns or sets how EXTRA! identifies itself to the host
   * </p>
   * <p>
   * Setter method for the COM property "DAResponse"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(97) //= 0x61. The runtime will prefer the VTID if present
  @VTID(203)
  void daResponse(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets how EXTRA! identifies itself to the host
   * </p>
   * <p>
   * Getter method for the COM property "DAResponse"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(97) //= 0x61. The runtime will prefer the VTID if present
  @VTID(204)
  java.lang.String daResponse();


  /**
   * <p>
   * Returns or sets your custom primary device attribute response
   * </p>
   * <p>
   * Setter method for the COM property "CustomPrimaryDA"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(98) //= 0x62. The runtime will prefer the VTID if present
  @VTID(205)
  void customPrimaryDA(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets your custom primary device attribute response
   * </p>
   * <p>
   * Getter method for the COM property "CustomPrimaryDA"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(98) //= 0x62. The runtime will prefer the VTID if present
  @VTID(206)
  java.lang.String customPrimaryDA();


  /**
   * <p>
   * Returns or sets your custom secondary device attribute response
   * </p>
   * <p>
   * Setter method for the COM property "CustomSecondaryDA"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(99) //= 0x63. The runtime will prefer the VTID if present
  @VTID(207)
  void customSecondaryDA(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets your custom secondary device attribute response
   * </p>
   * <p>
   * Getter method for the COM property "CustomSecondaryDA"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(99) //= 0x63. The runtime will prefer the VTID if present
  @VTID(208)
  java.lang.String customSecondaryDA();


  /**
   * <p>
   * Returns or sets the string to response to a ^E from the host
   * </p>
   * <p>
   * Setter method for the COM property "Answerback"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(209)
  void answerback(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the string to response to a ^E from the host
   * </p>
   * <p>
   * Getter method for the COM property "Answerback"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(210)
  java.lang.String answerback();


  /**
   * <p>
   * Returns or sets whether to use 7-bit and 8-bit characters, or just 7-bit
   * </p>
   * <p>
   * Setter method for the COM property "CharacterSetMode"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(211)
  void characterSetMode(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets whether to use 7-bit and 8-bit characters, or just 7-bit
   * </p>
   * <p>
   * Getter method for the COM property "CharacterSetMode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(212)
  java.lang.String characterSetMode();


  /**
   * <p>
   * Returns or sets which 8-bit supplemental character set to use
   * </p>
   * <p>
   * Setter method for the COM property "UserPreferredCharacterSet"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(213)
  void userPreferredCharacterSet(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets which 8-bit supplemental character set to use
   * </p>
   * <p>
   * Getter method for the COM property "UserPreferredCharacterSet"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(214)
  java.lang.String userPreferredCharacterSet();


  /**
   * <p>
   * Returns or sets which National Character Replacement set to use
   * </p>
   * <p>
   * Setter method for the COM property "NationalCharacterSet"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(215)
  void nationalCharacterSet(
    short retval);


  /**
   * <p>
   * Returns or sets which National Character Replacement set to use
   * </p>
   * <p>
   * Getter method for the COM property "NationalCharacterSet"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(216)
  short nationalCharacterSet();


  /**
   * <p>
   * Returns or sets whether the emulation window displays the characters sent to the host, or lets the host handle echo
   * </p>
   * <p>
   * Setter method for the COM property "LocalEcho"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(217)
  void localEcho(
    int retval);


  /**
   * <p>
   * Returns or sets whether the emulation window displays the characters sent to the host, or lets the host handle echo
   * </p>
   * <p>
   * Getter method for the COM property "LocalEcho"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(218)
  int localEcho();


  /**
   * <p>
   * Returns or sets whether the host system can change user-defined key (UDK) definitions
   * </p>
   * <p>
   * Setter method for the COM property "LockUserKeys"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(219)
  void lockUserKeys(
    int retval);


  /**
   * <p>
   * Returns or sets whether the host system can change user-defined key (UDK) definitions
   * </p>
   * <p>
   * Getter method for the COM property "LockUserKeys"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(220)
  int lockUserKeys();


  /**
   * <p>
   * Returns or sets whether the host system can change the settings of the user preference features, columns, scroll and inverse screen
   * </p>
   * <p>
   * Setter method for the COM property "LockUserFeatures"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(221)
  void lockUserFeatures(
    int retval);


  /**
   * <p>
   * Returns or sets whether the host system can change the settings of the user preference features, columns, scroll and inverse screen
   * </p>
   * <p>
   * Getter method for the COM property "LockUserFeatures"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(222)
  int lockUserFeatures();


  /**
   * <p>
   * Returns or sets whether to disable ANSI locator mode
   * </p>
   * <p>
   * Setter method for the COM property "DisableLocator"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(223)
  void disableLocator(
    int retval);


  /**
   * <p>
   * Returns or sets whether to disable ANSI locator mode
   * </p>
   * <p>
   * Getter method for the COM property "DisableLocator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(224)
  int disableLocator();


  /**
   * <p>
   * Returns or sets whether to use Euro for International currecny symbol
   * </p>
   * <p>
   * Setter method for the COM property "UseEuroforInternationalCurrencySymbol"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(124) //= 0x7c. The runtime will prefer the VTID if present
  @VTID(225)
  void useEuroforInternationalCurrencySymbol(
    int retval);


  /**
   * <p>
   * Returns or sets whether to use Euro for International currecny symbol
   * </p>
   * <p>
   * Getter method for the COM property "UseEuroforInternationalCurrencySymbol"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(124) //= 0x7c. The runtime will prefer the VTID if present
  @VTID(226)
  int useEuroforInternationalCurrencySymbol();


  /**
   * <p>
   * Resets the attribute mappings to the defalt settings
   * </p>
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(227)
  void resetAttributes();


  /**
   * <p>
   * Returns or sets whether to map the Bold attribute to color
   * </p>
   * <p>
   * Setter method for the COM property "MapColorBold"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(228)
  void mapColorBold(
    int retval);


  /**
   * <p>
   * Returns or sets whether to map the Bold attribute to color
   * </p>
   * <p>
   * Getter method for the COM property "MapColorBold"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(229)
  int mapColorBold();


  /**
   * <p>
   * Returns or sets whether to map the Underline attribute to color
   * </p>
   * <p>
   * Setter method for the COM property "MapColorUnderline"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(230)
  void mapColorUnderline(
    int retval);


  /**
   * <p>
   * Returns or sets whether to map the Underline attribute to color
   * </p>
   * <p>
   * Getter method for the COM property "MapColorUnderline"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(231)
  int mapColorUnderline();


  /**
   * <p>
   * Returns or sets whether to map the Inverse attribute to color
   * </p>
   * <p>
   * Setter method for the COM property "MapColorInverse"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(232)
  void mapColorInverse(
    int retval);


  /**
   * <p>
   * Returns or sets whether to map the Inverse attribute to color
   * </p>
   * <p>
   * Getter method for the COM property "MapColorInverse"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(233)
  int mapColorInverse();


  /**
   * <p>
   * Returns or sets whether to map the Blink attribute to color
   * </p>
   * <p>
   * Setter method for the COM property "MapColorBlink"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(234)
  void mapColorBlink(
    int retval);


  /**
   * <p>
   * Returns or sets whether to map the Blink attribute to color
   * </p>
   * <p>
   * Getter method for the COM property "MapColorBlink"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(235)
  int mapColorBlink();


  /**
   * <p>
   * Returns or sets whether received ISO color sequences have any effect
   * </p>
   * <p>
   * Setter method for the COM property "ISOColor"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(236)
  void isoColor(
    int retval);


  /**
   * <p>
   * Returns or sets whether received ISO color sequences have any effect
   * </p>
   * <p>
   * Getter method for the COM property "ISOColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(237)
  int isoColor();


  /**
   * <p>
   * Returns or sets the foreground color for the attribute selected
   * </p>
   * <p>
   * Setter method for the COM property "AttributeForeground"
   * </p>
   * @param attr Mandatory short parameter.
   * @param clrIndex Mandatory short parameter.
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(238)
  void attributeForeground(
    short attr,
    short clrIndex);


  /**
   * <p>
   * Returns or sets the foreground color for the attribute selected
   * </p>
   * <p>
   * Getter method for the COM property "AttributeForeground"
   * </p>
   * @param attr Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(239)
  short attributeForeground(
    short attr);


  /**
   * <p>
   * Returns or sets the background color for the attribute selected
   * </p>
   * <p>
   * Setter method for the COM property "AttributeBackground"
   * </p>
   * @param attr Mandatory short parameter.
   * @param clrIndex Mandatory short parameter.
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(240)
  void attributeBackground(
    short attr,
    short clrIndex);


  /**
   * <p>
   * Returns or sets the background color for the attribute selected
   * </p>
   * <p>
   * Getter method for the COM property "AttributeBackground"
   * </p>
   * @param attr Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(241)
  short attributeBackground(
    short attr);


  /**
   * <p>
   * Returns or sets whether to give EXTRA! exact control over the colors it displays
   * </p>
   * <p>
   * Setter method for the COM property "UseExactColors"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(242)
  void useExactColors(
    int retval);


  /**
   * <p>
   * Returns or sets whether to give EXTRA! exact control over the colors it displays
   * </p>
   * <p>
   * Getter method for the COM property "UseExactColors"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(243)
  int useExactColors();


  /**
   * <p>
   * Returns or sets whether to prevent the host from changing colors
   * </p>
   * <p>
   * Setter method for the COM property "LockUserColors"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(244)
  void lockUserColors(
    int retval);


  /**
   * <p>
   * Returns or sets whether to prevent the host from changing colors
   * </p>
   * <p>
   * Getter method for the COM property "LockUserColors"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(245)
  int lockUserColors();


  /**
   * <p>
   * Returns or sets the location at which you want tab stops
   * </p>
   * <p>
   * Setter method for the COM property "TabsColumns"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(246)
  void tabsColumns(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the location at which you want tab stops
   * </p>
   * <p>
   * Getter method for the COM property "TabsColumns"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(247)
  java.lang.String tabsColumns();


  /**
   * <p>
   * Sets the RGB value for the color index
   * </p>
   * <p>
   * Setter method for the COM property "Color"
   * </p>
   * @param clrIndex Mandatory short parameter.
   * @param rgb Mandatory int parameter.
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(248)
  void color(
    short clrIndex,
    int rgb);


  /**
   * <p>
   * Sets the RGB value for the color index
   * </p>
   * <p>
   * Getter method for the COM property "Color"
   * </p>
   * @param clrIndex Mandatory short parameter.
   * @return  Returns a value of type int
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(249)
  int color(
    short clrIndex);


  /**
   * <p>
   * Clear all the user-defined keys value
   * </p>
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(250)
  void udkClear();


  /**
   * <p>
   * Reset colors to the factory colors
   * </p>
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(251)
  void resetColors();


  /**
   * <p>
   * Resets tab stop settings to the default of 8 column intervals
   * </p>
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(252)
  void resetTabs();


  // Properties:
}
