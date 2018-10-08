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
 * Provides access to the contents of the host screen's presentation space
 */
@IID("{0A0F3720-9F5C-11CE-ADDE-0000C02F4A7A}")
public interface Screen extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Returns the name of the Screen
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
   * Returns or sets the column position of the cursor
   * </p>
   * <p>
   * Getter method for the COM property "Col"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  short col();


  /**
   * <p>
   * Returns or sets the column position of the cursor
   * </p>
   * <p>
   * Setter method for the COM property "Col"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  void col(
    short retval);


  /**
   * <p>
   * Returns the number of columns in the presentation space
   * </p>
   * <p>
   * Getter method for the COM property "Cols"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  short cols();


  /**
   * <p>
   * Returns the parent of the object
   * </p>
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Returns or sets the row position of the cursor
   * </p>
   * <p>
   * Getter method for the COM property "Row"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(13)
  short row();


  /**
   * <p>
   * Returns or sets the row position of the cursor
   * </p>
   * <p>
   * Setter method for the COM property "Row"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(14)
  void row(
    short retval);


  /**
   * <p>
   * Returns the number of rows in the presentation space
   * </p>
   * <p>
   * Getter method for the COM property "Rows"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(15)
  short rows();


  /**
   * <p>
   * Indicates whether the Screen object has been updated
   * </p>
   * <p>
   * Getter method for the COM property "Updated"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(16)
  int updated();


  /**
   * <p>
   * Returns an Area object currently selected by the user
   * </p>
   * <p>
   * Getter method for the COM property "Selection"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject selection();


  /**
   * <p>
   * Returns an OIA object
   * </p>
   * <p>
   * Getter method for the COM property "OIA"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject oia();


  /**
   * <p>
   * Getter method for the COM property "InHiddenField"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
  @VTID(19)
  short inHiddenField();


  /**
   * <p>
   * Returns or sets the synchronous property
   * </p>
   * <p>
   * Getter method for the COM property "Synchronous"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(46) //= 0x2e. The runtime will prefer the VTID if present
  @VTID(20)
  int synchronous();


  /**
   * <p>
   * Returns or sets the synchronous property
   * </p>
   * <p>
   * Setter method for the COM property "Synchronous"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(46) //= 0x2e. The runtime will prefer the VTID if present
  @VTID(21)
  void synchronous(
    int retval);


  /**
   * <p>
   * Returns the page position of the cursor for VT emulation
   * </p>
   * <p>
   * Getter method for the COM property "Page"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(22)
  short page();


  /**
   * <p>
   * Copies the current selection to the Clipboard
   * </p>
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(23)
  void copy();


  /**
   * <p>
   * Cuts the current selection to the Clipboard
   * </p>
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(24)
  void cut();


  /**
   * <p>
   * Deletes the current selection
   * </p>
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(25)
  void delete();


  /**
   * <p>
   * Returns an Area object with the defined coordinates
   * </p>
   * @param row Mandatory short parameter.
   * @param col Mandatory short parameter.
   * @param endRow Mandatory short parameter.
   * @param endCol Mandatory short parameter.
   * @param page Optional parameter. Default value is com4j.Variant.getMissing()
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(26)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject area(
    short row,
    short col,
    short endRow,
    short endCol,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object page,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type);


  /**
   * <p>
   * Returns the text from the specified screen location
   * </p>
   * @param row Optional parameter. Default value is com4j.Variant.getMissing()
   * @param col Optional parameter. Default value is com4j.Variant.getMissing()
   * @param length Optional parameter. Default value is com4j.Variant.getMissing()
   * @param page Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String getString(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object row,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object col,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object length,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object page);


  /**
   * <p>
   * Moves the cursor a specified number of rows and columns
   * </p>
   * @param rows Mandatory short parameter.
   * @param cols Mandatory short parameter.
   * @param page Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(28)
  void moveRelative(
    short rows,
    short cols,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object page);


  /**
   * <p>
   * Moves the cursor to the specified location
   * </p>
   * @param row Mandatory short parameter.
   * @param col Mandatory short parameter.
   * @param page Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(29)
  void moveTo(
    short row,
    short col,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object page);


  /**
   * <p>
   * Pastes Clipboard text at the current position
   * </p>
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(30)
  void paste();


  /**
   * <p>
   * Puts text in the specified location on the screen
   * </p>
   * @param text Mandatory java.lang.String parameter.
   * @param row Optional parameter. Default value is com4j.Variant.getMissing()
   * @param col Optional parameter. Default value is com4j.Variant.getMissing()
   * @param page Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(31)
  void putString(
    java.lang.String text,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object row,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object col,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object page);


  /**
   * <p>
   * Returns an Area object with the text specified in the search
   * </p>
   * @param text Mandatory java.lang.String parameter.
   * @param row Optional parameter. Default value is com4j.Variant.getMissing()
   * @param col Optional parameter. Default value is com4j.Variant.getMissing()
   * @param page Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(32)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject search(
    java.lang.String text,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object row,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object col,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object page);


  /**
   * <p>
   * Returns an Area object as defined by the coordinates
   * </p>
   * @param row Mandatory short parameter.
   * @param col Mandatory short parameter.
   * @param endRow Mandatory short parameter.
   * @param endCol Mandatory short parameter.
   * @param page Optional parameter. Default value is com4j.Variant.getMissing()
   * @param selectMode Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(33)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject select(
    short row,
    short col,
    short endRow,
    short endCol,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object page,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object selectMode);


  /**
   * <p>
   * Selects the entire screen and returns an Area object
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(34)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject selectAll();


  /**
   * <p>
   * Sends the specified text to the Screen object
   * </p>
   * @param text Mandatory java.lang.String parameter.
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(35)
  void sendInput(
    java.lang.String text);


  /**
   * <p>
   * Sends keystrokes to the host
   * </p>
   * @param text Mandatory java.lang.String parameter.
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(36)
  void sendKeys(
    java.lang.String text);


  /**
   * <p>
   * Waits until the cursor is at the specified location
   * </p>
   * @param row Mandatory short parameter.
   * @param col Optional parameter. Default value is com4j.Variant.getMissing()
   * @param endRow Optional parameter. Default value is com4j.Variant.getMissing()
   * @param endCol Optional parameter. Default value is com4j.Variant.getMissing()
   * @param page Optional parameter. Default value is com4j.Variant.getMissing()
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(37)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject waitForCursor(
    short row,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object col,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object endRow,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object endCol,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object page,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type);


  /**
   * <p>
   * Waits until the cursor has moved the specified number of rows and columns
   * </p>
   * @param row Optional parameter. Default value is com4j.Variant.getMissing()
   * @param col Optional parameter. Default value is com4j.Variant.getMissing()
   * @param page Optional parameter. Default value is com4j.Variant.getMissing()
   * @param idle Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(38)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject waitForCursorMove(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object row,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object col,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object page,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object idle);


  /**
   * <p>
   * Waits until the specified text appears in the host data stream
   * </p>
   * @param text Optional parameter. Default value is com4j.Variant.getMissing()
   * @param idle Optional parameter. Default value is com4j.Variant.getMissing()
   * @param timeout Optional parameter. Default value is com4j.Variant.getMissing()
   * @param option Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(39)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject waitForStream(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object text,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object idle,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object timeout,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object option);


  /**
   * <p>
   * Waits until the specified text appears at the specified location
   * </p>
   * @param text Mandatory java.lang.String parameter.
   * @param row Optional parameter. Default value is com4j.Variant.getMissing()
   * @param col Optional parameter. Default value is com4j.Variant.getMissing()
   * @param page Optional parameter. Default value is com4j.Variant.getMissing()
   * @param idle Optional parameter. Default value is com4j.Variant.getMissing()
   * @param timeout Optional parameter. Default value is com4j.Variant.getMissing()
   * @param option Optional parameter. Default value is com4j.Variant.getMissing()
   * @param mode Optional parameter. Default value is com4j.Variant.getMissing()
   * @param endRow Optional parameter. Default value is com4j.Variant.getMissing()
   * @param endCol Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(40)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject waitForString(
    java.lang.String text,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object row,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object col,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object page,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object idle,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object timeout,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object option,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object mode,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object endRow,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object endCol);


  /**
   * <p>
   * Waits for the host to not send data for a specified number of milliseconds
   * </p>
   * @param time Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(41)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject waitHostQuiet(
    @MarshalAs(NativeType.VARIANT) java.lang.Object time);


  /**
   * <p>
   * Waits until the user presses a key
   * </p>
   * @param time Mandatory java.lang.Object parameter.
   * @param keys Optional parameter. Default value is com4j.Variant.getMissing()
   * @param process Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(42)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject waitForKeys(
    @MarshalAs(NativeType.VARIANT) java.lang.Object time,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object keys,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object process);


  /**
   * <p>
   * Cuts and appends the current selection to the Clipboard data
   * </p>
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(43)
  void cutAppend();


  /**
   * <p>
   * Copies and appends the current selection to the Clipboard data
   * </p>
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(44)
  void copyAppend();


  /**
   * <p>
   * Continues to insert more Clipboard data from the previous paste operation
   * </p>
   */

  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
  @VTID(45)
  void pasteContinue();


  /**
   * <p>
   * Returns a HostOptions object
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(44) //= 0x2c. The runtime will prefer the VTID if present
  @VTID(46)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject hostOptions();


  /**
   * <p>
   * Send the specified string to the host
   * </p>
   * @param text Mandatory java.lang.String parameter.
   */

  @DISPID(45) //= 0x2d. The runtime will prefer the VTID if present
  @VTID(47)
  void send(
    java.lang.String text);


  /**
   * <p>
   * This clears display memory and sets all line attributes to normal.
   * </p>
   */

  @DISPID(47) //= 0x2f. The runtime will prefer the VTID if present
  @VTID(48)
  void clearScreen();


  /**
   * <p>
   * Returns the 3270/5250 field attribute for the field containing the specified row and column
   * </p>
   * @param row Mandatory short parameter.
   * @param col Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(48) //= 0x30. The runtime will prefer the VTID if present
  @VTID(49)
  short fieldAttribute(
    short row,
    short col);


  /**
   * <p>
   * Extended Getstring allows client to perform block copies and specify field attributes.
   * </p>
   * @param startRow Mandatory int parameter.
   * @param startCol Mandatory int parameter.
   * @param endRow Mandatory int parameter.
   * @param endCol Mandatory int parameter.
   * @param area Mandatory myextra.ATM_AREA parameter.
   * @param wrap Mandatory myextra.ATM_WRAP parameter.
   * @param attr Mandatory int parameter.
   * @param flags Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(49) //= 0x31. The runtime will prefer the VTID if present
  @VTID(50)
  java.lang.String getStringEx(
    int startRow,
    int startCol,
    int endRow,
    int endCol,
    int attr,
    int flags);


  /**
   * <p>
   * Extended Putstring allows client to paste blocks of data and fill portions of the screen.
   * </p>
   * @param text Mandatory java.lang.String parameter.
   * @param startRow Mandatory int parameter.
   * @param startCol Mandatory int parameter.
   * @param endRow Mandatory int parameter.
   * @param endCol Mandatory int parameter.
   * @param area Mandatory myextra.ATM_AREA parameter.
   * @param wrap Mandatory myextra.ATM_WRAP parameter.
   * @param mode Mandatory myextra.ATM_PUTSTRING parameter.
   * @param fill Mandatory boolean parameter.
   * @return  Returns a value of type int
   */

  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
  @VTID(51)
  int putStringEx(
    java.lang.String text,
    int startRow,
    int startCol,
    int endRow,
    int endCol,
    boolean fill);


  /**
   * <p>
   * Retrieves an Area Object containing position information about the last mouse button event.
   * </p>
   * <p>
   * Getter method for the COM property "LastMouseEvent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(51) //= 0x33. The runtime will prefer the VTID if present
  @VTID(52)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject lastMouseEvent();


  // Properties:
}
