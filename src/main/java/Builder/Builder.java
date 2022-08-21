package Builder;


import java.util.ArrayList;
import java.util.List;

public class Builder {

    private List<Car> list = new ArrayList<Car>();

    public void producePickup(int count){
        for(int i=0; i<count; i++){
            list.add(new Pickup());
        }
    }

    public void produceRoadster(int count){
        for(int i=0; i<count; i++){
            list.add(new Roadster());
        }
    }
}