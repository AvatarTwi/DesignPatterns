package Adapter.ForObject;

public class Device implements Switch {

    private Socket socket;

    public Device(Socket s){
        super();
        socket=s;
    }

    @Override
    public void PowerSupply() {
        socket.PowerSupply();
    }

    @Override
    public void OpenUp() {
        System.out.println("Starting up......");
    }
}
