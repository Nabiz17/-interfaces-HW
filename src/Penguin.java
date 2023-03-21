public class Penguin implements CanRun, CanSwim {

  @Override
  public void run() {
    System.out.println("Пингвин бежит (как может, так и бежит)");
  }

  @Override
  public void swim() {
    System.out.println("Пингвин плавает");
  }
}