package Backend;

import Backend.Market.Market;
import Backend.MyBusiness.PlayerBusiness;

public class Main {

    public static void main(String[] args) {
        Time time = new Time();
        PlayerBusiness myBusiness = new PlayerBusiness();
        Market market = new Market();
        time.setPlay(true);
        time.timeForward(myBusiness, market);
    }
}
