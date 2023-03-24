import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Book implements Comparable<Book> {
  private final String author;
  private final String bookTitle;
  private final int pages;


  public Book(String bookTitle, String author, int pages) {
    this.bookTitle = bookTitle;
    this.author = author;
    if (pages < 0) {
      throw new IllegalArgumentException("Negative pages: " + pages);
    }
    this.pages = pages;
  }

  public String getAuthor() {
    return author;
  }

  public String getBookTitle() {
    return bookTitle;
  }

  public int getPages() {
    return pages;
  }

  //Создайте класс Book (книга), в конструктор которого передавайте автора,
  // название книги и количество страниц.
  //
  //Реализуйте интерфейс для сравнения книг:
  // они должны сортироваться по авторам,
  // а если авторы совпадают - по названиям
  // (и там, и там - по алфавиту, "в словарном порядке").

  public Book BookCreator() throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите имя автора: ");
    String author = br.readLine();
    System.out.print("Введите название книги: ");
    String bookTitle = br.readLine();
    System.out.print("Введите количество страниц: ");
    int pages = Integer.parseInt(br.readLine());

    return new Book(author, bookTitle, pages);
  }

  @Override
  public String toString() {
    return "Автор книги " + getAuthor() + "название" + getBookTitle() +
        "количество страниц" + getPages();
  }

  @Override
  public int compareTo(Book o) {
    if (!author.equals(o.author)) {
      return author.compareTo(o.author);
    }
    if (!bookTitle.equals(o.bookTitle)) {
      return bookTitle.compareTo(o.bookTitle);
    }
    return pages - o.pages;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Book other)) {
      return false;
    }

    return /*this.*/compareTo(other) == 0;
  }

   @Override
  public int hashCode() {
    return Objects.hash(author, bookTitle, pages);
  }
}
