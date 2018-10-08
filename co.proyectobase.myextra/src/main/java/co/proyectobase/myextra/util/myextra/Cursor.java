package co.proyectobase.myextra.util.myextra  ;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.DefaultMethod;
import com4j.IID;
import com4j.NativeType;
import com4j.ReturnValue;
import com4j.VTID;

/**
 * Provides access to the cursor configuration options
 */
@IID("{2E91CFFE-8EBC-11CE-A16C-10005A6155A9}")
public interface Cursor extends Com4jObject {
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
   * Returns or sets whether to display cursor
   * </p>
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  void visible(
    int retval);


  /**
   * <p>
   * Returns or sets whether to display cursor
   * </p>
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  int visible();


  /**
   * <p>
   * Returns or sets whether to display blovk or underline cursor
   * </p>
   * <p>
   * Setter method for the COM property "Block"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  void block(
    int retval);


  /**
   * <p>
   * Returns or sets whether to display blovk or underline cursor
   * </p>
   * <p>
   * Getter method for the COM property "Block"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  int block();


  /**
   * <p>
   * Returns or sets whether to display blinking or steady cursor
   * </p>
   * <p>
   * Setter method for the COM property "Blink"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  void blink(
    int retval);


  /**
   * <p>
   * Returns or sets whether to display blinking or steady cursor
   * </p>
   * <p>
   * Getter method for the COM property "Blink"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  int blink();


  // Properties:
}
