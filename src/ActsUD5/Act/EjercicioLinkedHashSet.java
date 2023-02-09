package ActsUD5.Act;

import java.util.*;

public class EjercicioLinkedHashSet {
    public static void main(String[] args) {
        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.add("Juan");
        stringSet.add("Carlos");
        stringSet.add("Javier");

        System.out.println(stringSet);

        stringSet.add("Carlos");
        System.out.println(stringSet);

        stringSet.add(null);
        System.out.println(stringSet);

        stringSet.add("");
        System.out.println(stringSet);

    }
}
