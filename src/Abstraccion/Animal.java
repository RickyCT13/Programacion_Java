package Abstraccion;
// Las clases abstractas son aquellas que no se pueden instanciar.
// Mientras que es posible
abstract class Animal {
    Integer numPatas;
    Boolean esMamifero;
    // Los métodos abstractos no tienen cuerpo y han de ser sobreescritos cuando se usan en clases hijas
    abstract Integer getNumPatas();
    abstract Boolean checkMamifero();

}
