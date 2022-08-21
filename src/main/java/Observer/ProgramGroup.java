package Observer;

public interface ProgramGroup {
    /*增加观察者*/
    public void add(User user);

    /*删除观察者*/
    public void del(User user);

    /*通知所有的观察者*/
    public void notifyObservers();

    /*自身的操作*/
    public void operation();
}
