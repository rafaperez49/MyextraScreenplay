package co.proyectobase.myextra.util.myextra  ;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.DefaultMethod;
import com4j.IID;
import com4j.NativeType;
import com4j.ReturnValue;
import com4j.VTID;

/**
 * Provides access to the Zmodem configuration options
 */
@IID("{5E91CFFE-8EBC-11CE-A16C-10005A6155B2}")
public interface ZmodemOptions extends Com4jObject {
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
   * Returns or sets the amount of data to send between error checks
   * </p>
   * <p>
   * Setter method for the COM property "PacketSize"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  void packetSize(
    short retval);


  /**
   * <p>
   * Returns or sets the amount of data to send between error checks
   * </p>
   * <p>
   * Getter method for the COM property "PacketSize"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  short packetSize();


  /**
   * <p>
   * Returns or sets how many consecutive errors to allow on the same packet before aborting the transfer
   * </p>
   * <p>
   * Setter method for the COM property "MaximumErrors"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  void maximumErrors(
    short retval);


  /**
   * <p>
   * Returns or sets how many consecutive errors to allow on the same packet before aborting the transfer
   * </p>
   * <p>
   * Getter method for the COM property "MaximumErrors"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  short maximumErrors();


  /**
   * <p>
   * Returns or sets whether to start receiving files after receiving a special Zmodem code
   * </p>
   * <p>
   * Setter method for the COM property "AutoStart"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  void autoStart(
    int retval);


  /**
   * <p>
   * Returns or sets whether to start receiving files after receiving a special Zmodem code
   * </p>
   * <p>
   * Getter method for the COM property "AutoStart"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  int autoStart();


  /**
   * <p>
   * Returns or sets whether to compare the received file size with the file size information supplied by the host
   * </p>
   * <p>
   * Setter method for the COM property "CheckFileSize"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  void checkFileSize(
    int retval);


  /**
   * <p>
   * Returns or sets whether to compare the received file size with the file size information supplied by the host
   * </p>
   * <p>
   * Getter method for the COM property "CheckFileSize"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  int checkFileSize();


  // Properties:
}
