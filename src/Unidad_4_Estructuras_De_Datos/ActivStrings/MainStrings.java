package Unidad_4_Estructuras_De_Datos.ActivStrings;

public class MainStrings {
    String miTexto = "Lorem ipsum dolor sit amet. Consectetur adipiscing elit. Nam vel.";
    public static void main(String[] args) {
        /* char[] chars = {'H', 'o', 'l', 'a'};
        String myStr = new String(chars);
        System.out.println(myStr);
        findChar(myStr, 2);
        myStr.split(".");*/

        String a = "Hola";
        findChar(a, 2);
    }

    public static void findChar(String str, int pos) {
        if (pos <= str.length() && pos >= 0) {
            System.out.println("El caracter en la posición " + pos + " es: " + str.charAt(pos - 1));
        }
        else System.out.println("Posición no válida.");
    }

    public static void imprimeLongitudCadena(String s) {
        System.out.println("La longitud de " + s + " es " + s.length());
    }

    public static void encontrarOcurrencias(String s, char target) {
        int contador = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                contador++;
            }
        }
        System.out.println("El caracter " + target + " se ha encontrado " + contador + " veces.");
    }


    public void imprimirCadenasEnOrdenAlfabetico(String[] cadenas) {

    }

    public void encriptar(String textoAEncriptar) {
        // split por "." y reemplazar letras por nums equiv.

    }
}
