public class Book {

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
}
