import java.util.Date;

public class Person implements CanRun, CanSwim {

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
private final Date dateOfBirth;

  public Person(String name, Date dateOfBirth) {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
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

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setName(String name) {
    this.name = name;
  }
}

