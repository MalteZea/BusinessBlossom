package Backend;

import Backend.MyBusiness.PlayerBusiness;
import Backend.Market.Market;

public class Time {
    private int[] days = new int[365];
    private boolean play = false;
    private static int today = 1;
    private int year;

    //Start time
    public void timeForward(PlayerBusiness pB, Market market) {
        //Gives the number from 1-365 to the days[], iot represent the day of the year.
        for (int i = 0; i < days.length; i++) {
            days[i] = i + 1;
        }
        try {
            while (play) {
                date();
                pB.runBusiness();
                market.marketLife(pB);
                //create demand
                if ((today - 1) % 5 == 0) {
                    System.out.println("You have " + pB.getInventory().size() + " wares in your inventory");
                    System.out.println("Your business capital is: " + pB.getBusinessCapital() + "$");
                    System.out.println("There are " + market.getConsumers().size() + " consumers in the market");
                   /* for (int i = 0; i < market.getConsumers().size(); i++) {
                        System.out.println(market.getConsumers().get(i).toString());
                    }*/
                }
            Thread.sleep(1000);
        }
    } catch(
    InterruptedException ex)

    {
        System.out.println("Thread sleep error");
    }

}

    private void date() {
        System.out.println(days[today - 1]);

        today += 1;
        if (today == 366) {
            year += 1;
            today = 1;
        }
    }

    public boolean isPlay() {
        return play;
    }

    public void setPlay(boolean play) {
        this.play = play;
    }

    public int[] getDays() {
        return days;
    }

    public static int getToday() {
        return today;
    }
}
