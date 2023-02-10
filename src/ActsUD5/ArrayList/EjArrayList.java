package ActsUD5.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class EjArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Honda");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Nissan");
        cars.add("Mazda");


        System.out.println(cars);
        cars.remove(1);
        System.out.println(cars);
        cars.set(1, "a");
        System.out.println(cars);

    }
}
