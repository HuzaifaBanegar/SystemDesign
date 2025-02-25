package Adapter_Design_Pattern;

public class Adapter implements ITarget {
    private Adaptee2 adaptee= new Adaptee2();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
