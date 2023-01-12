package Act_3_5_Polimorfismo;

public class Bird extends Animal implements Flyable {
    @Override
    public void speak() {
        System.out.println("*El pájaro pía*");
    }
    @Override
    public void fly() {
        System.out.println("*El pájaro vuela*");
    }
}
