package Strategy_Design_Pattern;

public class PathCalculatorFactory {
    public static PathCalculatorStrategy getPathCalculatoryStrategy(String strategy){
        switch(strategy){
            case "car": return new CarPathStrategy();
            case "walk": return new WalkPathStrategy();
            case "bike": return new BikePathStrategy();
            default: return null;
        }
    }
}
