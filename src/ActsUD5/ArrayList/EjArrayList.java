package ActsUD5.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class EjArrayList {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add(null);
        System.out.println(cars);


        cars.remove("BMW");
        cars.add(1, "Renault");
        cars.remove("Mazda");
        cars.add(2, "Opel");

        System.out.println(cars);


        cars.removeAll(cars);
        System.out.println(cars.size());
        // nueva lista "Mitsubishi" y "Toyota"
        // añadir al vacio

        List<String> cars2 = new ArrayList<>();
        cars2.add("Mitsubishi");
        cars2.add("Toyota");
        cars.addAll(cars2);
        System.out.println(cars);

        ListIterator it = cars.listIterator();
        while(it.hasNext()) System.out.println(it.next());
    }
}
