import java.util.Random;
public class Slime extends monster{
  public Slime(){
    super("Slime", 4, 10, 10, 0.7);
  }
  public int attack(){
    Random r = new Random();
    return r.nextInt(7);
  }
}
