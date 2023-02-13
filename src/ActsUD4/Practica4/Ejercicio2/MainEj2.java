package ActsUD4.Practica4.Ejercicio2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MainEj2 {
    public static void main(String[] args) {
        String myText = "Este es un texto. Texto. El patio de mi casa es particular.";
        System.out.println(countDiffWords(myText));
    }
    public static int countDiffWords(String text) {
        Pattern pattern = Pattern.compile("\s", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }
}
