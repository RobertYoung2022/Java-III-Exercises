import java.util.Date;

public class BeanTest {
    public static void main(String[] args) {
        Quote newOne = new Quote();
        newOne.setId(1);
        newOne.setAuthor(new Author());
        newOne.setContent("To be one, Oh soo supid moon");

        System.out.println(newOne.getId());
        System.out.println(newOne.getAuthor());
        System.out.println(newOne.getContent());


        Album CLB = new Album();
        CLB.setId(1);
        CLB.setArtist("Drake");
        CLB.setName("Certified Lover Boy");
        CLB.setReleaseDate(new Date(2017, 12, 31));
        CLB.setSales(171_850_000);
        CLB.setGenre("Hip-Hop");

        System.out.println(CLB.getId());
        System.out.println(CLB.getArtist());
        System.out.println(CLB.getName());
        System.out.println(CLB.getReleaseDate());
        System.out.println(CLB.getSales());
        System.out.println(CLB.getGenre());
    }
}
