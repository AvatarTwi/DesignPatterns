package Observer;

public class Avatar1 implements User{
    @Override
    public void update() {
        System.out.println("Avatar1 has received.");
    }
}
