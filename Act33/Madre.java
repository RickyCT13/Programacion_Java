package Act33;

public class Madre extends Abuela {
    public void esElCieloAzul () {
        System.out.println("Sí.");
    }
    @Override
    public void year() {
        if (year % 4 == 0) {
            System.out.println(" no es bisiesto");
        } else System.out.println(" es bisiesto");
    }
}

