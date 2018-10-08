package co.proyectobase.myextra.util.myextra  ;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.DefaultMethod;
import com4j.IID;
import com4j.NativeType;
import com4j.ReturnValue;
import com4j.VTID;

/**
 * Menu Editing Facilities
 */
@IID("{398ABA7B-723E-4F6F-9727-DECC0DFDB967}")
public interface MenuEdit extends Com4jObject {
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
   * Returns or sets a menu item position
   * </p>
   * <p>
   * Setter method for the COM property "ItemPosition"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  void itemPosition(
    int retval);


  /**
   * <p>
   * Returns or sets a menu item position
   * </p>
   * <p>
   * Getter method for the COM property "ItemPosition"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  int itemPosition();


  /**
   * <p>
   * Returns or sets a menu item caption
   * </p>
   * <p>
   * Setter method for the COM property "ItemCaption"
   * </p>
   * @param caption Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  void itemCaption(
    java.lang.String caption);


  /**
   * <p>
   * Returns or sets a menu item caption
   * </p>
   * <p>
   * Getter method for the COM property "ItemCaption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String itemCaption();


  /**
   * <p>
   * Gets or sets the docked property for a menu
   * </p>
   * <p>
   * Setter method for the COM property "Docked"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  void docked(
    int retval);


  /**
   * <p>
   * Gets or sets the docked property for a menu
   * </p>
   * <p>
   * Getter method for the COM property "Docked"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  int docked();


  /**
   * <p>
   * Gets or sets the visible property
   * </p>
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  void visible(
    int retval);


  /**
   * <p>
   * Gets or sets the visible property
   * </p>
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  int visible();


  /**
   * <p>
   * Sets or clears a checkmark for a menu item
   * </p>
   * <p>
   * Setter method for the COM property "CheckMark"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  void checkMark(
    int retval);


  /**
   * <p>
   * Sets or clears a checkmark for a menu item
   * </p>
   * <p>
   * Getter method for the COM property "CheckMark"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  int checkMark();


  /**
   * <p>
   * Changes the action assigned to the current Item
   * </p>
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param retval Mandatory java.lang.String parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  void value(
    java.lang.String retval);


  /**
   * <p>
   * Changes the action assigned to the current Item
   * </p>
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String value();


  /**
   * <p>
   * Removes the item from the visible menu, but keeps it in the menu
   * </p>
   * <p>
   * Setter method for the COM property "Hide"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  void hide(
    int retval);


  /**
   * <p>
   * Removes the item from the visible menu, but keeps it in the menu
   * </p>
   * <p>
   * Getter method for the COM property "Hide"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(22)
  int hide();


  /**
   * <p>
   * Disables the menu item, leaving it visible in a dimmed state
   * </p>
   * <p>
   * Setter method for the COM property "Dim"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  void dim(
    int retval);


  /**
   * <p>
   * Disables the menu item, leaving it visible in a dimmed state
   * </p>
   * <p>
   * Getter method for the COM property "Dim"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(24)
  int dim();


  /**
   * <p>
   * Returns or sets a menu item position
   * </p>
   * <p>
   * Setter method for the COM property "PositionName"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
  void positionName(
    java.lang.String rhs);


  /**
   * <p>
   * Returns or Sets the file name to be used for the current menu
   * </p>
   * <p>
   * Setter method for the COM property "MenuFile"
   * </p>
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(26)
  void menuFile(
    java.lang.String fileName);


  /**
   * <p>
   * Returns or Sets the file name to be used for the current menu
   * </p>
   * <p>
   * Getter method for the COM property "MenuFile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String menuFile();


  /**
   * <p>
   * Returns or sets whether to display Restore on the Control Menu
   * </p>
   * <p>
   * Setter method for the COM property "ShowRestore"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(28)
  void showRestore(
    int retval);


  /**
   * <p>
   * Returns or sets whether to display Restore on the Control Menu
   * </p>
   * <p>
   * Getter method for the COM property "ShowRestore"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(29)
  int showRestore();


  /**
   * <p>
   * Returns or sets whether to display Move on the Control Menu
   * </p>
   * <p>
   * Setter method for the COM property "ShowMove"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(30)
  void showMove(
    int retval);


  /**
   * <p>
   * Returns or sets whether to display Move on the Control Menu
   * </p>
   * <p>
   * Getter method for the COM property "ShowMove"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(31)
  int showMove();


  /**
   * <p>
   * Returns or sets whether to display Size on the Control Menu
   * </p>
   * <p>
   * Setter method for the COM property "ShowSize"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(32)
  void showSize(
    int retval);


  /**
   * <p>
   * Returns or sets whether to display Size on the Control Menu
   * </p>
   * <p>
   * Getter method for the COM property "ShowSize"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(33)
  int showSize();


  /**
   * <p>
   * Returns or sets whether to display Minimize on the Control Menu
   * </p>
   * <p>
   * Setter method for the COM property "ShowMinimize"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(34)
  void showMinimize(
    int retval);


  /**
   * <p>
   * Returns or sets whether to display Minimize on the Control Menu
   * </p>
   * <p>
   * Getter method for the COM property "ShowMinimize"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(35)
  int showMinimize();


  /**
   * <p>
   * Returns or sets whether to display Maximize on the Control Menu
   * </p>
   * <p>
   * Setter method for the COM property "ShowMaximize"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(36)
  void showMaximize(
    int retval);


  /**
   * <p>
   * Returns or sets whether to display Maximize on the Control Menu
   * </p>
   * <p>
   * Getter method for the COM property "ShowMaximize"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(37)
  int showMaximize();


  /**
   * <p>
   * Returns or sets whether to display Open Session on the Control Menu
   * </p>
   * <p>
   * Setter method for the COM property "ShowOpenSession"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(38)
  void showOpenSession(
    int retval);


  /**
   * <p>
   * Returns or sets whether to display Open Session on the Control Menu
   * </p>
   * <p>
   * Getter method for the COM property "ShowOpenSession"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(39)
  int showOpenSession();


  /**
   * <p>
   * Returns or sets whether to display Open Layout on the Control Menu
   * </p>
   * <p>
   * Setter method for the COM property "ShowOpenLayout"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(40)
  void showOpenLayout(
    int retval);


  /**
   * <p>
   * Returns or sets whether to display Open Layout on the Control Menu
   * </p>
   * <p>
   * Getter method for the COM property "ShowOpenLayout"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(41)
  int showOpenLayout();


  /**
   * <p>
   * Returns or sets whether to display Save Layout on the Control Menu
   * </p>
   * <p>
   * Setter method for the COM property "ShowSaveLayout"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(42)
  void showSaveLayout(
    int retval);


  /**
   * <p>
   * Returns or sets whether to display Save Layout on the Control Menu
   * </p>
   * <p>
   * Getter method for the COM property "ShowSaveLayout"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(43)
  int showSaveLayout();


  /**
   * <p>
   * Returns or sets whether to display Show Menu Bar on the Control Menu
   * </p>
   * <p>
   * Setter method for the COM property "ShowToggleMenuBar"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(44)
  void showToggleMenuBar(
    int retval);


  /**
   * <p>
   * Returns or sets whether to display Show Menu Bar on the Control Menu
   * </p>
   * <p>
   * Getter method for the COM property "ShowToggleMenuBar"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(45)
  int showToggleMenuBar();


  /**
   * <p>
   * Returns or sets whether to display Close on the Control Menu
   * </p>
   * <p>
   * Setter method for the COM property "ShowClose"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(46)
  void showClose(
    int retval);


  /**
   * <p>
   * Returns or sets whether to display Close on the Control Menu
   * </p>
   * <p>
   * Getter method for the COM property "ShowClose"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(47)
  int showClose();


  /**
   * <p>
   * Returns or sets whether to display Switch To on the Control Menu
   * </p>
   * <p>
   * Setter method for the COM property "ShowSwitchTo"
   * </p>
   * @param retval Mandatory int parameter.
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(48)
  void showSwitchTo(
    int retval);


  /**
   * <p>
   * Returns or sets whether to display Switch To on the Control Menu
   * </p>
   * <p>
   * Getter method for the COM property "ShowSwitchTo"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(49)
  int showSwitchTo();


  /**
   * <p>
   * Inserts a menu item before the current Item
   * </p>
   * @param mOptions Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(50)
  int insert(
    java.lang.String mOptions);


  /**
   * <p>
   * Inserts a menu item after the current Item
   * </p>
   * @param mOptions Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(51)
  int append(
    java.lang.String mOptions);


  /**
   * <p>
   * Removes an item from a menu
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(52)
  int remove();


  /**
   * <p>
   * Resets menu to defaults
   * </p>
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(53)
  void reset();


  /**
   * <p>
   * Retrieves menu options
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(54)
  java.lang.String menuOptions();


  /**
   * <p>
   * Causes a current menu item to become the current menu
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(55)
  int makeCurrent();


  /**
   * <p>
   * Causes the 'parent' menu of the current menu to become current
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(56)
  int pop();


  /**
   * <p>
   * Closes the current menu and begins edit of the indicated menu
   * </p>
   * @param menuid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(57)
  int openMenu(
    int menuid);


  // Properties:
}
