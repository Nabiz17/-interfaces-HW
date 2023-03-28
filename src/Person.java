import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person implements CanRun, CanSwim, ComparablePerson {

  //Создайте класс Person, которому при создании передавайте имя и
  // дату рождения в виде строки в формате "ДД.ММ.ГГГГ".
  //
  //Реализуйте в классе интерфейс Comparable<Person>, в котором "меньше" будет
  // значить "младше".
  //
  //Подсказка: необязательно вычислять возраст, этому мы так и не научились.
  // Но можно сравнивать даты рождения!
  //
  //Альтернативная подсказка: если очень хочется вычислять возраст,
  // то можно это делать в миллисекундах с использованием getTime()!

private String name;
private final LocalDate dateOfBirth;

  public Person(String name, LocalDate dateOfBirth) {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
  }

  public Person PersonCreator() throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите имя человека: ");
    String name = br.readLine();
    System.out.print("Введите дату рождения: ");
    String dateOfBirthStr = br.readLine();

    String pattern = "DD-mm-yyyy";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
    LocalDate dateOfBirth = LocalDate.parse(dateOfBirthStr, formatter);

    return new Person(name, dateOfBirth);
  }



  @Override
  public void run() {
    System.out.println("Человек бежит");
  }

  @Override
  public void swim() {
    System.out.println("Человек плавает");
  }

  public String getName() {
    return name;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setName(String name) {
    this.name = name;
  }
}

