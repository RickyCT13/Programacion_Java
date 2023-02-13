package ActsUD4.Practica4.Ejercicio1;

public class Operaciones {
    public static Double calculateAllAreas (Geometry[] shapes) {
        if (shapes == null) {
            return null;
        }
        double totalArea = 0d;
        for (Geometry shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }

    public static Double calculateAllPerimeters (Geometry[] shapes) {
        if (shapes == null) {
            return null;
        }
        double totalPerimeter = 0d;
        for (Geometry shape : shapes) {
            totalPerimeter += shape.calculatePerimeter();
        }
        return totalPerimeter;
    }
    public static void paintFirstBlue(Geometry[] shapes) {
        boolean firstCircle = true, firstSquare = true, firstTriangle = true;
        for (Geometry shape:
             shapes) {
            if (firstCircle && shape instanceof Circle) {
                firstCircle = false;
                ((Circle) shape).colorear("Blue");
            }
            else if (firstSquare && shape instanceof Square) {
                firstSquare = false;
                ((Square) shape).colorear("Blue");
            }
            else if (firstTriangle && shape instanceof Triangle) {
                firstTriangle = false;
                ((Triangle) shape).colorear("Blue");
            }
        }
    }
}
