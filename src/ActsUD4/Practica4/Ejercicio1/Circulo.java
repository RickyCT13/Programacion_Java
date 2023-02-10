package ActsUD4.Practica4.Ejercicio1;

public class Circulo extends Geometria implements Coloreable {
    private double radio;
    private String color;

    Circulo(){}


    @Override
    public void colorear(String color) {
        this.color = color;
    }

    @Override
    double calcularArea() {
        return (Math.PI*(Math.pow(radio, 2)));
    }

    @Override
    double calcularPerimetro() {
        return (Math.PI*(radio*2));
    }
}
