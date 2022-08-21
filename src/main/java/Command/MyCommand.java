package Command;

public class MyCommand implements Command{
    private Soldier receiver;

    public MyCommand(Soldier receiver){
        this.receiver=receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
