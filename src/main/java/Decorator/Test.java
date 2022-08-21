package Decorator;

public class Test {
    public static void main(String[] args) {
        Maker meatPie = new MeatPie();
        Bread bread = new Bread(meatPie);
        bread.makeHamburger();
    }
}
