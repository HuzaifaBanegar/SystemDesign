package Factory_Design_Pattern.factoryClass;

import Factory_Design_Pattern.buttons.AndroidButton;
import Factory_Design_Pattern.dropdowns.AndroidDropdown;
import Factory_Design_Pattern.menus.AndroidMenu;


public class AndroidUIFactory implements UIFactory {
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropdown createDorpdowns() {
        return new AndroidDropdown();
    }
}
