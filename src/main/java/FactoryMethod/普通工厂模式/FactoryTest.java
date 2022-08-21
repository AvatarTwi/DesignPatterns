package FactoryMethod.普通工厂模式;

public class FactoryTest {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Template tmp1 = printer.produce("Hello");
        Template tmp2 = printer.produce("World");
        tmp1.Print();
        tmp2.Print();
    }
}
