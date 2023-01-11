package Act31composicionherencia;

public class Persona {
    private String name;
    private Integer age;
    private Direccion dir = new Direccion();

    /**
     * Constructores
     */
    public Persona() {
    }
    public Persona(String name, Integer age, String calle, Integer numero) {
        this.name = name;
        this.age = age;
        this.dir.setCalle(calle);
        this.dir.setNumero(numero);
    }
    /**
     * Getters
     */
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getCalle() {
        return dir.getCalle();
    }
    public Integer getNumero() {
        return dir.getNumero();
    }

    /**
     * Setters
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCalle(String calle) {
        this.setCalle(calle);
    }

    public void setNumero(Integer numero) {
        this.setNumero(numero);
    }
    /**
     * Métodos
     */
    public void presentar() {
        System.out.printf("Nombre: %s%n Edad: %d%n Dirección: %s %d%n", name, age, dir.getCalle(), dir.getNumero());
    }
}
