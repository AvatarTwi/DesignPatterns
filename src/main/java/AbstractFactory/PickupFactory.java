package AbstractFactory;

public class PickupFactory implements Factory{
    @Override
    public Car make() {
        System.out.println("Make a Pickup.");
        return new Pickup();
    }
}
