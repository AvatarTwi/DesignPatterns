package Observer;

public class Test {
    public static void main(String[] args) {
        AbstractProgram program = new Program();
        program.add(new Avatar1());
        program.add(new Avatar2());
        program.operation();
    }
}
