package Bridge;

public class Test {
    public static void main(String[] args) {
        AbstractManager driverManager = new DriverManager();

        MySQL mySQL = new MySQL();
        driverManager.setDatabase(mySQL);
        driverManager.build();

        PostgreSQL postgreSQL = new PostgreSQL();
        driverManager.setDatabase(postgreSQL);
        driverManager.build();
    }
}
