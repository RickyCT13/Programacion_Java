package Polimorfismo;

public class Main {
    public static void main(String[] args) {

        //Polimorfismo mediante herencia

        Superclase s;

        s = new SubclaseA();
        s.metodo();

        s = new SubClaseB();
        s.metodo();

        s = new Superclase();
        s.metodo();

        // Polimorfismo mediante interfaces

        Interfaz i;

        i = new ImpA();
        i.metodoI();

        i = new ImpB();
        i.metodoI();

        i = new Interfaz() {
            @Override
            public void metodoI() {
                System.out.println("Método de un objeto Interfaz");
            }
        };
        i.metodoI();

    }
}
