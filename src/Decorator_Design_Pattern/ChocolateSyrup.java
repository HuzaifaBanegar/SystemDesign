package Decorator_Design_Pattern;

public class ChocolateSyrup implements IcecreamItem{

    private IcecreamItem icecreamItem;
    public ChocolateSyrup(IcecreamItem icecreamItem) {
        this.icecreamItem = icecreamItem;
    }
    @Override
    public double getCost() {
        return icecreamItem.getCost()+5.0;
    }

    @Override
    public String getName() {
        return icecreamItem.getName()+"-Chocolate Syrup";
    }
}
