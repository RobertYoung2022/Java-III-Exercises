import java.util.ArrayList;
import java.util.List;

public class ListProducts implements Products {

    private List<Product> newProduct = new ArrayList<>();


    public ListProducts() {
        insert(new Product("pressure washer", 299.99));
        insert(new Product("nailgun", 99.95));
        insert(new Product("white trim", 10.99));
    }
    // constructor - whenever this ap gets going, I want three products to start with every time. Use the 'insert' method and make these three products please

    public List<Product> all() {
        return this.newProduct;
    }


    public void insert(Product productToInsert) {
        this.newProduct.add(productToInsert);
    }
}
