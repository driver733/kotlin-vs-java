public static void main(String[]args) {
    Book book = createBook();

    System.out.println(book);
    System.out.println("Title: " + book.title);
}

public static Book createBook(){
    return new Book("title_01", "author_01");
}

@Data
public class Book {
}
