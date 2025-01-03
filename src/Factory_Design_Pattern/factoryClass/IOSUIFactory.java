package Factory_Design_Pattern.factoryClass;

import Factory_Design_Pattern.buttons.IOSButton;
import Factory_Design_Pattern.dropdowns.IOSDropdown;
import Factory_Design_Pattern.menus.IOSMenu;


public class IOSUIFactory implements UIFactory {
    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }

    @Override
    public IOSMenu createMenu() {
        return new IOSMenu();
    }

    @Override
    public IOSDropdown createDorpdowns() {
        return new IOSDropdown();
    }
}
