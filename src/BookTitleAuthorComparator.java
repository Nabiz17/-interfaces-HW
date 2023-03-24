
import java.util.Comparator;

public class BookTitleAuthorComparator implements Comparator<Book>{

    // Класс-компаратор может быть полностью самостоятельным.
    // В таком случае он не использует ни compareTo(), ни equals(), и даже
    // не знает, есть они или нет.
    // Вместо этого он использует только геттеры и сравнивает полученных значения сам.
    @Override
    public int compare(Book o1, Book o2) {
      // по названию,
      if (!o1.getBookTitle().equals(o2.getBookTitle())) {
        // используем compareTo, но не самого класса Book, а одного из его полей
        // в этом случае - String.compareTo()
        return o1.getBookTitle().compareTo(o2.getBookTitle());
      }
      // при одинаковых названиях - по автору
      return o1.getAuthor().compareTo(o2.getAuthor());
    }
  }

