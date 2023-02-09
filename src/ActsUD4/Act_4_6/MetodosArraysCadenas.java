package ActsUD4.Act_4_6;

import java.util.Arrays;

public class MetodosArraysCadenas {
    public static void findChar(String str, int pos) {
        if (pos <= str.length() && pos >= 0) {
            System.out.println("El caracter en la posición " + pos + " es: " + str.charAt(pos - 1));
        }
        else System.out.println("Posición no válida.");
    }

    public static void printStringLength(String s) {
        System.out.println("La longitud de " + s + " es " + s.length());
    }

    public static void findCharOccurrences(String s, char target) {
        int contador = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                contador++;
            }
        }
        System.out.println("El caracter " + target + " se ha encontrado " + contador + " veces.");
    }

    public static void printStringsInAlphabeticalOrder(String[] cadenas) {
        Arrays.sort(cadenas);
        System.out.println(Arrays.toString(cadenas));
    }

    public static void encrypt(String textoAEncriptar) {
        // split por "." y reemplazar letras por nums equiv.
        char[] letrasNorm = {'a', 'b', 'e', 'g', 'i', 'o', 's', 't', 'z'};
        char[] letrasEnc = {'4', '6', '3', '9', '1', '0', '5', '7', '2'};
        char[] textoToCharArray = textoAEncriptar.toCharArray();
        for (int i = 0; i < textoAEncriptar.length(); i++) {
            for (int j = 0; j < 9; j++) {
                if (textoToCharArray[i] == letrasNorm[j]) {
                    textoToCharArray[i] = letrasEnc[j];
                }
            }
        }
        String textoFinal = new String(textoToCharArray);

        for (int i = 0; i < textoFinal.split("\\.").length; i++) {
            System.out.println(textoFinal.split("\\.")[i]);
        }
    }

    public static String[] intToString (int[] numArray) {
        Arrays.sort(numArray);
        String[] strArray = new String[numArray.length];
        for (int i = 0; i < numArray.length; i++) {
            strArray[i] = String.valueOf(numArray[i]);
        }
        return strArray;
    }

}
