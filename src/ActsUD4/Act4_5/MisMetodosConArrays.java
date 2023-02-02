package ActsUD4.Act4_5;

import java.util.Arrays;

public class MisMetodosConArrays {

    public static int[] arrayRand() {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 101);
        }
        return a;
    }

    public static void printArrayInv(int[] a) {
        for (int i = (a.length - 1); i > -1; i--) {
            System.out.print(a[i] + " ");
        }
    }

    public static void sortArray(int[] a) {
        Arrays.sort(a);
    }


    public static void searchSequential(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                System.out.println("El numero " + target + " se encuentra en la posición " + i);
            }
        }
        System.out.println("Este numero no se encuentra en este array");
    }

    public static void searchBinary(int[] a, int target) {
        int i = Arrays.binarySearch(a, target);
        if (i < 0) {
            System.out.println("Elemento no encontrado");
        }
        else {
            System.out.println("El numero " + target + " se encuentra en la posición " + i);
        }
    }

    public static boolean compareArrays (int[] a, int[] b) {
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == b[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] insert (int[] a, int value, int pos) {
        int[] newArray = new int[a.length + 1];
        for (int i = 0; i < pos; i++) {
            newArray[i] = a[i];
        }
        for (int i = pos + 1; i < newArray.length; i++) {
            newArray[i] = a[i-1];
        }
        newArray[pos] = value;

        return newArray;
    }
    public static int[] insert (int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i;
        for (i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (i = a.length; i < b.length; i++) {
            c[i] = b[(i - a.length)];
        }
        return c;
    }
}

