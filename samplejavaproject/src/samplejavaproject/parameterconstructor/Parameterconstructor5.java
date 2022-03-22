package samplejavaproject.parameterconstructor;

class Birds
{
	String firstname;
	String color;
	int noofwings;
	String kingdom;
	Birds(String Fname,String Color,int Noofwings,String Kingdom)
	{
		firstname=Fname;
		color=Color;
		noofwings=Noofwings;
		kingdom=Kingdom;
		System.out.println("First Name"+firstname);
		System.out.println("Color"+color);
		System.out.println("Noofwings"+noofwings);
		System.out.println("Kingdom"+kingdom);
		System.out.println("++++++");
	}
}
class Animals
{
	String firstname;
	String kingdom;
	String genus;
	String species;
	Animals(String Fname,String Kingdom,String Genus,String Species)
	{
		firstname=Fname;
		kingdom=Kingdom;
		genus=Genus;
		species=Species;
		System.out.println("First Name:"+firstname);
		System.out.println("Kingdom:"+kingdom);
		System.out.println("Genus:"+genus);
		System.out.println("Species:"+species);
		System.out.println("+++++++");
	}
}
 class Plants
 {
	 String firstname;
	 String kingdom;
	 String family;
	 String order;
	 Plants(String Fname,String Kingdom,String Family,String Order)
	 {
		 firstname=Fname;
		 kingdom=Kingdom;
		 family=Family;
		 order=Order;
		 System.out.println("First Name"+firstname);
			System.out.println("Kingdom"+kingdom);
			System.out.println("Family:"+family);
			System.out.println("Order:"+order);
			System.out.println("+++++");
	 }
}
 public class Parameterconstructor5{
 public static void main(String[] args){
	Birds parrot=new Birds("Parrot","Green",2,"Animalia");
	
	
	Animals tiger=new Animals("Bengaltiger","Animalia","Panthera","Tigris");
	
	
	Plants bamboo=new Plants("Bamboo","Plantae","Poaceae","Poales");
	
	
	 }
 
 }
 
 

	



