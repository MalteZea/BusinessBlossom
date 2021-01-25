package Backend.Market;

import java.util.Random;

public class Consumer {

    Random random = new Random();
    private double lowestQualityDemand = lowestQualityDemand();
    private int highestPriceWilling = priceDemand();
    private int existencePeriod = existencePeriod();
    private int highestRatio = (int)(highestPriceWilling / lowestQualityDemand);

    Consumer() {
    }

    private int existencePeriod() {
        int period = random.nextInt(83) + 7;
        return period;
    }

    //Consumers highest willing price to pay for ware.
    private int priceDemand() {
        int highestPriceWilling = (int)(lowestQualityDemand * (random.nextInt(200)+50));
        return highestPriceWilling;
    }

    //Generates the lowest quality that a consumer will purchase.
    private double lowestQualityDemand() {
        //Generates a random number that will be used to diversify the consumer quality demand
        int randomNumber = random.nextInt(5) + 1;
        //1 = low, represent 33,3% 2 = medium, represent 50%. 3 = high, represent 16,6%.
        int consumerEconomicRange;
        if (randomNumber <= 2) {
            consumerEconomicRange = 1;
        } else if (randomNumber >= 3 && randomNumber <= 5) {
            consumerEconomicRange = 2;
        } else {
            consumerEconomicRange = 3;
        }
        double lowestQuality = 0.5;
        switch (consumerEconomicRange) {
            //1 is from 0 - 0.5. 2 is from 05 - 1. 3 is from 1-2.
            case 1:
                lowestQuality = random.nextDouble() * 0.5;
                break;
            case 2:
                lowestQuality = (random.nextDouble() * 0.5) + 0.5;
                break;
            case 3:
                lowestQuality = random.nextDouble() + 2;
        }
        return lowestQuality;
    }

    public double getLowestQualityDemand() {
        return lowestQualityDemand;
    }

    public int getHighestPriceWilling() {
        return highestPriceWilling;
    }

    public double getHighestRatio() {
        return highestRatio;
    }

    public String toString(){
        return highestPriceWilling+ " " + lowestQualityDemand + " " + highestRatio;
    }
}

