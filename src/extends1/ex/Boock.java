package extends1.ex;

public class Boock extends Item{

    private String author;
    private String isbn;

    @Override
    public void print() {
        super.print();
        System.out.println("저자: " + author + ", isbn: " + isbn);
    }

    public Boock(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }
}
