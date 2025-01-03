package Factory_Design_Pattern.buttons;

public class IOSButton implements Buttons {
    @Override
    public void changeSize() {
        System.out.println("IOS Button changing size...");
    }
}
