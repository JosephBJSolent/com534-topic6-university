// This is the MenuItemHandler interface.
// It specifies one method, onMenuItemSelected().
// The idea is that the onMenuItemSelected() method of the menu item's handler is called whenever a menu item is
// selected.
fun interface MenuItemHandler {
    fun onMenuItemSelected()
}