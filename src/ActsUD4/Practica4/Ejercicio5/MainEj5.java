package ActsUD4.Practica4.Ejercicio5;

public class MainEj5 {
    public static void main(String[] args) {
        String myText = "Java es un lenguaje de programación orientada a objetos. Una de las peculiaridades de Java respecto a otros lenguajes de programación orientada a objetos es que no admite la herencia múltiple.";
        System.out.println("Veces que la palabra aparece en el texto: " + MetodosEj5.findInText(myText, "admite", "regularSearch"));
    }
}
