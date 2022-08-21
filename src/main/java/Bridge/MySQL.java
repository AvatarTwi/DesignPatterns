package Bridge;

public class MySQL implements DatabaseTemplate{

    @Override
    public void build() {
        System.out.println("Build MySQL");
    }
}
