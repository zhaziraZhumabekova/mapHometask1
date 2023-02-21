import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1, 543);
        Car car1 = new Car(2, 543);
        MoreInfo info = new MoreInfo(1999,"BMW", 1000000, "black");
        MoreInfo info1 = new MoreInfo(1997,"Mersedes", 10000000, "white");

        Map<Car, MoreInfo> map = new HashMap<>();
        map.put(car, info);
        map.put(car1, info1);
        for(Map.Entry<Car, MoreInfo> m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}