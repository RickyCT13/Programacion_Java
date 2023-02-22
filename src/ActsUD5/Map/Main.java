package ActsUD5.Map;

import ActsUD5.Act5_1.Persona;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Object> m = new HashMap<>();
        m.put(1, "a");
        m.put(2, 100);
        m.put(7, new Persona());

        System.out.println(m);

        // Crear un diccionario para las 5 primeras letras del alfabeto
        Map<Integer, String> abc = new HashMap<>();
        abc.put(1, "A");
        abc.put(2, "B");
        abc.put(3, "C");
        abc.put(4, "D");
        abc.put(5, "E");

        System.out.println(abc.get(3));

        System.out.println(abc);

        abc.replace(4, "F");

        if (!abc.containsValue("F")) System.out.println("La letra F no está en el map");
        else System.out.println("La letra F sí está en el map");

        if(!abc.containsKey(1)) System.out.println("La clave 1 no está en el map");
        else System.out.println("La clave 1 sí está en el map");

        // Iterando sobre el conjunto de valores
        Collection<String> abcCollection = abc.values();
        Iterator it = abcCollection.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        it = abc.keySet().iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.putAll(abc);
        System.out.println(abc.values());

        // Diccionario para calificación de notas
        TreeMap<Integer, String> notas = new TreeMap<>();
        notas.put(1, "Insuficiente");
        notas.put(2, "Insuficiente");
        notas.put(3, "Insuficiente");
        notas.put(4, "Insuficiente");
        notas.put(5, "Suficiente");
        notas.put(6, "Bien");
        notas.put(7, "Notable");
        notas.put(8, "Notable Alto");
        notas.put(9, "Sobresaliente");
        notas.put(10, "Sobresaliente Alto");
        System.out.println("--------------------------");
        System.out.println("| Nota | Calificacion |");
        Iterator num = notas.keySet().iterator();
        Iterator cal = notas.values().iterator();
        while (num.hasNext() && cal.hasNext()) {
            System.out.println("| " + num.next() + " | " + cal.next() + " |");
        }
        System.out.println("--------------------------");
    }
}
