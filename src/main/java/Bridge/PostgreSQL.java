package Bridge;

public class PostgreSQL implements DatabaseTemplate{

    @Override
    public void build() {
        System.out.println("Build PostgreSQL");
    }
}
