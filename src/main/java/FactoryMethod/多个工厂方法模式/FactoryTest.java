package FactoryMethod.多个工厂方法模式;

public class FactoryTest {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Template tmp1 = printer.produceHello();
        Template tmp2 = printer.produceWorld();
        tmp1.Print();
        tmp2.Print();
    }
}
