import java.util.ArrayList;
import java.util.List;

public class ListAdsDao implements Ads{

    private List<Ad> newAd = new ArrayList<>();

    public ListAdsDao() {
        insert(new Ad("Law Board", 123.55, "San Antonio"));

    }

    @Override
    public List<Ad> all() {
        return null;
    }

    @Override
    public void insert(Ad AdToInsert) {

    }
}
