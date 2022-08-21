package FactoryMethod.静态工厂方法模式;

public class Printer {

    public static Template produceHello() {
        return new HelloTemplate();
    }
    public static Template produceWorld() {
        return new WorldTemplate();
    }
}