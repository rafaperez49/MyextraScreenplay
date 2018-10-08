package co.proyectobase.myextra.util.myextra  ;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.PropGet;
import com4j.PropPut;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface _ScreenWait extends Com4jObject {
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

  @DISPID(17)
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
   * Getter method for the COM property "Top"
   * </p>
   * @return The COM property Top as a short
   */
  @DISPID(9)
  @PropGet
  short getTop();

  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param newValue The new value for the COM property Top as a short
   */
  @DISPID(9)
  @PropPut
  void setTop(short newValue);

  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return The COM property Left as a short
   */
  @DISPID(10)
  @PropGet
  short getLeft();

  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param newValue The new value for the COM property Left as a short
   */
  @DISPID(10)
  @PropPut
  void setLeft(short newValue);

  /**
   * <p>
   * Getter method for the COM property "Bottom"
   * </p>
   * @return The COM property Bottom as a short
   */
  @DISPID(11)
  @PropGet
  short getBottom();

  /**
   * <p>
   * Setter method for the COM property "Bottom"
   * </p>
   * @param newValue The new value for the COM property Bottom as a short
   */
  @DISPID(11)
  @PropPut
  void setBottom(short newValue);

  /**
   * <p>
   * Getter method for the COM property "Right"
   * </p>
   * @return The COM property Right as a short
   */
  @DISPID(12)
  @PropGet
  short getRight();

  /**
   * <p>
   * Setter method for the COM property "Right"
   * </p>
   * @param newValue The new value for the COM property Right as a short
   */
  @DISPID(12)
  @PropPut
  void setRight(short newValue);

  /**
   * <p>
   * Getter method for the COM property "Row"
   * </p>
   * @return The COM property Row as a short
   */
  @DISPID(13)
  @PropGet
  short getRow();

  /**
   * <p>
   * Setter method for the COM property "Row"
   * </p>
   * @param newValue The new value for the COM property Row as a short
   */
  @DISPID(13)
  @PropPut
  void setRow(short newValue);

  /**
   * <p>
   * Getter method for the COM property "Col"
   * </p>
   * @return The COM property Col as a short
   */
  @DISPID(14)
  @PropGet
  short getCol();

  /**
   * <p>
   * Setter method for the COM property "Col"
   * </p>
   * @param newValue The new value for the COM property Col as a short
   */
  @DISPID(14)
  @PropPut
  void setCol(short newValue);

  /**
   * <p>
   * Getter method for the COM property "Page"
   * </p>
   * @return The COM property Page as a short
   */
  @DISPID(15)
  @PropGet
  short getPage();

  /**
   * <p>
   * Setter method for the COM property "Page"
   * </p>
   * @param newValue The new value for the COM property Page as a short
   */
  @DISPID(15)
  @PropPut
  void setPage(short newValue);

  /**
   * <p>
   * Getter method for the COM property "String"
   * </p>
   * @return The COM property String as a java.lang.String
   */
  @DISPID(16)
  @PropGet
  java.lang.String getString();

  /**
   * <p>
   * Setter method for the COM property "String"
   * </p>
   * @param newValue The new value for the COM property String as a java.lang.String
   */
  @DISPID(16)
  @PropPut
  void setString(java.lang.String newValue);

}
