package Bridge;

public class DriverManager extends AbstractManager{
    public void build(){
        getDatabase().build();
    }
}
