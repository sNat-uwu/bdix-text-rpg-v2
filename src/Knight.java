import java.util.Random;
public class Knight extends player{
  public Knight(String n){
    super(n, 1, 0, 6, 10, 35, 1, 18, 18, 0, "Knight", "Shield Bash", "Slash");
  }
  //Shield Bash
  public int attack1(){
    Random r = new Random();
    int hit = r.nextInt(100)+1;
    if (hit <= 60){
      int dmg = (int)Math.round(((0.3)*this.HP)*((r.nextInt(3)+1)/0.2));
      return dmg;
    }else{
      System.out.println("Missed!");
      return 0;
    }
  }
  //Slash
  public int attack2(){
    Random r = new Random();
    int hit = r.nextInt(100)+1;
    if (hit <= 80){
      int dmg = (int)Math.round(((0.3)*this.STR)*((r.nextInt(3)+1)/0.2));
      return dmg;
    }else{
      System.out.println("Missed!");
      return 0;
    }
  }
}
