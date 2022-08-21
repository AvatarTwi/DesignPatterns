package AbstractFactory;

public class RoadsterFactory implements Factory{
    @Override
    public Car make() {
        System.out.println("Make a Roadster.");
        return new Roadster();
    }
}
