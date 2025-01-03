package Factory_Design_Pattern.factoryClass;

import Factory_Design_Pattern.buttons.Buttons;
import Factory_Design_Pattern.dropdowns.Dorpdowns;
import Factory_Design_Pattern.menus.Menus;

public interface UIFactory {
    Buttons createButton();
    Menus createMenu();
    Dorpdowns createDorpdowns();
}
