package ActsUD5.Listas.EjArrayList2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
// Crear ArrayList y añadir elementos
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(45);
        numbers.add(54);
        numbers.add(7);
        numbers.add(3);

        System.out.println(numbers);

        ListIterator<Integer> it = numbers.listIterator();
        while(it.hasPrevious()) {
            Integer i = it.previous();
            if (i > 20) {
                it.remove();
            }
            if (i == 2) {
                it.add(10);
            }
        }
        System.out.println(numbers);
    }
}
