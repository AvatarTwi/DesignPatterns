package Adapter.ForObject;

public class Test {
    public static void main(String[] args) {
        Socket socket = new Socket();
        Device device = new Device(socket);
        device.OpenUp();
        device.PowerSupply();
    }
}
