package ActsUD5.TreeSet;

import java.util.TreeSet;

public class EjemploTreeSet {
    // Crea un conjunto implementado por árbol binario
    // Añade tres numeros enteros
    // Recórrelo e imprime su contenido de menor a mayor
    // Haz lo mismo utilizando nombres de alumnos
    // Haz lo mismo utilizando objetos de la clase Persona
    public static void main(String[] args) {
        TreeSet<Integer> arbol1 = new TreeSet<>();
        arbol1.add(22);
        arbol1.add(5);
        arbol1.add(13);

        // TreeSet<> tiene sus elementos ordenados por defecto
        System.out.println(arbol1);

        TreeSet<String> arbol2 = new TreeSet<>();
        arbol2.add("Juan");
        arbol2.add("Carlos");
        arbol2.add("Alejandro");

        System.out.println(arbol2);

        Persona p1 = new Persona("Juan", 15);
        Persona p2 = new Persona("Carlos", 18);
        Persona p3 = new Persona("Alejandro", 23);

        TreeSet<Persona> arbol3 = new TreeSet<>();
        arbol3.add(p1);
        arbol3.add(p2);
        arbol3.add(p3);

        System.out.println(arbol3);

    }
}
