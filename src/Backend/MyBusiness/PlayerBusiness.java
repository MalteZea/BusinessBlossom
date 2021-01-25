package Backend.MyBusiness;

import Backend.Market.Ware;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;


public class PlayerBusiness {

    Random random = new Random();
    private long businessCapital = 0;
    private ArrayList<Ware> inventory = new ArrayList<>();
    private int batchProductionTimer = 9;
    private static int productionProgress = 8;
    private double wareQuality = 1.0;
    private int productionAmount = 10;

    public void runBusiness() {
        batchProduction();
    }


    public void soldWare(int sellprice) {
        this.businessCapital = businessCapital + sellprice;
    }

    //TODO add quality level

    //Produce batch ware.
    private void batchProduction() {
        if (productionProgress == batchProductionTimer) {
            int thisBatchNumber = random.nextInt(999999);
            for (int i = 0; i < productionAmount; i++) {
                inventory.add(new Ware(thisBatchNumber, wareQuality));
            }
            System.out.println("Production finished. " + inventory.size() + " in inventory.");
        }
        productionProgress++;
        if (productionProgress > batchProductionTimer) {
            productionProgress = 0;
        }
        Collections.sort(inventory, Comparator.comparingInt(Ware::getWareRatio));
    }

    //Set sell price for each ware in the batch.
    public void setSellPrice(int batchNumber, int sellPrice) {
        for (Ware ware : inventory) {
            if (batchNumber == ware.getBatchNumber()) {
                ware.setSellPrice(sellPrice);
            }
        }
    }

    public long getBusinessCapital() {
        return businessCapital;
    }

    public ArrayList<Ware> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Ware> inventory) {
        this.inventory = inventory;
    }

    public int getBatchProductionTimer() {
        return batchProductionTimer;
    }

    public static int getProductionProgress() {
        return productionProgress;
    }

    public double getWareQuality() {
        return wareQuality;
    }

    public int getProductionAmount() {
        return productionAmount;
    }

    public void setProductionAmount(int productionAmount) {
        this.productionAmount = productionAmount;
    }
}
