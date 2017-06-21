import java.util.Scanner;
public class Main{
  public static player player;
  public static void main(String[] args){
    int game = introMenu();
    if(game == 1)
      newGame();
    else if(game == 2)
      loadGame();
    System.out.println(player);
    System.out.println("Welcome! From here you can enter the forest and fight MONSTERS or go on a shopping spree!\n\n\n");
    mainMenu();
    System.out.println("Goodbye! Seeya next time!");
  }
  public static int chooseMonster(int level){
    return 0;
  }
  public static void shop(){
    String[] shopItems = {"pot 1", "pot 2", "pot 3", "str upgrd", "def upgrd"};
    String shopGreeter = String.format("Welcome to the shop!%10s%03d", "GP:", player.GP);
    Menu shop = new Menu(shopItems,shopGreeter);
    int purchaseID = shop.display();
    System.out.println(purchaseID);
  }
  public static int introMenu(){
    String[] menuOpts = {"New Game", "Load Game"};
    String menuGreeter = "Welcome the DOPEST game ever made.";
    Menu theMenu = new Menu(menuOpts,menuGreeter);
    return theMenu.display();
  }
  public static void newGame(){
    Scanner console = new Scanner(System.in);
    System.out.println("What is your name? (only up to 8 chars will be shown.)");
    System.out.print(":");
    String name = console.nextLine();
    String[] classOpts = {"Knight"};
    String classGreeter = "Pick a class!";
    Menu classMenu = new Menu(classOpts,classGreeter);
    int plrClass = classMenu.display();
    if(plrClass == 1)
      player = new Knight(name);
    else if(plrClass == 2)
      player = new Knight(name);
  }
  public static void loadGame(){

  }
  public static void mainMenu(){
    String[] menuOpts = {"Fight","Shop","Character Sheet","Save","Quit"};
    String menuGreeter = "Where do you want to go?";
    Menu theMenu = new Menu(menuOpts, menuGreeter);
    int num = 3;
    while(num != 5){
      num = theMenu.display();
      if(num == 1)
        battle();
      else if(num == 2)
        shop();
      else if(num == 3)
        stats();
      else if(num ==4)
        saveGame();
    }
  }
  public static void battle(){

  }
  public static void stats(){
    System.out.println(player);
  }
  public static void saveGame(){

  }
}
