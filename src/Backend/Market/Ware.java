package Backend.Market;

public class Ware {

    private String name = "Electronics";
    private int batchNumber;
    private double quality = 1.0;
    private int sellPrice = 100;
    private int wareRatio = (int) (sellPrice / quality);

    public Ware() {
    }

    public Ware(int batchNumber, double quality) {
        this.batchNumber = batchNumber;
        this.quality = quality;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        this.batchNumber = batchNumber;
    }

    public double getQuality() {
        return quality;
    }

    public void setQuality(double quality) {
        this.quality = quality;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int getWareRatio() {
        return wareRatio;
    }

    public String toString() {
        return batchNumber + " " + sellPrice + " " + wareRatio;
    }
}
