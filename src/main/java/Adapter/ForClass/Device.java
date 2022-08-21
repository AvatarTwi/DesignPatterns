package Adapter.ForClass;

public class Device extends Socket implements Switch{

    @Override
    public void OpenUp() {
        System.out.println("Starting up......");
    }
}
