package co.proyectobase.myextra.util.myextra  ;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.PropGet;
import com4j.PropPut;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface _FileWait extends Com4jObject {
  // Methods:
  /**
   */

  @DISPID(5)
  void cancel();


  /**
   * @param timeout Mandatory int parameter.
   */

  @DISPID(6)
  boolean wait_(
    int timeout);


  /**
   * @param bNewVal Mandatory int parameter.
   */

  @DISPID(23)
  void setSynchState(
    int bNewVal);


  // Properties:
  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return The COM property Value as a boolean
   */
  @DISPID(0)
  @PropGet
  boolean getValue();

  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param newValue The new value for the COM property Value as a boolean
   */
  @DISPID(0)
  @PropPut
  void setValue(boolean newValue);

  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return The COM property Application as a com4j.Com4jObject
   */
  @DISPID(1)
  @PropGet
  com4j.Com4jObject getApplication();

  /**
   * <p>
   * Setter method for the COM property "Application"
   * </p>
   * @param newValue The new value for the COM property Application as a com4j.Com4jObject
   */
  @DISPID(1)
  @PropPut
  void setApplication(com4j.Com4jObject newValue);

  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return The COM property Parent as a com4j.Com4jObject
   */
  @DISPID(2)
  @PropGet
  com4j.Com4jObject getParent();

  /**
   * <p>
   * Setter method for the COM property "Parent"
   * </p>
   * @param newValue The new value for the COM property Parent as a com4j.Com4jObject
   */
  @DISPID(2)
  @PropPut
  void setParent(com4j.Com4jObject newValue);

  /**
   * <p>
   * Getter method for the COM property "PercentComplete"
   * </p>
   * @return The COM property PercentComplete as a short
   */
  @DISPID(3)
  @PropGet
  short getPercentComplete();

  /**
   * <p>
   * Setter method for the COM property "PercentComplete"
   * </p>
   * @param newValue The new value for the COM property PercentComplete as a short
   */
  @DISPID(3)
  @PropPut
  void setPercentComplete(short newValue);

  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   * @return The COM property Enabled as a boolean
   */
  @DISPID(4)
  @PropGet
  boolean getEnabled();

  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param newValue The new value for the COM property Enabled as a boolean
   */
  @DISPID(4)
  @PropPut
  void setEnabled(boolean newValue);

  /**
   * <p>
   * Getter method for the COM property "_ThreadID"
   * </p>
   * @return The COM property _ThreadID as a int
   */
  @DISPID(7)
  @PropGet
  int get_ThreadID();

  /**
   * <p>
   * Setter method for the COM property "_ThreadID"
   * </p>
   * @param newValue The new value for the COM property _ThreadID as a int
   */
  @DISPID(7)
  @PropPut
  void set_ThreadID(int newValue);

  /**
   * <p>
   * Getter method for the COM property "Changed"
   * </p>
   * @return The COM property Changed as a boolean
   */
  @DISPID(8)
  @PropGet
  boolean getChanged();

  /**
   * <p>
   * Setter method for the COM property "Changed"
   * </p>
   * @param newValue The new value for the COM property Changed as a boolean
   */
  @DISPID(8)
  @PropPut
  void setChanged(boolean newValue);

  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return The COM property Type as a int
   */
  @DISPID(9)
  @PropGet
  int getType();

  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param newValue The new value for the COM property Type as a int
   */
  @DISPID(9)
  @PropPut
  void setType(int newValue);

  /**
   * <p>
   * Getter method for the COM property "FileName"
   * </p>
   * @return The COM property FileName as a java.lang.String
   */
  @DISPID(10)
  @PropGet
  java.lang.String getFileName();

  /**
   * <p>
   * Setter method for the COM property "FileName"
   * </p>
   * @param newValue The new value for the COM property FileName as a java.lang.String
   */
  @DISPID(10)
  @PropPut
  void setFileName(java.lang.String newValue);

  /**
   * <p>
   * Getter method for the COM property "Bytes"
   * </p>
   * @return The COM property Bytes as a int
   */
  @DISPID(11)
  @PropGet
  int getBytes();

  /**
   * <p>
   * Setter method for the COM property "Bytes"
   * </p>
   * @param newValue The new value for the COM property Bytes as a int
   */
  @DISPID(11)
  @PropPut
  void setBytes(int newValue);

  /**
   * <p>
   * Getter method for the COM property "EndState"
   * </p>
   * @return The COM property EndState as a int
   */
  @DISPID(12)
  @PropGet
  int getEndState();

  /**
   * <p>
   * Setter method for the COM property "EndState"
   * </p>
   * @param newValue The new value for the COM property EndState as a int
   */
  @DISPID(12)
  @PropPut
  void setEndState(int newValue);

  /**
   * <p>
   * Getter method for the COM property "RemoteName"
   * </p>
   * @return The COM property RemoteName as a java.lang.String
   */
  @DISPID(13)
  @PropGet
  java.lang.String getRemoteName();

  /**
   * <p>
   * Setter method for the COM property "RemoteName"
   * </p>
   * @param newValue The new value for the COM property RemoteName as a java.lang.String
   */
  @DISPID(13)
  @PropPut
  void setRemoteName(java.lang.String newValue);

  /**
   * <p>
   * Getter method for the COM property "Size"
   * </p>
   * @return The COM property Size as a int
   */
  @DISPID(14)
  @PropGet
  int getSize();

  /**
   * <p>
   * Setter method for the COM property "Size"
   * </p>
   * @param newValue The new value for the COM property Size as a int
   */
  @DISPID(14)
  @PropPut
  void setSize(int newValue);

  /**
   * <p>
   * Getter method for the COM property "Time"
   * </p>
   * @return The COM property Time as a int
   */
  @DISPID(15)
  @PropGet
  int getTime();

  /**
   * <p>
   * Setter method for the COM property "Time"
   * </p>
   * @param newValue The new value for the COM property Time as a int
   */
  @DISPID(15)
  @PropPut
  void setTime(int newValue);

  /**
   * <p>
   * Getter method for the COM property "Errors"
   * </p>
   * @return The COM property Errors as a int
   */
  @DISPID(16)
  @PropGet
  int getErrors();

  /**
   * <p>
   * Setter method for the COM property "Errors"
   * </p>
   * @param newValue The new value for the COM property Errors as a int
   */
  @DISPID(16)
  @PropPut
  void setErrors(int newValue);

  /**
   * <p>
   * Getter method for the COM property "ReqName"
   * </p>
   * @return The COM property ReqName as a java.lang.String
   */
  @DISPID(17)
  @PropGet
  java.lang.String getReqName();

  /**
   * <p>
   * Setter method for the COM property "ReqName"
   * </p>
   * @param newValue The new value for the COM property ReqName as a java.lang.String
   */
  @DISPID(17)
  @PropPut
  void setReqName(java.lang.String newValue);

  /**
   * <p>
   * Getter method for the COM property "Message"
   * </p>
   * @return The COM property Message as a java.lang.String
   */
  @DISPID(18)
  @PropGet
  java.lang.String getMessage();

  /**
   * <p>
   * Setter method for the COM property "Message"
   * </p>
   * @param newValue The new value for the COM property Message as a java.lang.String
   */
  @DISPID(18)
  @PropPut
  void setMessage(java.lang.String newValue);

  /**
   * <p>
   * Getter method for the COM property "Packets"
   * </p>
   * @return The COM property Packets as a int
   */
  @DISPID(19)
  @PropGet
  int getPackets();

  /**
   * <p>
   * Setter method for the COM property "Packets"
   * </p>
   * @param newValue The new value for the COM property Packets as a int
   */
  @DISPID(19)
  @PropPut
  void setPackets(int newValue);

  /**
   * <p>
   * Getter method for the COM property "Timeouts"
   * </p>
   * @return The COM property Timeouts as a int
   */
  @DISPID(20)
  @PropGet
  int getTimeouts();

  /**
   * <p>
   * Setter method for the COM property "Timeouts"
   * </p>
   * @param newValue The new value for the COM property Timeouts as a int
   */
  @DISPID(20)
  @PropPut
  void setTimeouts(int newValue);

  /**
   * <p>
   * Getter method for the COM property "FileType"
   * </p>
   * @return The COM property FileType as a int
   */
  @DISPID(21)
  @PropGet
  int getFileType();

  /**
   * <p>
   * Setter method for the COM property "FileType"
   * </p>
   * @param newValue The new value for the COM property FileType as a int
   */
  @DISPID(21)
  @PropPut
  void setFileType(int newValue);

  /**
   * <p>
   * Getter method for the COM property "Sending"
   * </p>
   * @return The COM property Sending as a boolean
   */
  @DISPID(22)
  @PropGet
  boolean getSending();

  /**
   * <p>
   * Setter method for the COM property "Sending"
   * </p>
   * @param newValue The new value for the COM property Sending as a boolean
   */
  @DISPID(22)
  @PropPut
  void setSending(boolean newValue);

  /**
   * <p>
   * Getter method for the COM property "Options"
   * </p>
   * @return The COM property Options as a short
   */
  @DISPID(24)
  @PropGet
  short getOptions();

  /**
   * <p>
   * Setter method for the COM property "Options"
   * </p>
   * @param newValue The new value for the COM property Options as a short
   */
  @DISPID(24)
  @PropPut
  void setOptions(short newValue);

  /**
   * <p>
   * Getter method for the COM property "State"
   * </p>
   * @return The COM property State as a short
   */
  @DISPID(25)
  @PropGet
  short getState();

  /**
   * <p>
   * Setter method for the COM property "State"
   * </p>
   * @param newValue The new value for the COM property State as a short
   */
  @DISPID(25)
  @PropPut
  void setState(short newValue);

}
