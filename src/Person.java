public class Person implements CanRun, CanSwim {

  @Override
  public void run() {
    System.out.println("Человек бежит");
  }

  @Override
  public void swim() {
    System.out.println("Человек плавает");
  }
}

