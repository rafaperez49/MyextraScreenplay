package co.proyectobase.myextra.util.myextra  ;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.PropGet;
import com4j.PropPut;

/**
 * The Waits collection object. New instances returned by System.Waits.
 */
@IID("{00020400-0000-0000-C000-000000000046}")
public interface Waits extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Adds a wait-type object (returned from WaitForString, WaitForCursor, etc.) to the Waits collection.
   * </p>
   * @param waitobj Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(3)
  int add(
    com4j.Com4jObject waitobj);


  /**
   * <p>
   * Clears all items from the Waits collection
   * </p>
   */

  @DISPID(4)
  void clear();


  /**
   * <p>
   * Returns an element at the specified location in the Waits collection
   * </p>
   * @param nIndex Mandatory int parameter.
   */

  @DISPID(5)
  com4j.Com4jObject item(
    int nIndex);


  /**
   * <p>
   * Remove an item from the collection at specifed index
   * </p>
   * @param nIndex Mandatory int parameter.
   */

  @DISPID(6)
  void remove(
    int nIndex);


  /**
   * <p>
   * Removes all items from the collection
   * </p>
   */

  @DISPID(7)
  void removeAll();


  /**
   * <p>
   * Resets the Waits collection
   * </p>
   */

  @DISPID(8)
  void reset();


  /**
   * <p>
   * Waits for one of the wait-type objects in the collection to be signaled
   * </p>
   * @param nTimeout Mandatory int parameter.
   */

  @DISPID(9)
  int wait_(
    int nTimeout);


  // Properties:
  /**
   * <p>
   * Returns true if the collection has been waited on successfully since the last query
   * </p>
   * <p>
   * Getter method for the COM property "Changed"
   * </p>
   * @return The COM property Changed as a boolean
   */
  @DISPID(0)
  @PropGet
  boolean getChanged();

  /**
   * <p>
   * Returns true if the collection has been waited on successfully since the last query</p>
   * <p>
   * Setter method for the COM property "Changed"
   * </p>
   * @param newValue The new value for the COM property Changed as a boolean
   */
  @DISPID(0)
  @PropPut
  void setChanged(boolean newValue);

  /**
   * <p>
   * Returns the number of wait-type objects in this Waits collection
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return The COM property Count as a int
   */
  @DISPID(1)
  @PropGet
  int getCount();

  /**
   * <p>
   * Returns the number of wait-type objects in this Waits collection</p>
   * <p>
   * Setter method for the COM property "Count"
   * </p>
   * @param newValue The new value for the COM property Count as a int
   */
  @DISPID(1)
  @PropPut
  void setCount(int newValue);

  /**
   * <p>
   * Returns or sets whether the Wait.Wait method is enabled
   * </p>
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   * @return The COM property Enabled as a boolean
   */
  @DISPID(2)
  @PropGet
  boolean getEnabled();

  /**
   * <p>
   * Returns or sets whether the Wait.Wait method is enabled</p>
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param newValue The new value for the COM property Enabled as a boolean
   */
  @DISPID(2)
  @PropPut
  void setEnabled(boolean newValue);

}
