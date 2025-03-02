package Decorator_Design_Pattern;

public class Client {
    public static void main(String[] args) {
        IcecreamItem icecreamItem1 = new ChocolateCone();
        IcecreamItem icecreamItem2 = new Chocochips(
                                        new VanillaIcecream(
                                                new StrawberryIcecream(
                                                        new ChocolateCone(
                                                                new ChocolateSyrup(
                                                                        new StrawberryCone()
                                                                )
                                                        )
                                                )
                                        ));
        String items =  icecreamItem2.getName();
        System.out.println(items);
        double cost = icecreamItem2.getCost();
        System.out.println(cost);
    }
}
