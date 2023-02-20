package ActsUD4.Practica4.Ejercicio4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetodosEj4 {
    public boolean isValid (String dni) {
        Pattern pattern = Pattern.compile("[0-9]{8}[A-Z]");
        Matcher matcher = pattern.matcher(dni);
        int num = Integer.parseInt(dni);
        if (!matcher.find() || dni.charAt(8) != calculateControlChar(num)) {
            return false;
        }
        return true;
    }
    public char calculateControlChar (int num) {
        char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letters[num % 23];
    }
}
