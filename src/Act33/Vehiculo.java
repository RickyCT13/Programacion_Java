package Act33;

public class Vehiculo {
    private Integer condicion;
    private String matricula;
    private Integer year;

    public Boolean isDriveable() {
        if (condicion < 0 && condicion > 100) {
           return null;
        }
        if (condicion < 35) {
            return false;
        }
        else return true;
    }

    public void conducir() {
        if (isDriveable()) {
            System.out.println("Vroom Vroom");
        } else {
            System.out.println("¡Este vehículo está demasiado dañado para conducir!");
        }
    }

    public void reparar() {
        if (!isDriveable()) {
            while (condicion <= 35) {
                condicion++;
            }
        }
        else System.out.println("Tu vehículo ya esta en buen estado para conducir, por lo que no es necesario repararlo.");
    }

    public Integer getCondicion() {
        return condicion;
    }
    public String getMatricula() {
        return matricula;
    }
    public Integer getYear() {
        return year;
    }

    public void setCondicion(Integer condicion) {
        this.condicion = condicion;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
}
