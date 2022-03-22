package samplejavaproject.parameterconstructor;





class Fruits
{
	String firstname;
	String kingdom;
	String colour;
	String family;
	Fruits(String Fname,String Kingdom,String Colour,String Family)
	{
		firstname=Fname;
		kingdom=Kingdom;
		colour=Colour;
		family=Family;
		 System.out.println("First name:"+firstname);
		 System.out.println("Kingdom:"+kingdom);
		 System.out.println("Colour:"+colour);
		 System.out.println("Family:"+family);
		 System.out.println("++++++++");
	}
}
class Flower
{
	String firstname;
	String genus1;
	String colour;
	String kingdom;
	public String genus;
	Flower(String Fname,String Genus1,String Colour,String Kingdom)
	{
		firstname=Fname;
		genus1=Genus1;
		colour=Colour;
		kingdom=Kingdom;
		 System.out.println("First name:"+firstname);
		 System.out.println("Genus1:"+genus1);
		 System.out.println("Colour:"+colour);
		 System.out.println("kingdom:"+kingdom);
		 System.out.println("+++++++");	
	}
}
class Vegetable
{
	String firstname;
	String family;
	String species;
	String genus;
	Vegetable(String Fname,String Family,String Species,String Genus)
	{
		firstname=Fname;
		family=Family;
		species=Species;
		genus=Genus;
		System.out.println("First name:"+firstname);
		 System.out.println("Family:"+family);
		 System.out.println("Species:"+species);
		 System.out.println("Genus:"+genus);
		 System.out.println("++++++++");
	}
}
 public class Parameterconstructor2{
 public static void main(String[] args){
	 Fruits apple=new Fruits("Apple","Plantae","Red","Rosaceae");
	
	
	 Flower Rose=new Flower("Rose","Roas","Red","Plantae");
	
	
	 Vegetable onion=new Vegetable("Onion","Amaeyllidaceae","Cepa","Allium");
	
	 
	 }
 }




		

	



