package Act31composicionherencia;

public class Direccion {
    private String calle;
    private Integer numero;

    /**
     * Constructores
     */
    public Direccion() {
    }

    public Direccion(String calle, Integer numero) {
        this.calle = calle;
        this.numero = numero;
    }

    /**
     * Getters
     */
    public String getCalle() {
        return calle;
    }

    public Integer getNumero() {
        return numero;
    }

    /**
     * Setters
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }


}

