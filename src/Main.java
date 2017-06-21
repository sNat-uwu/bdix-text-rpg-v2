import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Knight player = new Knight("Brandon");
    String[] shopItems = {"pot 1", "pot 2", "pot 3", "str upgrd", "def upgrd"};
    String shopGreeter = String.format("Welcome to the shop!%10s%03d", "GP:", player.GP);
    Menu shop = new Menu(shopItems,shopGreeter);
    int purchaseID = shop.display();
    System.out.println(purchaseID);
  }
  public static int chooseMonster(int level){
    return 0;
  }
}
