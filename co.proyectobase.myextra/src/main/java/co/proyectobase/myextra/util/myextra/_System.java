package co.proyectobase.myextra.util.myextra  ;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.DefaultMethod;
import com4j.IID;
import com4j.NativeType;
import com4j.Optional;
import com4j.ReturnValue;
import com4j.VTID;

/**
 * Top-level object, providing access to all objects in EXTRA!
 */
@IID("{2E91AFF5-8EBC-11CE-A16C-10005A6155A7}")
public interface _System extends Com4jObject {
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
   * Returns the currently active Session object
   * </p>
   * <p>
   * Getter method for the COM property "ActiveSession"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.Dispatch)
  _Session activeSession();


  /**
   * <p>
   * Returns the System object
   * </p>
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Sets or returns the default location for session files
   * </p>
   * <p>
   * Getter method for the COM property "DefaultFilePath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String defaultFilePath();


  /**
   * <p>
   * Sets or returns the default location for session files
   * </p>
   * <p>
   * Setter method for the COM property "DefaultFilePath"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  void defaultFilePath(
    java.lang.String retval);


  /**
   * <p>
   * Returns a string specifying the path and filename of the EXTRA! executable file
   * </p>
   * <p>
   * Getter method for the COM property "FullName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String fullName();


  /**
   * <p>
   * Returns the parent of the object
   * </p>
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Returns the path of the EXTRA! executable file
   * </p>
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String path();


  /**
   * <p>
   * Returns the Sessions collection
   * </p>
   * <p>
   * Getter method for the COM property "Sessions"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject sessions();


  /**
   * <p>
   * Sets or returns the number of milliseconds used by Wait operations
   * </p>
   * <p>
   * Setter method for the COM property "TimeoutValue"
   * </p>
   * @param lTime Mandatory int parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(16)
  void timeoutValue(
    int lTime);


  /**
   * <p>
   * Sets or returns the number of milliseconds used by Wait operations
   * </p>
   * <p>
   * Getter method for the COM property "TimeoutValue"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(17)
  int timeoutValue();


  /**
   * <p>
   * Returns a string identifying the version of EXTRA!
   * </p>
   * <p>
   * Getter method for the COM property "Version"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String version();


  /**
   * <p>
   * Returns a new Waits collection object
   * </p>
   * <p>
   * Getter method for the COM property "Waits"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject waits();


  /**
   * <p>
   * Returns the session window with input focus
   * </p>
   * <p>
   * Getter method for the COM property "ActiveWindow"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(20)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject activeWindow();


  /**
   * <p>
   * Closes all sessions and EXTRA! programs
   * </p>
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(21)
  void quit();


  /**
   * <p>
   * Starts the Status program
   * </p>
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(22)
  void viewStatus();


  /**
   * <p>
   * Returns a string containing the path of the requested directory
   * </p>
   * @param sessType Mandatory short parameter.
   * @param dirType Mandatory short parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String getDirectory(
    short sessType,
    short dirType);


  /**
   * <p>
   * Returns a string containing the current time
   * </p>
   * @param formatType Optional parameter. Default value is (short) 0
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(24)
  java.lang.String getSystemTime(
    @Optional short formatType);


  // Properties:
}
