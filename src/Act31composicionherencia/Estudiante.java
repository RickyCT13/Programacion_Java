package Act31composicionherencia;

public class Estudiante extends Persona {
    private String ID;

    /**
     * Constructores
     */
    public Estudiante() {
        
    }

    public Estudiante(String ID) {
        this.ID = ID;
    }

    public Estudiante(String name, Integer age, String calle, Integer numero, String ID) {
        super(name, age, calle, numero);
        this.ID = ID;
    }
    /**
     * Getters
     */
    public String getID() {
        return ID;
    }

    /**
     * Setters
     */
    public void setID(String ID) {
        this.ID = ID;
    }
    
    /**
     * Métodos
     */
    @Override
    public void presentar() {
        System.out.printf("Nombre: %s%n Edad: %d%n Dirección: %s %d%n ID de estudiante:%s%n", getName(), getAge(), getCalle(), getNumero(), getID());
    }
}
