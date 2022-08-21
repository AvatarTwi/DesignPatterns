package Adapter.ForPort;

public class Test {
    public static void main(String[] args) {
        KeyOrigin person1=new Person1();
        person1.room2();
        person1.room3();

        KeyOrigin person2=new Person2();
        person2.room1();
    }
}
