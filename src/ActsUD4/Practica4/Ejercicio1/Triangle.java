package ActsUD4.Practica4.Ejercicio1;

import java.util.Arrays;
import java.util.Objects;

public class Triangle extends Geometry implements Coloreable {
    private Double base;
    private Double height;
    private final Double[] sides = new Double[3];
    private String color;

    public Triangle(){}

    public Triangle(Double base, Double height, String color, Double a, Double b, Double c) {
        this.base = base;
        this.height = height;
        this.color = color;
        this.setSides(a, b, c);
    }

    public String getColor() {
        return color;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double[] getSides() {
        return sides;
    }

    public void setSides(Double a, Double b, Double c) {
        sides[0] = a;
        sides[1] = b;
        sides[2] = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", sides=" + Arrays.toString(sides) +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void colorear(String color) {
        this.color = color;
    }

    @Override
    double calculateArea() {
        for (Double side : getSides()) {
            if (Objects.equals(side, base)) {
                return ((base* height)/2);
            }
        }
        return 0;
    }

    @Override
    double calculatePerimeter() {
        return (sides[0] + sides[1] + sides[2]);
    }
}
