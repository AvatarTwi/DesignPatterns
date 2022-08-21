package Observer;

public class Program extends AbstractProgram{
    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
