package Factory_Design_Pattern;

import Factory_Design_Pattern.factoryClass.UIFactory;
import Factory_Design_Pattern.factoryClass.UIFactoryFactory;

public class Flutter {

    private SupportedPlatforms supportedPlatforms;

    public Flutter(SupportedPlatforms supportedPlatforms) {
        this.supportedPlatforms = supportedPlatforms;
    }

    public void setTheme(){
        System.out.println("Setting theme to Flutter environment");
    }

    public void setRefreshRate(){
        System.out.println("Setting refresh rate to Flutter environment");
    }

    public UIFactory createUIFactory(){
       return UIFactoryFactory.getFactoryFromSupportedPlatforms(supportedPlatforms);

    }
}
