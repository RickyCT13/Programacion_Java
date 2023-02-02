package ActsUD4.EjemploString2;

public class MainStr2 {
    public static void main(String[] args) {
        //TODO: Numero entero primitivo num1 valor 1
        int num1 = 1;

        //TODO: Numero entero envoltorio de nombre num2 y valor 2
        Integer num2 = Integer.valueOf(2);
        Integer num3 = new Integer(3);
        Integer num4 = 4;

        //TODO: Imprimir el valor de cadena de num1
        System.out.println(num1 + "");
        System.out.println(String.valueOf(num1));

        //TODO: Imprimir valor por cadena de num2
        System.out.println(Integer.toString(num2));
        System.out.println(num2.toString());
        System.out.println(num2);
        System.out.println(num2 + "");
        System.out.println(String.valueOf(num2));
    }
}
