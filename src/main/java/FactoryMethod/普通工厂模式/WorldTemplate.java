package FactoryMethod.普通工厂模式;

public class WorldTemplate implements Template {

    @Override
    public void Print() {
        System.out.println("this is WorldTemplate!");
    }
}