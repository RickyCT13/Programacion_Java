package ActsUD4.Practica4.Ejercicio1;

public class Circle extends Geometry implements Coloreable {
    private double radius;
    private String color;

    Circle(){}

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void colorear(String color) {
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return (Math.PI*(Math.pow(radius, 2)));
    }

    @Override
    public double calculatePerimeter() {
        return (Math.PI*(radius * 2));
    }
}
