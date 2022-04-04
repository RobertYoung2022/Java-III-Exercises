import java.util.List;

public interface Products {
    List<Product> all(); //get me all the products and return it as a 'List' [can poly into an arraylist


    // we are saying 'how' not 'what' in this instance
    void insert(Product productToInsert);
    // insert a product

}
