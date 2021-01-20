package Backend.MyBusiness;

import Backend.Market.Ware;
import Backend.Time;

import java.util.ArrayList;


public class PlayerBusiness {

    Ware ware = new Ware();
    private ArrayList<Ware> inventory = new ArrayList<>();
    private int batchProductionTimer = 10;
    private double wareQuality;
    private int productionAmount = 10;

    public void runBusiness(){
        batchProduction();
    }

    //TODO Produce batch ware
private void batchProduction(){
    ware.setQuality(wareQuality);
    if (Time.getToday() % batchProductionTimer == 0)
        for (int i = 0; i < productionAmount; i++) {
            inventory.add(ware);
        }

}

    //TODO Set sell price

    public ArrayList<Ware> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Ware> inventory) {
        this.inventory = inventory;
    }

    public int getBatchProductionTimer() {
        return batchProductionTimer;
    }

    public void setBatchProductionTimer(int batchProductionTimer) {
        this.batchProductionTimer = batchProductionTimer;
    }

    public double getWareQuality() {
        return wareQuality;
    }

    public void setWareQuality(double wareQuality) {
        this.wareQuality = wareQuality;
    }

    public int getProductionAmount() {
        return productionAmount;
    }

    public void setProductionAmount(int productionAmount) {
        this.productionAmount = productionAmount;
    }
}
