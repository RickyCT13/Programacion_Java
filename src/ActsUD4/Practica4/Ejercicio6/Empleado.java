package ActsUD4.Practica4.Ejercicio6;

public class Empleado {
    private String idEmpleado;
    private String dni;
    private String nombre;
    private final String[] apellidos = new String[2];
    private short annoNacimiento;
    private boolean reduccionJornada;
    private String departamento;


    /** Métodos Constructores */
    public Empleado() {}
    public Empleado(String idEmpleado, String dni, String nombre, String apellido1, String apellido2, short annoNacimiento, boolean reduccionJornada, String departamento) {
        this.idEmpleado = idEmpleado;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos[0] = apellido1;
        this.apellidos[1] = apellido2;
        this.annoNacimiento = annoNacimiento;
        this.reduccionJornada = reduccionJornada;
        this.departamento = departamento;
    }



    /** Getters y Setters de Empleado */
    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String[] getApellidos() {
        return apellidos;
    }

    public short getAnnoNacimiento() {
        return annoNacimiento;
    }

    public boolean getReduccionJornada() {
        return reduccionJornada;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellido1, String apellido2) {
        this.apellidos[0] = apellido1;
        this.apellidos[1] = apellido2;
    }

    public void setAnnoNacimiento(short annoNacimiento) {
        this.annoNacimiento = annoNacimiento;
    }

    public void setReduccionJornada(boolean reduccionJornada) {
        this.reduccionJornada = reduccionJornada;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
