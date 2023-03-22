import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Book implements BooksSort {

  @Override
  public int compareTo(Book other) {
    return 0;
  }

  @Override
  public void BooksSort() {
  }

  //Создайте класс Book (книга), в конструктор которого передавайте автора,
  // название книги и количество страниц.
  //
  //Реализуйте интерфейс для сравнения книг:
  // они должны сортироваться по авторам,
  // а если авторы совпадают - по названиям
  // (и там, и там - по алфавиту, "в словарном порядке").

  private String author;
  private String bookTitle;

  public Book(String author, String bookTitle) {
    this.author = author;
    this.bookTitle = bookTitle;
  }

  public String getAuthor() {
    return author;
  }

  public String getBookTitle() {
    return bookTitle;
  }

  public static Book readStudent() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите имя автора: ");
    String author = br.readLine();
    System.out.print("Введите название книги: ");
    String bookTitle = br.readLine();

    return new Book(author, bookTitle);
  }

  @Override
  public String toString() {
    return author + " " + bookTitle;
  }
}
