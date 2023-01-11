package Abstraccion;

public class Perro extends Animal {
    final static Integer NUM_PATAS = 4;
    final static Boolean ES_MAMIFERO = true;
    @Override
    Integer getNumPatas() {
        return NUM_PATAS;
    }
    Boolean checkMamifero() {
        return ES_MAMIFERO;
    }
}
