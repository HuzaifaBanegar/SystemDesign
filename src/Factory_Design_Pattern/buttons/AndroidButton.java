package Factory_Design_Pattern.buttons;

public class AndroidButton implements Buttons {
    @Override
    public void changeSize() {
        System.out.println("AndroidButton changing size...");
    }
}
