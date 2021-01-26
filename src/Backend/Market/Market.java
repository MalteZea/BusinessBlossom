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
            for (int k = 0; k < pB.getInventory().size(); k++) {
                if (consumers.get(i).getHighestRatio() >= pB.getInventory().get(k).getWareRatio() &&
                        consumers.get(i).getHighestPriceWilling() >= pB.getInventory().get(k).getSellPrice() &&
                        consumers.get(i).getLowestQualityDemand() <= pB.getInventory().get(k).getQuality()) {
                    pB.soldWare(pB.getInventory().get(k).getSellPrice());
                    System.out.println("A ware was sold for " + pB.getInventory().get(k).getSellPrice() + "$");
                    ArrayList<Ware> tempInventory = pB.getInventory();
                    tempInventory.remove(k);
                    pB.setInventory(tempInventory);
                    consumers.remove(i);
                    break;
                }
            }


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
