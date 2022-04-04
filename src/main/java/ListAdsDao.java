import java.util.ArrayList;
import java.util.List;

public class ListAdsDao implements Ads {

    private List<Ad> newAd = new ArrayList<>();

    public ListAdsDao() {
        insert(new Ad("444 Board", 444.44, "San Antonio"));
    }

    @Override
    public List<Ad> all() {
        return this.newAd;
    }

    @Override
    public void insert(Ad AdToInsert) {
        this.newAd.add(AdToInsert);
    }
}
