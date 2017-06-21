import java.util.Scanner;
import java.util.InputMismatchException;
public class Menu{
  private String[] options;
  private String greeter;
  public Menu(String[] opt, String grt){
    this.options = opt;
    int num = this.options.length;
    this.greeter = grt;
  }
  public int display(){
    int num = 0;
    String error = "";
    while(num == 0){
      Scanner console = new Scanner(System.in);
      System.out.println(this.greeter);
      for(int i = 1 ; i <= options.length ; i ++){
        System.out.println("   "+i+" - "+this.options[i-1]);
      }
      System.out.println(error);
      System.out.print(":");
      try{
        int input = console.nextInt();
        if(input >= 1 && input <= options.length){  
          num = input;
        }else{
          error = "invalid input.";
        }
      }catch(InputMismatchException e){
        error = "invalid input.";
      }
    } 
    return num;
  }
}
