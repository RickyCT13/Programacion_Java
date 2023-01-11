package Act33;

public class Automovil extends Vehiculo {
    final private static Integer NUM_RUEDAS = 4;

    public void damage() {
        if (getCondicion() > 0) {
            setCondicion(getCondicion()-20);
        }
    }
}
