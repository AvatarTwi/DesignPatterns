package Observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractProgram implements ProgramGroup{
    private Vector<User> vector = new Vector<User>();
    @Override
    public void add(User user) {
        vector.add(user);
    }

    @Override
    public void del(User user) {
        vector.remove(user);
    }

    @Override
    public void notifyObservers() {
        Enumeration<User> enumo = vector.elements();
        while(enumo.hasMoreElements()){
            enumo.nextElement().update();
        }
    }
}
