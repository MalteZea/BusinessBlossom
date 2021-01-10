package Backend.Market;

import java.util.ArrayList;

public class Demand {

    ArrayList<Consumer> consumers = new ArrayList<>();

    public void newDemand(Consumer consumer){
        consumers.add(consumer);
    }
}
