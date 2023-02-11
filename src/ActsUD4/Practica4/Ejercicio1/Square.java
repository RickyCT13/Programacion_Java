package ActsUD4.Practica4.Ejercicio1;

public class Square extends Geometry implements Coloreable{
    private Double sideLength;

    private String color;

    public Square(){}

    public Square(Double sideLength, String color) {
        this.sideLength = sideLength;
        this.color = color;
    }

    public Double getSideLength() {
        return sideLength;
    }

    public void setSideLength(Double sideLength) {
        this.sideLength = sideLength;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideLength=" + sideLength +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void colorear(String color) {
        this.color = color;
    }

    @Override
    double calculateArea() {
        return Math.pow(sideLength, 2);
    }

    @Override
    double calculatePerimeter() {
        return sideLength *4;
    }
}
