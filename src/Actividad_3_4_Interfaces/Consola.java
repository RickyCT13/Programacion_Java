package Actividad_3_4_Interfaces;

public class Consola implements Imprimible {
    String pantalla = "$";
    @Override
    public void imprime() {
        System.out.printf("%S!", pantalla);
    }
    public void establecerContenido(String content) {
        pantalla += " " + content;
    }

}
