package Misc.Maps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Hashmap
        Map<Integer, String> binaryDecimal = new HashMap<>();
        binaryDecimal.put(0, "000");
        binaryDecimal.put(1, "001");
        binaryDecimal.put(2, "010");
        binaryDecimal.put(3, "001");
        binaryDecimal.put(4, "100");
        binaryDecimal.put(5, "101");
        binaryDecimal.put(6, "110");
        binaryDecimal.put(7, "111");

        System.out.println(binaryDecimal);
    }
}
