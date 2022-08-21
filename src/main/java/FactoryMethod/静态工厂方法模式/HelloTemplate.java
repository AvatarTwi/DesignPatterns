package FactoryMethod.静态工厂方法模式;

public class HelloTemplate implements Template {
    @Override
    public void Print() {
        System.out.println("this is HelloTemplate!");
    }
}
