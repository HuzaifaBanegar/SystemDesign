package Decorator_Design_Pattern;

public class StrawberryIcecream implements IcecreamItem{
    private IcecreamItem icecreamItem;

    public StrawberryIcecream(IcecreamItem icecreamItem) {
        this.icecreamItem = icecreamItem;
    }

    @Override
    public double getCost() {
        return  icecreamItem.getCost()+30.0;
    }

    @Override
    public String getName() {
        return icecreamItem.getName()+"-Strawberry Icecream";
    }
}
