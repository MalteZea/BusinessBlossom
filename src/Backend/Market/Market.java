package Backend.Market;

import Backend.MyBusiness.PlayerBusiness;

import java.util.ArrayList;
import java.util.Random;

public class Market {

    Random random = new Random();
    private ArrayList<Consumer> consumers = new ArrayList<>();

    public void marketLife(PlayerBusiness pB) {
        newDemand();
        searchForWare(pB);
    }

    //Create a new demand each day.
    private void newDemand() {
        int fluctuation = random.nextInt(15);
        for (int i = 0; i < fluctuation; i++) {
            consumers.add(new Consumer());
        }
    }

    //TODO remove consumer when they expire
    //Search for a ware and remove consumer and ware.
    private void searchForWare(PlayerBusiness pB) {
        for (int i = 0; i < consumers.size(); i++) {
            consumers.get(i);


        }
        /*for (Consumer consumer : consumers) {
            for (Ware ware : pB.getInventory()) {
                if (consumer.getHighestRatio() >= ware.getWareRatio() && consumer.getHighestPriceWilling() >= ware.getSellPrice()
                        && consumer.getLowestQualityDemand() <= ware.getQuality()) {
                    pB.soldWare(ware.getSellPrice());
                    System.out.println("A ware was sold for " + ware.getSellPrice() + "$");
                }
            }
        }*/
    }

    public ArrayList<Consumer> getConsumers() {
        return consumers;
    }
}
