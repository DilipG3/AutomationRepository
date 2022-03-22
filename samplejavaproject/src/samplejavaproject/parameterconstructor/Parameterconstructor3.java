package samplejavaproject.parameterconstructor;


class TwoWheelers
{
	String firstname;
	int noofwheeles;
	String country;
	String color;
	TwoWheelers(String Fname,int Noofwheeles,String Country,String Color)
	{
		firstname=Fname;
		noofwheeles=Noofwheeles;
		country=Country;
		color=Color;
		System.out.println("Fisrt Name:"+firstname);
		System.out.println("Noofwheeles:"+noofwheeles);
		System.out.println("Country:"+country);
		System.out.println("Color"+color);
		System.out.println("++++++++");
	}
}
 class Fourwheeles
 {
	 String firstname;
	 String color;
	 String country;
	 int noofwheeles;
	 Fourwheeles(String Fname,String Color,String Country,int Noofwheeles)
	 {
		 firstname=Fname;
		 color=Color;
		 country=Country;
		 noofwheeles=Noofwheeles;
		 System.out.println("First Name"+firstname);
			System.out.println("Color:"+color);
			System.out.println("Country:"+country);
			System.out.println("Noofwheeles:"+noofwheeles);
			System.out.println("+++++++");
	 }
 }
 public class Parameterconstructor3{
 public static void main(String[] args){
	TwoWheelers honda=new TwoWheelers("Herohonda",2,"India","Red");
	
	
	Fourwheeles bmw=new Fourwheeles("Bmw","White","Germany",4);
	
	
 }
 }
 
  


	



