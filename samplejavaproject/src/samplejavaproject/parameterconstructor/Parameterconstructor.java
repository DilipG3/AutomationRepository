package samplejavaproject.parameterconstructor;


class Desktop
{
   String firstname;
	String color;
	int cost;
	String brand;
	Desktop(String fname,String Color,int Cost,String Brand)
	{
		firstname=fname;
		color=Color;
		cost=Cost;
		brand=Brand;
		 System.out.println("First Name:"+firstname);
		 System.out.println("Color:"+color);
		 System.out.println("Cost"+cost);
		 System.out.println("Brand"+brand);
		 
		}
}
class Laptop
{
	 String firstname;
	 int cost;
	 String colour;
	 int storge;
	public String generation;
	public String color;
	Laptop(String fname,int Cost,String Colour,int Storage)
	{
		firstname=fname;
		cost=Cost;
		colour=Colour;
		storge=Storage;
		System.out.println("First Name:"+firstname);
		System.out.println("Cost:"+cost);
		System.out.println("Color:"+color);
		System.out.println("Gen:"+generation);
		
	}
	public Laptop(String fname, int cost2, String colour2, String string) {
		// TODO Auto-generated constructor stub
	}
}
 class Mobile
 {
	  String firstname;
	  int brand;
	  int storage;
	  int cost;
	public String shop;
	Mobile(String fname,int Brand,int Storage,int Cost)
	{
		firstname=fname;
		brand=Brand;
		storage=Storage;
		cost=Cost;
		System.out.println("First Name:+firstname");
		System.out.println("Shop:"+shop);
		System.out.println("Cost:"+cost);
		System.out.println("Storage:"+storage);
		
	}
	public Mobile(String fname, String string, int storage2, int cost2) {
		// TODO Auto-generated constructor stub
	}
 }
  public class Parameterconstructor{
  public static void main(String[] args){
	Desktop hp=new Desktop("Hp","Blackcolor",30000,"hp");
	
	 Laptop lenova=new Laptop("Lenova",35000,"Grey","I5");
	
	Mobile xiaomi=new Mobile("Xiaomi","Redmi",16000,16);
	
	 }
	   
  }
 







	
		
