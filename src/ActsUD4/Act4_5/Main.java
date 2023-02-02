package ActsUD4.Act4_5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a1 = {2, 4, 13, 5};
        System.out.println(Arrays.toString(a1));

        int[] a2 = MisMetodosConArrays.insert(a1, 3, 1);
        System.out.println(Arrays.toString(a2));

        int[] b = MisMetodosConArrays.insert(a1, a2);
        System.out.println(Arrays.toString(b));
    }
}
