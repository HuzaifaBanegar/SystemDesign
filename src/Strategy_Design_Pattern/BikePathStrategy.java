package Strategy_Design_Pattern;

import java.nio.file.Path;

public class BikePathStrategy implements PathCalculatorStrategy{
    @Override
    public String findPath(String startingPoint, String endPoint) {
        return "Path from: "+startingPoint+" to: "+ endPoint+ " is - Bike path";
    }
}
