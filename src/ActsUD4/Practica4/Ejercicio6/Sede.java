package ActsUD4.Practica4.Ejercicio6;

public class Sede {
    private String ciudad;
    private String[] departamentos;

    public Sede() {}

    public Sede(String ciudad, String... deps) {
        this.ciudad = ciudad;
        setDepartamentos(deps);
    }

    public String getCiudad() {
        return ciudad;
    }

    public String[] getDepartamentos() {
        return departamentos;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDepartamentos(String... deps) {
        String[] newDeps = new String[deps.length];
        System.arraycopy(deps, 0, newDeps, 0, deps.length);
        this.departamentos = newDeps;
    }
}
