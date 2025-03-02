package Decorator_Design_Pattern;

public class Chocochips implements IcecreamItem{

    private IcecreamItem icecreamItem;
    public Chocochips(IcecreamItem icecreamItem) {
        this.icecreamItem = icecreamItem;
    }

    @Override
    public double getCost() {
        return icecreamItem.getCost()+10.0;
    }

    @Override
    public String getName() {
        return icecreamItem.getName()+"-Chocochips";
    }
}
