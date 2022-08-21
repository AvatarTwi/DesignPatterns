package FactoryMethod.多个工厂方法模式;

public class Printer {

    public Template produceHello() {
        return new HelloTemplate();
    }
    public Template produceWorld() {
        return new WorldTemplate();
    }
}