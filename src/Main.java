import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Service car = new Car("car1", 4);
        Service car2 = new Car("car2", 4);

        Service truck = new Truck("truck1", 6);
        Service truck2 = new Truck("truck2", 8);

        Service bicycle = new Bicycle("bicycle1", 2);
        Service bicycle2 = new Bicycle("bicycle2", 2);
        List<Service> list = new ArrayList<>();
        list.add(car);
        list.add(car2);
        list.add(truck);
        list.add(truck2);
        list.add(bicycle);
        list.add(bicycle2);
        list.forEach(Service::check);
    }
}