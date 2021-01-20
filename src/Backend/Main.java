package Backend;

import Backend.MyBusiness.PlayerBusiness;

public class Main {

    public static void main(String[] args) {
        Time time = new Time();
        PlayerBusiness myBusiness = new PlayerBusiness();
        time.setPlay(true);
        time.timeForward(myBusiness);
    }
}
