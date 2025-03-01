package Strategy_Design_Pattern;

public class GoogleMaps {
    public static void main(String[] args) {
        PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorFactory.getPathCalculatoryStrategy("bike");
        System.out.println(pathCalculatorStrategy.findPath("Mira road", "Lower Parel"));
    }
}
