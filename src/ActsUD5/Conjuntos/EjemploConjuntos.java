package ActsUD5.Conjuntos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjemploConjuntos {
    public static void main(String[] args) {

        // Probar método containsAll con HashSet

        Set<Integer> numbers = new HashSet<>();

        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }
        System.out.println("HashSet1 de Integers: " + numbers);

        Set<Integer> primeNumbers =  new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("HashSet2 de números primos: " + primeNumbers);
        System.out.println(primeNumbers.containsAll(numbers));
        primeNumbers.addAll(numbers);
        System.out.println(primeNumbers.containsAll(numbers));

        Set<String> conjunto = new HashSet<>();

        System.out.println(conjunto.isEmpty());

        String s = "s1";

        conjunto.add(s);
        System.out.println(conjunto.isEmpty());

        for (int i = 1; i < 6; i++) {
            conjunto.add("s" + i);
        }

        conjunto.add(null);
        System.out.println(conjunto);
        for (String elemento:
             conjunto) {
            System.out.println(elemento);
        }

        String e;
        Iterator<String> it = conjunto.iterator();
        while (it.hasNext()) {
            e = it.next();
            System.out.println(e);
        }
    }
}
