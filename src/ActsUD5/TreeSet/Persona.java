package ActsUD5.TreeSet;

import ActsUD5.EjemploComparadores.ComparadorPorEdad;

public class Persona extends ComparadorPorEdad implements Comparable {
    private String name;
    private Integer age;

    public Persona(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Persona() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object other) {
        Persona otherPersona = (Persona) other;
        Integer compName = this.name.compareTo(otherPersona.name);
        Integer compAge = this.age.compareTo(otherPersona.age);
        return compName.compareTo((compAge)*-1);
    }
    /*@Override
    public int compareTo(Object other) {
        Persona otherPersona = (Persona)other;
        return this.name.compareTo(otherPersona.name);
    }*/

    /*@Override
    public int compare(Object o1, Object o2) {
        Persona other1 = (Persona) o1;
        Persona other2 = (Persona) o2;
        return other1.age.compareTo(other2.age);
    }*/
}