package Bridge;

public abstract class AbstractManager {
    private DatabaseTemplate template;

    public void setDatabase(DatabaseTemplate databaseTemplate){
        template=databaseTemplate;
    }

    public DatabaseTemplate getDatabase(){
        return template;
    }

    public void build(){
        template.build();
    }
}
