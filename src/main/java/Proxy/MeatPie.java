package Proxy;

public class MeatPie implements Maker {
    @Override
    public void makeHamburger() {
        System.out.println("Ketchup");
        System.out.println("Vegetable");
        System.out.println("Meat Pie");
    }
}
