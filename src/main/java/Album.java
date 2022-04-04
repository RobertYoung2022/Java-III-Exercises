import java.io.Serializable;
import java.util.Date;

public class Album implements Serializable {

    private Integer id;
    private String artist;
    private String name;
    private Date releastDate;
    private Long sales;
    private String genre;

    public Album() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReleastDate() {
        return releastDate;
    }

    public void setReleastDate(Date releastDate) {
        this.releastDate = releastDate;
    }

    public long getSales() {
        return sales;
    }

    public void setSales(long sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
