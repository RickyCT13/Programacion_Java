package Act_3_5_Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Animal a;

        a = new Lion();
        a.speak();

        a = new Bird();
        a.speak();
        ((Bird) a).fly();
        
        /* Instrumento ins;
        
        ins = new Guitarra();
        ins.tocar();
        
        ins = new Tambor();
        ins.tocar(); */
    }
}
