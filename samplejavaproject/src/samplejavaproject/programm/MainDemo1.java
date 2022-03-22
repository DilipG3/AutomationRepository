package samplejavaproject.programm;

 class Desktop
{
    String firstname;
	String color;
	int cost;
	String brand;
}
 class Laptop
 {
	 String firstname;
	 int cost;
	 String colour;
	 int storge;
	public String generation;
	public String color;
 }
  class Mobile
  {
	  String firstname;
	  int brand;
	  int storage;
	  int cost;
	public String shop;
  }
   public class MainDemo1{
   public static void main(String[] args){
	Desktop hp=new Desktop();
	hp.firstname="hp";
	hp.color="blackcolor";
	hp.cost=30000;
	hp.brand="hp";
	 System.out.println("First Name:"+hp.firstname);
	 System.out.println("Color:"+hp.color);
	 System.out.println("Cost"+hp.cost);
	 System.out.println("Brand"+hp.brand);
	 System.out.println("++++++++");
	 Laptop lenova=new Laptop();
	lenova.firstname="lenova";
	lenova.cost=35000;
	lenova.color="Grey";
	lenova.generation="i5";
	System.out.println("First Name:"+lenova.firstname);
	System.out.println("Cost:"+lenova.cost);
	System.out.println("Color:"+lenova.color);
	System.out.println("Gen:"+lenova.generation);
	System.out.println("+++++++");
	Mobile xiaomi=new Mobile();
	xiaomi.firstname="xiamoi";
	xiaomi.shop="redmi";
	xiaomi.cost=16000;
	xiaomi.storage=16;
	System.out.println("First Name:+xiaomi.firstname");
	System.out.println("Shop:"+xiaomi.shop);
	int cost = 16000;
	System.out.println("Cost:"+cost);
	int storage = 16;
	System.out.println("Storage:"+storage);
	System.out.println("++++++++");
	 }
	   
   }
  
 



