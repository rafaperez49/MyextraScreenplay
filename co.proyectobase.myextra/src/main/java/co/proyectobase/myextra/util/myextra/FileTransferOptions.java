package co.proyectobase.myextra.util.myextra  ;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.DefaultMethod;
import com4j.IID;
import com4j.NativeType;
import com4j.ReturnValue;
import com4j.VTID;

/**
 * Provides access to the file transfer configuration options
 */
@IID("{2E91AFFE-8EBC-11CE-A16C-10005A6155A8}")
public interface FileTransferOptions extends Com4jObject {
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
   * Returns or sets the type of protocol to use fot file transfers
   * </p>
   * <p>
   * Setter method for the COM property "Protocol"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  void protocol(
    short retval);


  /**
   * <p>
   * Returns or sets the type of protocol to use fot file transfers
   * </p>
   * <p>
   * Getter method for the COM property "Protocol"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  short protocol();


  /**
   * <p>
   * Returns or sets how to handle an incoming file with the same name as an existing file in the target directory
   * </p>
   * <p>
   * Setter method for the COM property "DuplicateName"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  void duplicateName(
    short retval);


  /**
   * <p>
   * Returns or sets how to handle an incoming file with the same name as an existing file in the target directory
   * </p>
   * <p>
   * Getter method for the COM property "DuplicateName"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  short duplicateName();


  /**
   * <p>
   * Returns or sets whether to send the path information when transferring the file
   * </p>
   * <p>
   * Setter method for the COM property "SendFullPath"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  void sendFullPath(
    int retval);


  /**
   * <p>
   * Returns or sets whether to send the path information when transferring the file
   * </p>
   * <p>
   * Getter method for the COM property "SendFullPath"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  int sendFullPath();


  /**
   * <p>
   * Returns or sets whether to store the file based on the path supplied by the host, append to the directory in ReceiveTo
   * </p>
   * <p>
   * Setter method for the COM property "UsePath"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  void usePath(
    int retval);


  /**
   * <p>
   * Returns or sets whether to store the file based on the path supplied by the host, append to the directory in ReceiveTo
   * </p>
   * <p>
   * Getter method for the COM property "UsePath"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  int usePath();


  /**
   * <p>
   * Returns or sets whether to create the path to store the file if the directories do not exist
   * </p>
   * <p>
   * Setter method for the COM property "CreatePath"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  void createPath(
    int retval);


  /**
   * <p>
   * Returns or sets whether to create the path to store the file if the directories do not exist
   * </p>
   * <p>
   * Getter method for the COM property "CreatePath"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  int createPath();


  /**
   * <p>
   * Returns or sets whether to whether to transfer files in directories under the current directory
   * </p>
   * <p>
   * Setter method for the COM property "RecurseSubDirectories"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  void recurseSubDirectories(
    int retval);


  /**
   * <p>
   * Returns or sets whether to whether to transfer files in directories under the current directory
   * </p>
   * <p>
   * Getter method for the COM property "RecurseSubDirectories"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(20)
  int recurseSubDirectories();


  /**
   * <p>
   * Returns or sets the directory into which to place the incoming file
   * </p>
   * <p>
   * Setter method for the COM property "ReceiveTo"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  void receiveTo(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the directory into which to place the incoming file
   * </p>
   * <p>
   * Getter method for the COM property "ReceiveTo"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String receiveTo();


  /**
   * <p>
   * Returns or sets the mode to use to transfer the file
   * </p>
   * <p>
   * Setter method for the COM property "FileType"
   * </p>
   * @param retval Mandatory short parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  void fileType(
    short retval);


  /**
   * <p>
   * Returns or sets the mode to use to transfer the file
   * </p>
   * <p>
   * Getter method for the COM property "FileType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(24)
  short fileType();


  /**
   * <p>
   * Returns or sets whether to scan the file to determine if it contains 8-bit or control codes
   * </p>
   * <p>
   * Setter method for the COM property "ScanUnknownFileForType"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
  void scanUnknownFileForType(
    int retval);


  /**
   * <p>
   * Returns or sets whether to scan the file to determine if it contains 8-bit or control codes
   * </p>
   * <p>
   * Getter method for the COM property "ScanUnknownFileForType"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(26)
  int scanUnknownFileForType();


  /**
   * <p>
   * Returns or sets the extensions you want to identify as text files
   * </p>
   * <p>
   * Setter method for the COM property "TextFilesExtensions"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(27)
  void textFilesExtensions(
    java.lang.String retval);


  /**
   * <p>
   * Returns or sets the extensions you want to identify as text files
   * </p>
   * <p>
   * Getter method for the COM property "TextFilesExtensions"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(28)
  java.lang.String textFilesExtensions();


  /**
   * <p>
   * Returns the FTPOptions object associated with the FileTransferOptions object
   * </p>
   * <p>
   * Getter method for the COM property "FTPOptions"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(29)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject ftpOptions();


  /**
   * <p>
   * Returns the KermitOptions object associated with the FileTransferOptions object
   * </p>
   * <p>
   * Getter method for the COM property "KermitOptions"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(30)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject kermitOptions();


  /**
   * <p>
   * Returns the ZmodemOptions object associated with the FileTransferOptions object
   * </p>
   * <p>
   * Getter method for the COM property "ZmodemOptions"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(31)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject zmodemOptions();


  /**
   * <p>
   * Returns or sets whether to append sent file to the end of existing file if same name exist on the host
   * </p>
   * <p>
   * Setter method for the COM property "AppendFile"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(32)
  void appendFile(
    int retval);


  /**
   * <p>
   * Returns or sets whether to append sent file to the end of existing file if same name exist on the host
   * </p>
   * <p>
   * Getter method for the COM property "AppendFile"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(33)
  int appendFile();


  /**
   * <p>
   * Returns or sets whether to strip the Partitioned Data Set names
   * </p>
   * <p>
   * Setter method for the COM property "StripPDSNames"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(34)
  void stripPDSNames(
    int retval);


  /**
   * <p>
   * Returns or sets whether to strip the Partitioned Data Set names
   * </p>
   * <p>
   * Getter method for the COM property "StripPDSNames"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(35)
  int stripPDSNames();


  /**
   * <p>
   * Returns or sets which new line sequence to send
   * </p>
   * <p>
   * Setter method for the COM property "NewLine"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(36)
  void newLine(
    int retval);


  /**
   * <p>
   * Returns or sets which new line sequence to send
   * </p>
   * <p>
   * Getter method for the COM property "NewLine"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(37)
  int newLine();


  // Properties:
}
