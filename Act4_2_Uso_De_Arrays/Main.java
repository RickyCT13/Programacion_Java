package Act4_2_Uso_De_Arrays;

public class Main {
    public static int[][] crearTabla(int a) {
        int b, c;
        b = 1;
        c = a*b;
        int[][] tabla = {{a,b,c}, {a,b+1,c}, {a,b+2,c}, {a,b+3,c}, {a,b+4,c}, {a,b+5,c}, {a,b+6,c}, {a,b+7,c}, {a,b+8,c}, {a,b+9,c}};
        return tabla;
    }
    public static void main(String[] args) {
        int[][] tablaEj = {{1,1,1}, {1,2,2}, {1,3,3}, {1,4,4}, {1,5,5}, {1,6,6}, {1,7,7}, {1,8,8}, {1,9,9}, {1,10,10}};
        int[][][] tablaCompleta = {crearTabla(1), crearTabla(2), crearTabla(3), crearTabla(4), crearTabla(5),
                crearTabla(6), crearTabla(7), crearTabla(8), crearTabla(9), crearTabla(10)};
    }
}
