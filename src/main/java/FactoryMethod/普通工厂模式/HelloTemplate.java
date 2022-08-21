package FactoryMethod.普通工厂模式;

public class HelloTemplate implements Template {
    @Override
    public void Print() {
        System.out.println("this is HelloTemplate!");
    }
}
