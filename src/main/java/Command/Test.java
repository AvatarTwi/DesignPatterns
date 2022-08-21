package Command;

public class Test {
    public static void main(String[] args) {
        Soldier receiver = new Soldier();
        Command myCommand = new MyCommand(receiver);
        Commander invoker = new Commander(myCommand);
        invoker.action();
    }
}
