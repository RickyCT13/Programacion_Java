package ActsUD4.Practica4.Ejercicio5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MetodosEj5 {
    public static int findInText(String text, String word, String searchType) {
        String myRegex = null;
        switch (searchType) {
            // Para búsquedas sólo de la palabra
            case "regularSearch":
                myRegex = "\\s*" + word + "\\s*";
                break;
            // Para búsuqedas de palabras que incluyen la sequencia en el texto.
            case "includesSequence":
                myRegex = word;
                break;
        }
        assert myRegex != null;
        Pattern pat = Pattern.compile(myRegex, Pattern.CASE_INSENSITIVE);
        Matcher match = pat.matcher(text);
        int counter = 0;
        while (match.find()) {
            counter++;
        }
        return counter;
    }
}
