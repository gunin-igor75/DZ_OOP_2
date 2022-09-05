import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);
        List<Service> list = new ArrayList<>();
        list.add(car);
        list.add(car2);
        list.add(truck);
        list.add(truck2);
        list.add(bicycle);
        list.add(bicycle2);
        Service station = new ServiceStation();
        for (Service elem : list) {
            if (elem instanceof Bicycle bicycleElem) {
                station.check(bicycleElem);
            } else if (elem instanceof Car carElem) {
                station.check(carElem);
            } else if (elem instanceof Truck truckElem) {
                station.check(truckElem);
            }
        }
    }
}