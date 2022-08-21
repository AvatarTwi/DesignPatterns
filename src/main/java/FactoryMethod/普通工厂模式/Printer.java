package FactoryMethod.普通工厂模式;

public class Printer {

    public Template produce(String type) {
        if ("Hello".equals(type)) {
            return new HelloTemplate();
        } else if ("World".equals(type)) {
            return new WorldTemplate();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}