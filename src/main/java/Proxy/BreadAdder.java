package Proxy;

public class BreadAdder implements Maker {

    private Maker maker;

    public BreadAdder(){
        super();
        maker=new MeatPie();
    }

    @Override
    public void makeHamburger() {
        before();
        maker.makeHamburger();
        after();
    }

    public void before(){
        System.out.println("Bread");
    }

    public void after(){
        System.out.println("Bread");
    }
}
