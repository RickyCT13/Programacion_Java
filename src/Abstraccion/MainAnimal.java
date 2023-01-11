package Abstraccion;

public class MainAnimal {
    public static void main(String[] args) {
        Animal a = new Perro();
        System.out.println("Numero de patas: " + a.getNumPatas());
        System.out.println("Mamifero: " + a.checkMamifero());

    }
}
