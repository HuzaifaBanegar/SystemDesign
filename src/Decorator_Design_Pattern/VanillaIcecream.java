package Decorator_Design_Pattern;

public class VanillaIcecream implements IcecreamItem{
    private IcecreamItem icecreamItem;

    public VanillaIcecream(IcecreamItem icecreamItem) {
        this.icecreamItem = icecreamItem;
    }

    @Override
    public double getCost() {
        return icecreamItem.getCost()+30.0;
    }

    @Override
    public String getName() {
        return icecreamItem.getName()+ "-Vanilla Icecream";
    }
}
