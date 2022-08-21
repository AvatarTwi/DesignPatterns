package FactoryMethod.多个工厂方法模式;

public class WorldTemplate implements Template {

    @Override
    public void Print() {
        System.out.println("this is WorldTemplate!");
    }
}