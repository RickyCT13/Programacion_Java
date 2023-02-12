package ActsUD4.Practica4.Ejercicio2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// TODO: Escribe un programa que sea capaz de contar el número de palabras diferentes que hay en un texto
//  que se le pasa por argumento, sin tener en cuenta si están escritas en mayúsculas o minúsculas.
public class MetodosEj2 {
    public static int countDiffWords(String text) {
        int wordCount = 0;
        Pattern pattern = Pattern.compile("\s", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            wordCount++;
        }
        return wordCount;
    }
}
