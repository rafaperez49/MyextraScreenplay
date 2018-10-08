package co.proyectobase.myextra.util.myextra  ;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.DefaultMethod;
import com4j.IID;
import com4j.NativeType;
import com4j.ReturnValue;
import com4j.VTID;

/**
 * Provides access to the Connectivity configuration options
 */
@IID("{6E91CFFE-8EBC-11CE-A16C-10005A6155B3}")
public interface Connectivity extends Com4jObject {
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
   * Returns or sets the communication method to use
   * </p>
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  void type(
    short retval);


  /**
   * <p>
   * Returns or sets the communication method to use
   * </p>
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  short type();


  /**
   * <p>
   * Returns the SerialSetup object associated with the Connectivity object
   * </p>
   * <p>
   * Getter method for the COM property "SerialSetup"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject serialSetup();


  /**
   * <p>
   * Returns the TelnetSetup object associated with the Connectivity object
   * </p>
   * <p>
   * Getter method for the COM property "TelnetSetup"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject telnetSetup();


  /**
   * <p>
   * Returns the ModemSetup object associated with the Connectivity object
   * </p>
   * <p>
   * Getter method for the COM property "ModemSetup"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject modemSetup();


  /**
   * <p>
   * Returns or sets the communication port to use
   * </p>
   * <p>
   * Setter method for the COM property "Port"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(14)
  void port(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the communication port to use
   * </p>
   * <p>
   * Getter method for the COM property "Port"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String port();


  // Properties:
}
