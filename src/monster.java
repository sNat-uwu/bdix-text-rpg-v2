import java.util.Random;
public class monster{
  String NAME;
  private double lootmulti;
  // public int STR;
  public int DEF;
  public int MAXHP;
  public int HP;
  public monster(String n, int d, int mh, int h, double lm){
    this.NAME = n;
    // this.STR = st;
    this.DEF = d;
    this.MAXHP = mh;
    this.HP = h;
    this.lootmulti = lm;
  }
  public int[] loot(){
    Random r = new Random();
    int[] lt = {(int)Math.round((r.nextInt(5)+5)*this.lootmulti),
                (int)Math.round((r.nextInt(5)+5)*this.lootmulti)};
    return lt;
  }
}
