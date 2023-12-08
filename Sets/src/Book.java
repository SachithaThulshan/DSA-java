import java.util.LinkedHashSet;

public class Book {
    int id, qty;
    String name, author, publisher;

    public Book(int id, String name, String author, String publisher, int qty){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.qty = qty;
    }
}
class setHashLinked{
    public static void main(String[] args) {
        LinkedHashSet<Book> lhs = new LinkedHashSet<>();
        Book b1 = new Book(123, "java","java a", "abc",10);
        for (Book b: lhs ) {
            System.out.println();

        }
    }
}