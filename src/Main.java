import Guide.Author;
import Guide.Book;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Эрих", "Фромм");
        Author author2 = new Author("Гюстав", "Лебон");
        Book book1 = new Book(author1, "Революция надежды", 2022);
        Book book2 = new Book(author2, "Психология народов и масс", 2023);
        book1.setYearOfPublication(1895);
        book2.setYearOfPublication(1968);

        System.out.println(book1.getName() + ", " + author1.getFirstName() + " " + author1.getSecondName() + ", " + book1.getYearOfPublication());
        System.out.println(book2.getName() + ", " + author2.getFirstName() + " " + author2.getSecondName() + ", " + book2.getYearOfPublication());
    }
}
