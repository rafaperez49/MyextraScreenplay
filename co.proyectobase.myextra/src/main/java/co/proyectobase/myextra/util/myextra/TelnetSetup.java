package co.proyectobase.myextra.util.myextra  ;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.DefaultMethod;
import com4j.IID;
import com4j.NativeType;
import com4j.ReturnValue;
import com4j.VTID;

/**
 * Provides access to the Telnet Setup options
 */
@IID("{8E91CFFE-8EBC-11CE-A16C-10005A6155B5}")
public interface TelnetSetup extends Com4jObject {
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
   * Returns or sets the name of the host
   * </p>
   * <p>
   * Setter method for the COM property "HostName"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  void hostName(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the name of the host
   * </p>
   * <p>
   * Getter method for the COM property "HostName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String hostName();


  /**
   * <p>
   * Returns or sets whether to prompt for the host name when attempting connection
   * </p>
   * <p>
   * Setter method for the COM property "PromptHost"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  void promptHost(
    int retval);


  /**
   * <p>
   * Returns or sets whether to prompt for the host name when attempting connection
   * </p>
   * <p>
   * Getter method for the COM property "PromptHost"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  int promptHost();


  /**
   * <p>
   * Returns or sets the type of terminal to use
   * </p>
   * <p>
   * Setter method for the COM property "TerminalType"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  void terminalType(
    short retval);


  /**
   * <p>
   * Returns or sets the type of terminal to use
   * </p>
   * <p>
   * Getter method for the COM property "TerminalType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  short terminalType();


  /**
   * <p>
   * Returns or sets the name of customer terminal type to use during negotiation
   * </p>
   * <p>
   * Setter method for the COM property "CustomType"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  void customType(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the name of customer terminal type to use during negotiation
   * </p>
   * <p>
   * Getter method for the COM property "CustomType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String customType();


  /**
   * <p>
   * Returns or sets the host's telnet port
   * </p>
   * <p>
   * Setter method for the COM property "Port"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  void port(
    int retval);


  /**
   * <p>
   * Returns or sets the host's telnet port
   * </p>
   * <p>
   * Getter method for the COM property "Port"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  int port();


  /**
   * <p>
   * Returns or sets how to send a new line signal
   * </p>
   * <p>
   * Setter method for the COM property "PairCRWithLF"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  void pairCRWithLF(
    int retval);


  /**
   * <p>
   * Returns or sets how to send a new line signal
   * </p>
   * <p>
   * Getter method for the COM property "PairCRWithLF"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(20)
  int pairCRWithLF();


  /**
   * <p>
   * Returns or sets whether to configure negotiation of 7 or 8 bit communication
   * </p>
   * <p>
   * Setter method for the COM property "InitiateNegotiation"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  void initiateNegotiation(
    int retval);


  /**
   * <p>
   * Returns or sets whether to configure negotiation of 7 or 8 bit communication
   * </p>
   * <p>
   * Getter method for the COM property "InitiateNegotiation"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(22)
  int initiateNegotiation();


  /**
   * <p>
   * Returns or sets the number data bits for each character
   * </p>
   * <p>
   * Setter method for the COM property "DataBits"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  void dataBits(
    short retval);


  /**
   * <p>
   * Returns or sets the number data bits for each character
   * </p>
   * <p>
   * Getter method for the COM property "DataBits"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(24)
  short dataBits();


  /**
   * <p>
   * Returns or sets whether to negotiate the window size
   * </p>
   * <p>
   * Setter method for the COM property "WindowSizeOption"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
  void windowSizeOption(
    int retval);


  /**
   * <p>
   * Returns or sets whether to negotiate the window size
   * </p>
   * <p>
   * Getter method for the COM property "WindowSizeOption"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(26)
  int windowSizeOption();


  /**
   * <p>
   * Returns or sets whether to close connection upon disconnection
   * </p>
   * <p>
   * Setter method for the COM property "CloseOnDisconnect"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(27)
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

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(28)
  int closeOnDisconnect();


  /**
   * <p>
   * Returns or sets whether to verify SSL destination
   * </p>
   * <p>
   * Setter method for the COM property "VerifySSLDestination"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(29)
  void verifySSLDestination(
    int retval);


  /**
   * <p>
   * Returns or sets whether to verify SSL destination
   * </p>
   * <p>
   * Getter method for the COM property "VerifySSLDestination"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(30)
  int verifySSLDestination();


  /**
   * <p>
   * Returns or sets which type of proxy to use
   * </p>
   * <p>
   * Setter method for the COM property "ProxyType"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(31)
  void proxyType(
    short retval);


  /**
   * <p>
   * Returns or sets which type of proxy to use
   * </p>
   * <p>
   * Getter method for the COM property "ProxyType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(32)
  short proxyType();


  /**
   * <p>
   * Returns or sets the telnet proxy adddress
   * </p>
   * <p>
   * Setter method for the COM property "TelnetProxyAddress"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(33)
  void telnetProxyAddress(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the telnet proxy adddress
   * </p>
   * <p>
   * Getter method for the COM property "TelnetProxyAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(34)
  java.lang.String telnetProxyAddress();


  /**
   * <p>
   * Returns or sets the number of the telnet proxy port
   * </p>
   * <p>
   * Setter method for the COM property "TelnetProxyPort"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(35)
  void telnetProxyPort(
    int retval);


  /**
   * <p>
   * Returns or sets the number of the telnet proxy port
   * </p>
   * <p>
   * Getter method for the COM property "TelnetProxyPort"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(36)
  int telnetProxyPort();


  /**
   * <p>
   * Returns or sets the telnet command
   * </p>
   * <p>
   * Setter method for the COM property "TelnetCommand"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(37)
  void telnetCommand(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the telnet command
   * </p>
   * <p>
   * Getter method for the COM property "TelnetCommand"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(38)
  java.lang.String telnetCommand();


  /**
   * <p>
   * Returns or sets the SOCKS proxy address
   * </p>
   * <p>
   * Setter method for the COM property "SOCKSProxyAddress"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(39)
  void socksProxyAddress(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the SOCKS proxy address
   * </p>
   * <p>
   * Getter method for the COM property "SOCKSProxyAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(40)
  java.lang.String socksProxyAddress();


  /**
   * <p>
   * Returns or sets the number of the SOCKS proxy port
   * </p>
   * <p>
   * Setter method for the COM property "SOCKSProxyPort"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(41)
  void socksProxyPort(
    int retval);


  /**
   * <p>
   * Returns or sets the number of the SOCKS proxy port
   * </p>
   * <p>
   * Getter method for the COM property "SOCKSProxyPort"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(42)
  int socksProxyPort();


  /**
   * <p>
   * Returns or sets the user id
   * </p>
   * <p>
   * Setter method for the COM property "SSHUserID"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(43)
  void sshUserID(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the user id
   * </p>
   * <p>
   * Getter method for the COM property "SSHUserID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(44)
  java.lang.String sshUserID();


  /**
   * <p>
   * Returns or sets the password
   * </p>
   * <p>
   * Setter method for the COM property "SSHUserPassword"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(45)
  void sshUserPassword(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the password
   * </p>
   * <p>
   * Getter method for the COM property "SSHUserPassword"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(46)
  java.lang.String sshUserPassword();


  /**
   * <p>
   * Returns or sets the privatekey
   * </p>
   * <p>
   * Setter method for the COM property "SSHUserPrivateKey"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(47)
  void sshUserPrivateKey(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the privatekey
   * </p>
   * <p>
   * Getter method for the COM property "SSHUserPrivateKey"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(48)
  java.lang.String sshUserPrivateKey();


  /**
   * <p>
   * Returns or sets the passphrase for the privatekey
   * </p>
   * <p>
   * Setter method for the COM property "SSHUserPassphrase"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(49)
  void sshUserPassphrase(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the passphrase for the privatekey
   * </p>
   * <p>
   * Getter method for the COM property "SSHUserPassphrase"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(50)
  java.lang.String sshUserPassphrase();


  // Properties:
}
