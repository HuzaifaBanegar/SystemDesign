package Adapter_Design_Pattern;

public class Client {
    public static void main(String[] args) {
        ITarget itarget = new Adapter();
        itarget.request();
    }
}
