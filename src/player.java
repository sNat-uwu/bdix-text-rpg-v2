import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class player{
  //Fields
  public int NEXTXP;
  public String NAME;
  public String CLASS;
  public int LVL;
  public int XP;
  public int STR;
  public int DEF;
  public int SPD;
  public double LCK;
  public int MAXHP;
  public int HP;
  public int GP;
  public String ATTACK1;
  public String ATTACK2;
  //quantity of lv1, lv2, lv3 pots (((currently)))
  public ArrayList<Item> inventory = new ArrayList<Item>();
  //Constructor
  public player(String n, int lv, int x, int st, int d, int sp, double lk,
                int mh, int h, int g, String c, String a1, String a2){
    this.NAME = n;
    this.LVL = lv;
    this.XP = x;
    this.STR = st;
    this.DEF = d;
    this.SPD = sp;
    this.LCK = lk;
    this.MAXHP = mh;
    this.HP = h;
    this.GP = g;
    this.NEXTXP = (int)Math.round(20 + (Math.pow(this.LVL, 1.5)));
    this.CLASS = c;
    this.ATTACK1 = a1;
    this.ATTACK2 = a2;
  }
  //Tries to run form battle. Chance based on SPD stat.
  public boolean run(){
    Random r = new Random();
    double chance = (r.nextInt(100)+1);
    if (chance >= this.SPD){
      return true;
    }else{
      return false;
    }
  }
  //De-levels player
  public void die(){
    System.out.println("You have died.\nYou have lost your progress to the next level.");
      this.XP = 0;
      this.HP = this.MAXHP;
  }
  public void levelUp(){
    Scanner console = new Scanner(System.in);
    Random r = new Random();
    if (this.XP >= this.NEXTXP){
      this.LVL+=1;
      this.NEXTXP = (int)Math.round(20 + (Math.pow(this.LVL, 1.5)));
      System.out.println("You have gained enough XP to level up! You have 5 points to allot to your skills!");
      for (int i = 5 ; i > 0 ; i--){
        System.out.println(i+" points remaining.");
        System.out.println("1 - STR\n2 - DEF\n3-SPD\n4-LCK");
        String stat = console.next();
        if (stat.equals("1")){
          this.STR+=1;
        }else if (stat.equals("2")){
          this.DEF+=1;
        }else if (stat.equals("3")){
          this.SPD+=1;
        }else if (stat.equals("4")){
          this.LCK+=0.05;
        }else{
          i++;
        }
      }
      int hpinc = r.nextInt(3)+5;
      System.out.println("Your max HP has also increased by "+hpinc+".");
      this.MAXHP+=hpinc;
      this.HP = this.MAXHP;
    }
  }
/*-------------------
 *|NAME    |   CLASS|
 *|Level   |     LVL|
 *|XP      |   XP/XP|
 *|GP      |      GP|
 *|HP      |  HP/MHP|
 *|STR     |     STR|
 *|DEF     |     DEF|
 *|SPD     |     SPD|
 *|LCK     |     LCK|
 *-------------------
 */
  public String toString(){
    return String.format("-------------------\n|%-8.8s|%8.8s|\n|%-8s|%8d|\n|%-8s|%8.8s|\n|%-8s|%8d|\n|%-8s|%8s|\n|%-8s|%8d|\n|%-8s|%8d|\n|%-8s|%8d|\n|%-8s|%8.1f|\n-------------------",
                                  this.NAME, this.CLASS, "Level", this.LVL, "XP",
                                  this.XP+"/"+this.NEXTXP, "GP", this.GP, "HP",
                                  this.HP+"/"+this.MAXHP, "STR", this.STR, "DEF",
                                  this.DEF, "SPD", this.SPD, "LCK", this.LCK);
  }
}
