package Factory_Design_Pattern.factoryClass;

import Factory_Design_Pattern.SupportedPlatforms;

public class UIFactoryFactory {
    public static UIFactory getFactoryFromSupportedPlatforms(SupportedPlatforms supportedPlatforms) {
        return switch (supportedPlatforms) {
            case ANDROID -> new AndroidUIFactory();
            case IOS -> new IOSUIFactory();
            default -> throw new IllegalStateException("Unexpected value: " + supportedPlatforms);
        };
    }
}
