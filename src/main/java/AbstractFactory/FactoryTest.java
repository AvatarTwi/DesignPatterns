package AbstractFactory;

public class FactoryTest {
    public static void main(String[] args) {
        Factory pickupFactory = new PickupFactory();
        Car pickup = pickupFactory.make();
        pickup.run();

        Factory roadsterFactory = new RoadsterFactory();
        Car roadster = roadsterFactory.make();
        roadster.run();
    }
}
