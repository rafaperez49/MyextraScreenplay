package co.proyectobase.myextra.util.myextra  ;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.DefaultMethod;
import com4j.IID;
import com4j.NativeType;
import com4j.ReturnValue;
import com4j.VTID;

/**
 * Provides access to the Kermit configuration options
 */
@IID("{4E91CFFE-8EBC-11CE-A16C-10005A6155B1}")
public interface KermitOptions extends Com4jObject {
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
   * Returns or sets a macro that contains the commands to tell the host to start receiving files
   * </p>
   * <p>
   * Setter method for the COM property "StartHostReceiving"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  void startHostReceiving(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets a macro that contains the commands to tell the host to start receiving files
   * </p>
   * <p>
   * Getter method for the COM property "StartHostReceiving"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String startHostReceiving();


  /**
   * <p>
   * Returns or sets a macro that contains the commands to tell the host to start sending files
   * </p>
   * <p>
   * Setter method for the COM property "StartHostSending"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  void startHostSending(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets a macro that contains the commands to tell the host to start sending files
   * </p>
   * <p>
   * Getter method for the COM property "StartHostSending"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String startHostSending();


  /**
   * <p>
   * Returns or sets a macro that contains the commands to tell the host what to do when transmission completes
   * </p>
   * <p>
   * Setter method for the COM property "QuitHostServer"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  void quitHostServer(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets a macro that contains the commands to tell the host what to do when transmission completes
   * </p>
   * <p>
   * Getter method for the COM property "QuitHostServer"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String quitHostServer();


  /**
   * <p>
   * Returns or sets the type of remote Kermit to which you will connect
   * </p>
   * <p>
   * Setter method for the COM property "RemoteKermit"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  void remoteKermit(
    short retval);


  /**
   * <p>
   * Returns or sets the type of remote Kermit to which you will connect
   * </p>
   * <p>
   * Getter method for the COM property "RemoteKermit"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  short remoteKermit();


  /**
   * <p>
   * Returns or sets the type of error detection to use on a transmit
   * </p>
   * <p>
   * Setter method for the COM property "BlockCheck"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  void blockCheck(
    short retval);


  /**
   * <p>
   * Returns or sets the type of error detection to use on a transmit
   * </p>
   * <p>
   * Getter method for the COM property "BlockCheck"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  short blockCheck();


  /**
   * <p>
   * Returns or sets the maximum size for received packets
   * </p>
   * <p>
   * Setter method for the COM property "RxPacketLength"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  void rxPacketLength(
    int retval);


  /**
   * <p>
   * Returns or sets the maximum size for received packets
   * </p>
   * <p>
   * Getter method for the COM property "RxPacketLength"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(20)
  int rxPacketLength();


  /**
   * <p>
   * Returns or sets the maximum size for transmitted packets
   * </p>
   * <p>
   * Setter method for the COM property "TxPacketMaxLength"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  void txPacketMaxLength(
    int retval);


  /**
   * <p>
   * Returns or sets the maximum size for transmitted packets
   * </p>
   * <p>
   * Getter method for the COM property "TxPacketMaxLength"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(22)
  int txPacketMaxLength();


  /**
   * <p>
   * Returns or sets the maximum number of unacknowledged packets
   * </p>
   * <p>
   * Setter method for the COM property "WindowRequest"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  void windowRequest(
    int retval);


  /**
   * <p>
   * Returns or sets the maximum number of unacknowledged packets
   * </p>
   * <p>
   * Getter method for the COM property "WindowRequest"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(24)
  int windowRequest();


  /**
   * <p>
   * Returns or sets the character to use as received packet start character
   * </p>
   * <p>
   * Setter method for the COM property "RxPacketStartCharacter"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
  void rxPacketStartCharacter(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the character to use as received packet start character
   * </p>
   * <p>
   * Getter method for the COM property "RxPacketStartCharacter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String rxPacketStartCharacter();


  /**
   * <p>
   * Returns or sets the character to use as packet start character
   * </p>
   * <p>
   * Setter method for the COM property "TxPacketStartCharacter"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(27)
  void txPacketStartCharacter(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the character to use as packet start character
   * </p>
   * <p>
   * Getter method for the COM property "TxPacketStartCharacter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(28)
  java.lang.String txPacketStartCharacter();


  /**
   * <p>
   * Returns or sets whether to use a packet end character
   * </p>
   * <p>
   * Setter method for the COM property "EnableTxPacketEndCharacter"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(29)
  void enableTxPacketEndCharacter(
    int retval);


  /**
   * <p>
   * Returns or sets whether to use a packet end character
   * </p>
   * <p>
   * Getter method for the COM property "EnableTxPacketEndCharacter"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(30)
  int enableTxPacketEndCharacter();


  /**
   * <p>
   * Returns or sets the character to use as packet end character
   * </p>
   * <p>
   * Setter method for the COM property "TxPacketEndCharacter"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(31)
  void txPacketEndCharacter(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the character to use as packet end character
   * </p>
   * <p>
   * Getter method for the COM property "TxPacketEndCharacter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(32)
  java.lang.String txPacketEndCharacter();


  /**
   * <p>
   * Returns or sets how long to wait to receive a packet before issuing a time out
   * </p>
   * <p>
   * Setter method for the COM property "RxTimeoutInSeconds"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(33)
  void rxTimeoutInSeconds(
    int retval);


  /**
   * <p>
   * Returns or sets how long to wait to receive a packet before issuing a time out
   * </p>
   * <p>
   * Getter method for the COM property "RxTimeoutInSeconds"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(34)
  int rxTimeoutInSeconds();


  /**
   * <p>
   * Returns or sets how long to wait for host to transmit a packet before issuing a time out
   * </p>
   * <p>
   * Setter method for the COM property "TxTimeoutInSeconds"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(35)
  void txTimeoutInSeconds(
    int retval);


  /**
   * <p>
   * Returns or sets how long to wait for host to transmit a packet before issuing a time out
   * </p>
   * <p>
   * Getter method for the COM property "TxTimeoutInSeconds"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(36)
  int txTimeoutInSeconds();


  /**
   * <p>
   * Returns or sets how many consecutive errors to allow on the same packet before aborting the transfer
   * </p>
   * <p>
   * Setter method for the COM property "ErrorRetryLimit"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(37)
  void errorRetryLimit(
    int retval);


  /**
   * <p>
   * Returns or sets how many consecutive errors to allow on the same packet before aborting the transfer
   * </p>
   * <p>
   * Getter method for the COM property "ErrorRetryLimit"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(38)
  int errorRetryLimit();


  /**
   * <p>
   * Returns or sets the printable character to use as the prefix for printable control character sequences
   * </p>
   * <p>
   * Setter method for the COM property "ControlQuoteCharacter"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(39)
  void controlQuoteCharacter(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the printable character to use as the prefix for printable control character sequences
   * </p>
   * <p>
   * Getter method for the COM property "ControlQuoteCharacter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(40)
  java.lang.String controlQuoteCharacter();


  /**
   * <p>
   * Returns or sets whether to use a special character to let 8-bit data pass through a 7-bit communications channel
   * </p>
   * <p>
   * Setter method for the COM property "Enable8thBitQuoting"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(41)
  void enable8thBitQuoting(
    int retval);


  /**
   * <p>
   * Returns or sets whether to use a special character to let 8-bit data pass through a 7-bit communications channel
   * </p>
   * <p>
   * Getter method for the COM property "Enable8thBitQuoting"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(42)
  int enable8thBitQuoting();


  /**
   * <p>
   * Returns or sets the character to use as 8 bit quote character
   * </p>
   * <p>
   * Setter method for the COM property "EightBitQuoteCharacter"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(43)
  void eightBitQuoteCharacter(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the character to use as 8 bit quote character
   * </p>
   * <p>
   * Getter method for the COM property "EightBitQuoteCharacter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(44)
  java.lang.String eightBitQuoteCharacter();


  /**
   * <p>
   * Returns or sets whether to use a special compression character
   * </p>
   * <p>
   * Setter method for the COM property "EnableCompression"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(45)
  void enableCompression(
    int retval);


  /**
   * <p>
   * Returns or sets whether to use a special compression character
   * </p>
   * <p>
   * Getter method for the COM property "EnableCompression"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(46)
  int enableCompression();


  /**
   * <p>
   * Returns or sets the character to use as special compression character
   * </p>
   * <p>
   * Setter method for the COM property "CompressionCharacter"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(47)
  void compressionCharacter(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the character to use as special compression character
   * </p>
   * <p>
   * Getter method for the COM property "CompressionCharacter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(48)
  java.lang.String compressionCharacter();


  /**
   * <p>
   * Returns or sets the character to send before sending first character of packet
   * </p>
   * <p>
   * Setter method for the COM property "PadCharacter"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(49)
  void padCharacter(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the character to send before sending first character of packet
   * </p>
   * <p>
   * Getter method for the COM property "PadCharacter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(50)
  java.lang.String padCharacter();


  /**
   * <p>
   * Returns or sets the number of pad character to send
   * </p>
   * <p>
   * Setter method for the COM property "PadCharacterCount"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(51)
  void padCharacterCount(
    int retval);


  /**
   * <p>
   * Returns or sets the number of pad character to send
   * </p>
   * <p>
   * Getter method for the COM property "PadCharacterCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(52)
  int padCharacterCount();


  /**
   * <p>
   * Returns or sets whether to use attribute packets
   * </p>
   * <p>
   * Setter method for the COM property "AttributePackets"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(53)
  void attributePackets(
    int retval);


  /**
   * <p>
   * Returns or sets whether to use attribute packets
   * </p>
   * <p>
   * Getter method for the COM property "AttributePackets"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(54)
  int attributePackets();


  // Properties:
}
