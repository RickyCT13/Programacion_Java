package ActsUD4.Arrays;
public class Main {
    public static void main(String[] args) {
        // Crear e imprimir por consola un array de los 5 primeros numeros enteros
        Integer[] enteros = {1, 2, 3, 4, 5};//Integer[] enteros = new Integer[5];
        for (Integer i = 0, j = enteros.length; i < j; i++) {
            System.out.printf("%d ", enteros[i]);
        }

    }
}
