package Decorator;

public class Bread implements Maker{

    private Maker maker;

    public Bread(Maker meatpie){
        super();
        maker=meatpie;
    }

    @Override
    public void makeHamburger() {
        System.out.println("Bread");
        maker.makeHamburger();
        System.out.println("Bread");
    }
}
