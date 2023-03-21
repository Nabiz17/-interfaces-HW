public class Person implements interfaces.CanRun, interfaces.CanSwim {

  @Override
  public void run() {
    System.out.println("Человек бежит");
  }

  @Override
  public void swim() {
    System.out.println("Человек плавает");
  }
}

