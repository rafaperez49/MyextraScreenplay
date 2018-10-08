package co.proyectobase.myextra.util.myextra  ;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.DefaultMethod;
import com4j.IID;
import com4j.NativeType;
import com4j.ReturnValue;
import com4j.VTID;

/**
 * Provides access to the Modem Setup options
 */
@IID("{9E91CFFE-8EBC-11CE-A16C-10005A6155B6}")
public interface ModemSetup extends Com4jObject {
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
   * Returns or sets your modem type
   * </p>
   * <p>
   * Setter method for the COM property "ModemType"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  void modemType(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets your modem type
   * </p>
   * <p>
   * Getter method for the COM property "ModemType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String modemType();


  /**
   * <p>
   * Returns or sets the country code
   * </p>
   * <p>
   * Setter method for the COM property "CountryCode"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  void countryCode(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the country code
   * </p>
   * <p>
   * Getter method for the COM property "CountryCode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String countryCode();


  /**
   * <p>
   * Returns or sets the are code
   * </p>
   * <p>
   * Setter method for the COM property "AreaCode"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  void areaCode(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the are code
   * </p>
   * <p>
   * Getter method for the COM property "AreaCode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String areaCode();


  /**
   * <p>
   * Returns or sets the number you want to dial
   * </p>
   * <p>
   * Setter method for the COM property "PhoneNumber"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  void phoneNumber(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the number you want to dial
   * </p>
   * <p>
   * Getter method for the COM property "PhoneNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String phoneNumber();


  /**
   * <p>
   * Returns or sets whether to use the specified Country and Area Codes
   * </p>
   * <p>
   * Setter method for the COM property "UseCountryCodeAndAreaCode"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  void useCountryCodeAndAreaCode(
    int retval);


  /**
   * <p>
   * Returns or sets whether to use the specified Country and Area Codes
   * </p>
   * <p>
   * Getter method for the COM property "UseCountryCodeAndAreaCode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  int useCountryCodeAndAreaCode();


  /**
   * <p>
   * Returns or sets the maximum number of times to automatically redial the number
   * </p>
   * <p>
   * Setter method for the COM property "MaximumRedials"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  void maximumRedials(
    int retval);


  /**
   * <p>
   * Returns or sets the maximum number of times to automatically redial the number
   * </p>
   * <p>
   * Getter method for the COM property "MaximumRedials"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(20)
  int maximumRedials();


  /**
   * <p>
   * Returns or sets the time interval between dialing attempt
   * </p>
   * <p>
   * Setter method for the COM property "TimeBetweenRedials"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  void timeBetweenRedials(
    short retval);


  /**
   * <p>
   * Returns or sets the time interval between dialing attempt
   * </p>
   * <p>
   * Getter method for the COM property "TimeBetweenRedials"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(22)
  short timeBetweenRedials();


  /**
   * <p>
   * Returns or sets how much data can accumulate in the receive buffer before sending an Xoff requesting the host to stop sending data
   * </p>
   * <p>
   * Setter method for the COM property "ReceiveXoffPoint"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  void receiveXoffPoint(
    short retval);


  /**
   * <p>
   * Returns or sets how much data can accumulate in the receive buffer before sending an Xoff requesting the host to stop sending data
   * </p>
   * <p>
   * Getter method for the COM property "ReceiveXoffPoint"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(24)
  short receiveXoffPoint();


  /**
   * <p>
   * Returns or sets the rate at which to send data to the host
   * </p>
   * <p>
   * Setter method for the COM property "Speed"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
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

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(26)
  short speed();


  /**
   * <p>
   * Returns or sets the action to take if buffer becomes too full to receive
   * </p>
   * <p>
   * Setter method for the COM property "FlowControl"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(27)
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

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(28)
  short flowControl();


  /**
   * <p>
   * Returns or sets the number of bits for each character
   * </p>
   * <p>
   * Setter method for the COM property "DataBits"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(29)
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

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(30)
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

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(31)
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

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(32)
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

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(33)
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

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(34)
  short parity();


  /**
   * <p>
   * Returns or sets how much data can accumulate in the receive buffer
   * </p>
   * <p>
   * Setter method for the COM property "ReceiveBuffer"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(35)
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

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(36)
  short receiveBuffer();


  /**
   * <p>
   * Returns or sets how much data can accumulate in the send buffer before transmission stops
   * </p>
   * <p>
   * Setter method for the COM property "TransmitBuffer"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(37)
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

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(38)
  short transmitBuffer();


  /**
   * <p>
   * Returns or sets the time in miliseconds for the communication line break signal
   * </p>
   * <p>
   * Setter method for the COM property "BreakLength"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(39)
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

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(40)
  short breakLength();


  /**
   * <p>
   * Returns or sets whether to close connection upon disconnection
   * </p>
   * <p>
   * Setter method for the COM property "CloseOnDisconnect"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(41)
  void closeOnDisconnect(
    int retval);


  /**
   * <p>
   * Returns or sets whether to close connection upon disconnection
   * </p>
   * <p>
   * Getter method for the COM property "CloseOnDisconnect"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(42)
  int closeOnDisconnect();


  // Properties:
}
