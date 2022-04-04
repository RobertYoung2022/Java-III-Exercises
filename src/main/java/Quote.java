import java.io.Serializable;

public class Quote implements Serializable {
    // INSTANCE
    private int id;
    private String content;
    private Author author;

    // CONSTRUCTOR
    public Quote() { }

    public int getId() {
        return id;
    }
// GETTERS AND SETTERS
    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
