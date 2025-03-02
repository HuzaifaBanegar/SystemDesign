package Decorator_Design_Pattern;

public class StrawberryCone implements IcecreamItem{

    private IcecreamItem icecreamItem;
    public StrawberryCone(IcecreamItem icecreamItem) {
        this.icecreamItem = icecreamItem;
    }
    public StrawberryCone() {

    }

    @Override
    public double getCost() {
        if(icecreamItem != null){
            return icecreamItem.getCost()+ 20.0;
        }
        return 20.0;
    }

    @Override
    public String getName() {
        if(icecreamItem != null){
            return icecreamItem.getName() + "-Strawberry Cone";
        }
        return "Strawberry Cone";
    }
}
