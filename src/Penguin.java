public class Penguin implements interfaces.CanRun, interfaces.CanSwim {

  @Override
  public void run() {
    System.out.println("Пингвин бежит (как может, так и бежит)");
  }

  @Override
  public void swim() {
    System.out.println("Пингвин плавает");
  }
}