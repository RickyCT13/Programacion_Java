package ActsUD5.Act5_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // TreeSet
        TreeSet<Persona> grupo = new TreeSet<>();
        Persona p1 = new Persona("Juan", 23);
        Persona p2 = new Persona("Zahara", 19);
        Persona p3 = new Persona("Paco", 38);
        Persona p4 = new Persona("Arturo", 23);
        Persona p5 = new Persona("Arturo", 24);
        Persona p6 = new Persona("pepe", 17);
        grupo.add(p1);
        grupo.add(p2);
        grupo.add(p3);

        System.out.println(grupo);

        grupo.add(p4);
        grupo.add(p5);

        System.out.println(grupo);

        grupo.add(p6);

        System.out.println(grupo);

        Map<Integer, Integer> ageCounts = new HashMap<>();
        for (Persona persona : grupo) {
            int age = persona.getAge();
            ageCounts.put(age, ageCounts.getOrDefault(age, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : ageCounts.entrySet()) {
            int age = entry.getKey();
            int count = entry.getValue();
            System.out.println("Edad " + age + ": " + count + " personas");
        }

    }
}
