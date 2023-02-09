package ActsUD5.TreeSet;

public class Persona implements Comparable {
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
        return "Persona: {\'" + name + "\'}";
    }

    @Override
    public int compareTo(Object other) {
        Persona otherPersona = (Persona)other;
        return this.name.compareTo(otherPersona.name);
    }
}
