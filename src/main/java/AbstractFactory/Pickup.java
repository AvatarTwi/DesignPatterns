package AbstractFactory;

public class Pickup implements Car{
    @Override
    public void run() {
        System.out.println("Pickup run.");
    }
}
