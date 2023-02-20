package ActsUD5.Listas;

import java.util.*;

public class EjemploLinkedList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(15);
        numbers.add(23);
        numbers.add(21);

        List<Integer> linkedList = new LinkedList<>(numbers);
        linkedList.add(7);
        linkedList.add(2);
        linkedList.add(10);

        numbers.add(77);
        // Este elemento no aparecerá en la LinkedList

        System.out.println("ArrayList: " + numbers);
        System.out.println("LinkedList: " + linkedList);

        // Imprimir LinkedList en orden inverso
        ListIterator<Integer> it = linkedList.listIterator(linkedList.size());
        Integer e;
        System.out.print("[");
        while (it.hasPrevious()) {
            e = it.previous();
            if (e.equals(15)) it.remove();
            if (e.equals(23)) it.add(11);
            System.out.print(e);
            if (it.hasPrevious()) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        //Insertar entre el 15 y el 23 el 11

        // Imprime el 3er elemento
        System.out.println(linkedList.get(2));

        // Haz que el 4to elemento valga 22
        linkedList.set(4, 22);

        // Mostrar si el 22 esta en la lista
        System.out.println(linkedList.contains(22));

        // Indice del 22
        System.out.println(linkedList.indexOf(22));

        // Eliminar el 22
        linkedList.remove((Integer) 22);
        System.out.println(linkedList.contains(22));


    }
}
