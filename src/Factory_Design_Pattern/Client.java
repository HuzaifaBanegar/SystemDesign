package Factory_Design_Pattern;

import Factory_Design_Pattern.buttons.Buttons;
import Factory_Design_Pattern.factoryClass.UIFactory;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatforms.IOS);
        UIFactory uiFactory = flutter.createUIFactory();

       Buttons button = uiFactory.createButton();
       button.changeSize();


    }
}
