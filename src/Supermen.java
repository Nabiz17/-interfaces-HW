// реализуйте их в классе "Супермен" Superman.
public class Supermen implements interfaces.CanFly, interfaces.CanRun, interfaces.CanSwim {
  @Override
  public void fly() {
    System.out.println("Супермен летит");
  }

  @Override
  public void run() {
    System.out.println("Супермен бежит");
  }

  @Override
  public void swim() {
    System.out.println("Супермен плавает");
  }
}





