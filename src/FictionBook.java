public class FictionBook  extends Book {
    private String category;

    public FictionBook() {
    }

    public FictionBook(String category) {
        this.category = category;
    }
//
    public FictionBook(String bookCode, String name, String author, int price, String category) {
        super(bookCode, name, author, price);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
