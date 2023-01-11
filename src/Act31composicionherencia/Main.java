package Act31composicionherencia;

public class Main {
    public static void main(String[] args) {
        Persona per1 = new Persona("Fulanito", 19, "Avenida de la Feria", 12);
        Estudiante est1 = new Estudiante("Menganito", 21, "Calle Consolación", 23, "20032123");
        per1.presentar();
        est1.presentar();
    }
}
