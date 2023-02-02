package ActsUD4.Act_4_6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 13, 15};

        String[] strings = intToString(numbers);
        System.out.println(Arrays.toString(strings));
    }

    /** Recibe: intArr, un array de enteros de longitud cualquiera
     * Devuelve: toStr, un array con los valores de intArr pasados a cadenas*/
    public static String[] intToString (int[] intArr) {
        Arrays.sort(intArr);
        String[] toStr = new String[intArr.length];
        for (int i = 0; i < intArr.length; i++) {
            toStr[i] = String.valueOf(intArr[i]);
        }
        return toStr;
    }
}
