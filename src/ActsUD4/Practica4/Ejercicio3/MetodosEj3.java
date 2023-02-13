package ActsUD4.Practica4.Ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class MetodosEj3 {
    public static void arrayRandom() {
        Scanner input = new Scanner(System.in);

        Integer[] arrand = new Integer[100];
        for (int i = 0; i < arrand.length; i++) {
            arrand[i] = (int) (Math.random()*1001);
        }
        System.out.println(Arrays.toString(arrand));
        System.out.println("Dados 100 numero aleatorios, escoja una opción : \n" +
                "1. Saber el mayor de los números \n" +
                "2. Saber el menor de los números \n" +
                "3. Obtener la suma de todos los numeros \n" +
                "4. Obtener la media de todos los números \n" +
                "5. Sustituir el valor de uno de los elementos (Si existe) por otro \n" +
                "6. Salir");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("El número mas grande es: " + biggestNumber(arrand));

            case 2:
                System.out.println("El número más pequeño es: " + smallestNumber(arrand));;
                break;
            case 3:
                System.out.println("La suma de todos los números es " + sumTotal(arrand));
                break;
            case 4:
                System.out.println("La media de todos los números es: " + mean(arrand));;
                break;
            case 5:
                System.out.println("Introduzca, en orden, el valor que desea reemplazar y el valor que lo reemplaza: ");
                Integer oldValue = input.nextInt();
                Integer newValue = input.nextInt();
                replace(arrand, oldValue, newValue);
                System.out.println("Hecho.");
                break;
            case 6:
                break;
        }

    }
    public static Integer biggestNumber(Integer[] a) {
        Arrays.sort(a);
        return a[a.length - 1];
    }
    public static Integer smallestNumber(Integer[] a) {
        Arrays.sort(a);
        return a[0];
    }
    public static Integer sumTotal(Integer[] a) {
        Integer i = 0;
        for (Integer num : a) {
            i += num;
        }
        return i;
    }
    public static Integer mean(Integer[] a) {
        return(sumTotal(a)/a.length);
    }
    public static void replace(Integer[] a, Integer oldValue, Integer newValue) {
        Integer indexOfValue = Arrays.binarySearch(a, oldValue);
        if (indexOfValue < 0) {
            System.out.println("Error: El valor no se encuentra dentro de este array");
        }
        a[indexOfValue] = newValue;
        System.out.println("Hecho! Reemplazado el número " + oldValue + "por " + newValue + ".");
    }
}
