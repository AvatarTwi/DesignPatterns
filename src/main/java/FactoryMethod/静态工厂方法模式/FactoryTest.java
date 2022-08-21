package FactoryMethod.静态工厂方法模式;

public class FactoryTest {
    public static void main(String[] args) {
        Template template1 = Printer.produceHello();
        Template template2 = Printer.produceWorld();
        template1.Print();
        template2.Print();
    }
}
