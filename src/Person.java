import java.util.Date;

public class Person implements CanRun, CanSwim {

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

