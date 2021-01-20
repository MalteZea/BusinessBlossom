package Backend;

import Backend.MyBusiness.PlayerBusiness;

public class Time {
    private int[] days = new int[365];

    private boolean play = false;

    private static int today = 1;

    private int year;

    //TODO Start time
    public void timeForward(PlayerBusiness pB) {
        for (int i = 0; i < days.length; i++) {
            days[i] = i + 1;

        }
        try {
            while (play) {
                date();
                pB.runBusiness();
                //create demand
                if ((today - 1) % 5 == 0) System.out.println("You have " + pB.getInventory().size() + " wares in your inventory");
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
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
