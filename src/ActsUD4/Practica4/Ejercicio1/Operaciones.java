package ActsUD4.Practica4.Ejercicio1;

public class Operaciones {
    public static Double[] calculateAreas (Geometry[] shapes) {
        if (shapes == null) {
            return null;
        }
        Double[] areas = new Double[shapes.length];
        for (int i = 0; i < shapes.length; i++) {
            areas[i] = shapes[i].calculateArea();
        }
        return areas;
    }
}
