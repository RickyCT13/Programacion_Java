package Act33;

public class Hija extends Madre{
    public void hola(String name, Integer age) {
        System.out.printf("Hola, soy %s y tengo %d años%n", name, age);
    }
    public Integer suma(Integer a, Integer b, Integer c) {
        return a + b + c;
    }
    @Override
    public void esElCieloAzul() {
        System.out.println("No.");
    }
    public void year() {
        System.out.println("Desde el año 0 han pasado, aproximadamente, 738.400 días.");
    }
}
