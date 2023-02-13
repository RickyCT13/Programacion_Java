package ActsUD4.Practica4.Ejercicio1;

import java.util.Arrays;

public class MainEj1 {
    public static void main(String[] args) {
        Geometry t0 = new Triangle(3d, 4.5d, "Red", 4.5d, 3.33d, 3d);
        Geometry t1 = new Triangle(4.5d, 3d, "Yellow", 4d, 4.5d, 3d);
        Geometry s0 = new Square(5d, "Green");
        Geometry s1 = new Square(7.55d, "Purple");
        Geometry s2 = new Square(15.35d, "Gray");
        Geometry c0 = new Circle(8.462d, "White");
        Geometry c1 = new Circle(19.333d, "Black");


        Geometry[] shapes = {t0, t1, s0, s1, s2, c0, c1};
        System.out.println(Arrays.toString(shapes));
        Operaciones.paintFirstBlue(shapes);
        System.out.println(Arrays.toString(shapes));

        System.out.println(Operaciones.calculateAllAreas(shapes));
        System.out.println(Operaciones.calculateAllPerimeters(shapes));
    }
}
