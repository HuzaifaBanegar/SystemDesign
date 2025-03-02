package Decorator_Design_Pattern;

public class ChocolateCone implements IcecreamItem{
    private IcecreamItem icecreamItem;
    public ChocolateCone(IcecreamItem icecreamItem) {
        this.icecreamItem = icecreamItem;
    }

    public ChocolateCone() {

    }
    @Override
    public double getCost() {
        if(icecreamItem != null) {
            return icecreamItem.getCost() + 20.0;
        }
        return 20.0;
    }

    @Override
    public String getName() {
        if(icecreamItem != null) {
            return icecreamItem.getName() + "-Chocolate Cone";
        }
        return "Chocolate Cone";
    }
}
