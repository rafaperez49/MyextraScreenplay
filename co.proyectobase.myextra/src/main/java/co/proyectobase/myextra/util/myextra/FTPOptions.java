package co.proyectobase.myextra.util.myextra  ;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.DefaultMethod;
import com4j.IID;
import com4j.NativeType;
import com4j.ReturnValue;
import com4j.VTID;

/**
 * Provides access to the FTP configuration options
 */
@IID("{3E91CFFE-8EBC-11CE-A16C-10005A6155B0}")
public interface FTPOptions extends Com4jObject {
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
   * Returns or sets the name of host to which you want to connect
   * </p>
   * <p>
   * Setter method for the COM property "Host"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  void host(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the name of host to which you want to connect
   * </p>
   * <p>
   * Getter method for the COM property "Host"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String host();


  /**
   * <p>
   * Returns or sets your user name
   * </p>
   * <p>
   * Setter method for the COM property "Userid"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  void userid(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets your user name
   * </p>
   * <p>
   * Getter method for the COM property "Userid"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String userid();


  /**
   * <p>
   * Returns or sets your password
   * </p>
   * <p>
   * Setter method for the COM property "Password"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  void password(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets your password
   * </p>
   * <p>
   * Getter method for the COM property "Password"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String password();


  /**
   * <p>
   * Returns or sets your account name if required by the host
   * </p>
   * <p>
   * Setter method for the COM property "Account"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  void account(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets your account name if required by the host
   * </p>
   * <p>
   * Getter method for the COM property "Account"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String account();


  /**
   * <p>
   * Returns or sets a port number if other than the default 21
   * </p>
   * <p>
   * Setter method for the COM property "FTPPort"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  void ftpPort(
    int retval);


  /**
   * <p>
   * Returns or sets a port number if other than the default 21
   * </p>
   * <p>
   * Getter method for the COM property "FTPPort"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  int ftpPort();


  /**
   * <p>
   * Returns or sets whether FTP data connection is established by the client or by the server
   * </p>
   * <p>
   * Setter method for the COM property "PassiveMode"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  void passiveMode(
    int retval);


  /**
   * <p>
   * Returns or sets whether FTP data connection is established by the client or by the server
   * </p>
   * <p>
   * Getter method for the COM property "PassiveMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(20)
  int passiveMode();


  /**
   * <p>
   * Returns or sets whether to prompt for host when connecting
   * </p>
   * <p>
   * Setter method for the COM property "PromptHost"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  void promptHost(
    int retval);


  /**
   * <p>
   * Returns or sets whether to prompt for host when connecting
   * </p>
   * <p>
   * Getter method for the COM property "PromptHost"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(22)
  int promptHost();


  /**
   * <p>
   * Returns or sets the type of proxy to use
   * </p>
   * <p>
   * Setter method for the COM property "ProxyType"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  void proxyType(
    short retval);


  /**
   * <p>
   * Returns or sets the type of proxy to use
   * </p>
   * <p>
   * Getter method for the COM property "ProxyType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(24)
  short proxyType();


  /**
   * <p>
   * Returns or sets the the FTP proxy address
   * </p>
   * <p>
   * Setter method for the COM property "FTPProxyAddress"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
  void ftpProxyAddress(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the the FTP proxy address
   * </p>
   * <p>
   * Getter method for the COM property "FTPProxyAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String ftpProxyAddress();


  /**
   * <p>
   * Returns or sets the the number of the FTP proxy port
   * </p>
   * <p>
   * Setter method for the COM property "FTPProxyPort"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(27)
  void ftpProxyPort(
    int retval);


  /**
   * <p>
   * Returns or sets the the number of the FTP proxy port
   * </p>
   * <p>
   * Getter method for the COM property "FTPProxyPort"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(28)
  int ftpProxyPort();


  /**
   * <p>
   * Returns or sets the the SOCKS proxy address
   * </p>
   * <p>
   * Setter method for the COM property "SOCKSProxyAddress"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(29)
  void socksProxyAddress(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the the SOCKS proxy address
   * </p>
   * <p>
   * Getter method for the COM property "SOCKSProxyAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(30)
  java.lang.String socksProxyAddress();


  /**
   * <p>
   * Returns or sets the the number of SOCKS proxy port
   * </p>
   * <p>
   * Setter method for the COM property "SOCKSProxyPort"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(31)
  void socksProxyPort(
    int retval);


  /**
   * <p>
   * Returns or sets the the number of SOCKS proxy port
   * </p>
   * <p>
   * Getter method for the COM property "SOCKSProxyPort"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(32)
  int socksProxyPort();


  // Properties:
}
