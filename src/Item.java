public class Item{
  private String name;
  private int price;
  private int id;
/* 0 - 3 hp pot
 * 1 - 7 hp pot
 * 2 - 15 hp pot
 * 3 - str upgr
 * 4 - def upgr
 */
  public Item(String n, int p, int i){
    this.name = n;
    this.price = p;
    this.id = i;
  }
  public String toString(){
    return this.name;
  }
  public int getPrice(){
    return this.price;
  }
  public int getID(){
    return this.id;
  }
  public void behavior(player plr){
    if (this.id == 0){
      plr.HP+=3;
      if(plr.HP>plr.MAXHP)
        plr.HP=plr.MAXHP;
    }
  }
}  
