package ActsUD4.Act4_3;

import java.util.Arrays;

public class Main43 {
    public static void main(String[] args) {
        int[] a = Metodos.arrayRand();
        int[] b = {1, 2, 3, 5, 7, 9, 13, 15, 20, 21};
        int[] c1 = {2,4,6,8};
        int[] c2 = {1,3,5,7};
        Metodos.printArrayInv(a);
        Metodos.searchSequential(a, 7);
        Metodos.searchBinary(a, 7);
        Metodos.searchSequential(b, 7);
        Metodos.sortArray(a);
        if (!Metodos.compareArrays(c1, c2)) {
            System.out.println("Unidad_4_Estructuras_De_Datos.Arrays distintos");
        }
        else {
            System.out.println("Unidad_4_Estructuras_De_Datos.Arrays iguales");
        }
        int[] arrayQueSeCopia = {1,2,3,4};
        int[][] arrayDestinoCopia = new int[4][4];
        int[] copia1 = arrayQueSeCopia.clone();
        int[] copia2 = Arrays.copyOf(arrayQueSeCopia, 4);
        int[] copia3 = Arrays.copyOfRange(arrayQueSeCopia, 0, 4);
        arrayDestinoCopia[0] = copia1;
        arrayDestinoCopia[1] = copia2;
        arrayDestinoCopia[2] = copia3;
        System.arraycopy(arrayQueSeCopia, 0, arrayDestinoCopia[3], 0, 4);
        System.out.println("Copia completa");
    }
}
