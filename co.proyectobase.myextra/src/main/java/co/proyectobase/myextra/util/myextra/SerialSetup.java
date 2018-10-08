package co.proyectobase.myextra.util.myextra  ;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.DefaultMethod;
import com4j.IID;
import com4j.NativeType;
import com4j.ReturnValue;
import com4j.VTID;

/**
 * Provides access to the Serial Setup options
 */
@IID("{7E91CFFE-8EBC-11CE-A16C-10005A6155B4}")
public interface SerialSetup extends Com4jObject {
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
   * Returns or sets which serial port to use
   * </p>
   * <p>
   * Setter method for the COM property "Port"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  void port(
    short retval);


  /**
   * <p>
   * Returns or sets which serial port to use
   * </p>
   * <p>
   * Getter method for the COM property "Port"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  short port();


  /**
   * <p>
   * Returns or sets the rate at which to send data to the host
   * </p>
   * <p>
   * Setter method for the COM property "Speed"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  void speed(
    short retval);


  /**
   * <p>
   * Returns or sets the rate at which to send data to the host
   * </p>
   * <p>
   * Getter method for the COM property "Speed"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  short speed();


  /**
   * <p>
   * Returns or sets the number of bits for each character
   * </p>
   * <p>
   * Setter method for the COM property "DataBits"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  void dataBits(
    short retval);


  /**
   * <p>
   * Returns or sets the number of bits for each character
   * </p>
   * <p>
   * Getter method for the COM property "DataBits"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  short dataBits();


  /**
   * <p>
   * Returns or sets the time interval between transmitted characters
   * </p>
   * <p>
   * Setter method for the COM property "StopBits"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  void stopBits(
    short retval);


  /**
   * <p>
   * Returns or sets the time interval between transmitted characters
   * </p>
   * <p>
   * Getter method for the COM property "StopBits"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  short stopBits();


  /**
   * <p>
   * Returns or sets the type of error checking
   * </p>
   * <p>
   * Setter method for the COM property "Parity"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  void parity(
    short retval);


  /**
   * <p>
   * Returns or sets the type of error checking
   * </p>
   * <p>
   * Getter method for the COM property "Parity"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  short parity();


  /**
   * <p>
   * Returns or sets the action to take if buffer becomes too full to receive
   * </p>
   * <p>
   * Setter method for the COM property "FlowControl"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  void flowControl(
    short retval);


  /**
   * <p>
   * Returns or sets the action to take if buffer becomes too full to receive
   * </p>
   * <p>
   * Getter method for the COM property "FlowControl"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(20)
  short flowControl();


  /**
   * <p>
   * Returns or sets how much data can accumulate in the receive buffer before sending an Xodd requesting the host to stop sending data
   * </p>
   * <p>
   * Setter method for the COM property "ReceiveXoffPoint"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  void receiveXoffPoint(
    short retval);


  /**
   * <p>
   * Returns or sets how much data can accumulate in the receive buffer before sending an Xodd requesting the host to stop sending data
   * </p>
   * <p>
   * Getter method for the COM property "ReceiveXoffPoint"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(22)
  short receiveXoffPoint();


  /**
   * <p>
   * Returns or sets whether to disconnect on modem signal drop
   * </p>
   * <p>
   * Setter method for the COM property "ModemDisconnect"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  void modemDisconnect(
    int retval);


  /**
   * <p>
   * Returns or sets whether to disconnect on modem signal drop
   * </p>
   * <p>
   * Getter method for the COM property "ModemDisconnect"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(24)
  int modemDisconnect();


  /**
   * <p>
   * Returns or sets whether to disconnect when you exit
   * </p>
   * <p>
   * Setter method for the COM property "DisconnectOnExit"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
  void disconnectOnExit(
    int retval);


  /**
   * <p>
   * Returns or sets whether to disconnect when you exit
   * </p>
   * <p>
   * Getter method for the COM property "DisconnectOnExit"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(26)
  int disconnectOnExit();


  /**
   * <p>
   * Returns or sets how much data can accumulate in the send buffer before transmission stops
   * </p>
   * <p>
   * Setter method for the COM property "TransmitBuffer"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(27)
  void transmitBuffer(
    short retval);


  /**
   * <p>
   * Returns or sets how much data can accumulate in the send buffer before transmission stops
   * </p>
   * <p>
   * Getter method for the COM property "TransmitBuffer"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(28)
  short transmitBuffer();


  /**
   * <p>
   * Returns or sets how much data can accumulate in the receive buffer
   * </p>
   * <p>
   * Setter method for the COM property "ReceiveBuffer"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(29)
  void receiveBuffer(
    short retval);


  /**
   * <p>
   * Returns or sets how much data can accumulate in the receive buffer
   * </p>
   * <p>
   * Getter method for the COM property "ReceiveBuffer"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(30)
  short receiveBuffer();


  /**
   * <p>
   * Returns or sets the time in miliseconds for the communication line break signal
   * </p>
   * <p>
   * Setter method for the COM property "BreakLength"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(31)
  void breakLength(
    short retval);


  /**
   * <p>
   * Returns or sets the time in miliseconds for the communication line break signal
   * </p>
   * <p>
   * Getter method for the COM property "BreakLength"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(32)
  short breakLength();


  // Properties:
}
