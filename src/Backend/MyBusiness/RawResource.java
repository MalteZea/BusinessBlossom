package Backend.MyBusiness;

public class RawResource {
    private Level RawResourceQuality = Level.MEDIUM;
    private int priceOfResource;

    RawResource() {
    }



    public Level getRawResourceQuality() {
        return RawResourceQuality;
    }

    public void setRawResourceQuality(Level rawResourceQuality) {
        RawResourceQuality = rawResourceQuality;
    }

    public int getPriceOfResource() {
        return priceOfResource;
    }

    public void setPriceOfResource(int priceOfResource) {
        this.priceOfResource = priceOfResource;
    }
}
