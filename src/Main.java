import Guide.Author;
import Guide.Book;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Эрих", "Фромм");
        Author author2 = new Author("Гюстав", "Лебон");
        Book book1 = new Book(author1, "Революция надежды", 2022);
        Book book2 = new Book(author2, "Психология народов и масс", 2023);
        book1.setYearOfPublication(1895);
        book2.setYearOfPublication(1968);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(author1.equals(author2));
    }
}
