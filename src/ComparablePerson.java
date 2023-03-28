
import java.util.Comparator;

public interface ComparablePerson extends Comparator<Person> {

  @Override
  static int compare(Person o1, Person o2) {
    if (!o1.getDateOfBirth().equals(o2.getDateOfBirth()))
      return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
    return o1.getDateOfBirth() - o2.getDateOfBirth();
  }
}
