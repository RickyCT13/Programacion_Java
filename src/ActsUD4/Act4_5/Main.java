package ActsUD4.Act4_5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a1 = {2, 4, 13, 5};
        System.out.println(Arrays.toString(a1));

        int[] test = new int[5];
        Arrays.fill(test, 4);
        test.clone();
        System.out.println("Array test " + Arrays.toString(test));
        int[] a2 = MisMetodosConArrays.insert(a1, 3, 2);
        System.out.println(Arrays.toString(a2));

        int[] b = {1, 3, 7, 9, 12, 15};
        int[] c = MisMetodosConArrays.insert(a1, b, 3);
        System.out.println(Arrays.toString(c));

        System.out.println(Arrays.binarySearch(b, 7));
        System.out.println(Arrays.binarySearch(b, 17));
        System.out.println(Arrays.toString(MisMetodosConArrays.erase(b, 12, false)));
        System.out.println(Arrays.toString(MisMetodosConArrays.switchPosEvenToOdd(b)));
    }
}
