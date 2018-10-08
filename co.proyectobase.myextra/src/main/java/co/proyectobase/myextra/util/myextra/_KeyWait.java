package co.proyectobase.myextra.util.myextra  ;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.PropGet;
import com4j.PropPut;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface _KeyWait extends Com4jObject {
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

  @DISPID(9)
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

}
