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
 * Provides access to a defined area of the screen
 */
@IID("{0A0F3722-9F5C-11CE-ADDE-0000C02F4A7A}")
public interface Area extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Returns or sets the text in the Area
   * </p>
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  java.lang.String value();


  /**
   * <p>
   * Returns or sets the text in the Area
   * </p>
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
  void value(
    java.lang.String retval);


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
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Returns or sets the ending row of the Area object
   * </p>
   * <p>
   * Getter method for the COM property "Bottom"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  short bottom();


  /**
   * <p>
   * Returns or sets the ending row of the Area object
   * </p>
   * <p>
   * Setter method for the COM property "Bottom"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  void bottom(
    short retval);


  /**
   * <p>
   * Returns or sets the screen column where the area begins
   * </p>
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  short left();


  /**
   * <p>
   * Returns or sets the screen column where the area begins
   * </p>
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  void left(
    short retval);


  /**
   * <p>
   * Returns the parent of the object
   * </p>
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Returns or sets the column where the Area ends
   * </p>
   * <p>
   * Getter method for the COM property "Right"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  short right();


  /**
   * <p>
   * Returns or sets the column where the Area ends
   * </p>
   * <p>
   * Setter method for the COM property "Right"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  void right(
    short retval);


  /**
   * <p>
   * Returns or sets the row where the Area begins
   * </p>
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  short top();


  /**
   * <p>
   * Returns or sets the row where the Area begins
   * </p>
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  void top(
    short retval);


  /**
   * <p>
   * Determines how the top, left, bottom, right coordinates are interpreted when the Area is selected
   * </p>
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  short type();


  /**
   * <p>
   * Returns or sets the page of the Area object for VT emulation
   * </p>
   * <p>
   * Getter method for the COM property "Page"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(20)
  short page();


  /**
   * <p>
   * Returns or sets the page of the Area object for VT emulation
   * </p>
   * <p>
   * Setter method for the COM property "Page"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(21)
  void page(
    short retval);


  /**
   * <p>
   * Copies the current selection to the Clipboard
   * </p>
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(22)
  void copy();


  /**
   * <p>
   * Cuts the current selection to the Clipboard
   * </p>
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(23)
  void cut();


  /**
   * <p>
   * Pastes Clipboard text into the Area
   * </p>
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(24)
  void paste();


  /**
   * <p>
   * Selects the Area
   * </p>
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(25)
  void select();


  /**
   * <p>
   * Deletes the current selection
   * </p>
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(26)
  void delete();


  /**
   * <p>
   * Waits until the area text has changed
   * </p>
   * @param timeout Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(27)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject waitUntilChanged(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object timeout);


  // Properties:
}
