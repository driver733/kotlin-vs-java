public static void main(String[]args) {
    val book = createBook();
    System.out.println(book);
    System.out.println("Title: " + book.title);
}

public static Book createBook(){
    return new Book("title_01", "author_01");
}

@Data // Lombok
public class Book {
    private final String title;
    private final String author;
}
