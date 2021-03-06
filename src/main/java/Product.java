import java.io.Serializable;

public class Product implements Serializable {
    private String name; // field #1
    private double price; // field #2

    public Product() { }
    //Default [blank] constructor

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    // custom constructor to use both props


    // below: getters/setters for fields/props
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
