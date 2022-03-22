package samplejavaproject.parameterconstructor;

class Maths
{
	String firstname;
	String father;
	int noofoperaters;
	String addition;
	Maths(String Fname,String Father,int Noofoperaters,String Addition)
	{
		firstname=Fname;
		father=Father;
		noofoperaters=Noofoperaters;
		addition=Addition;
		 System.out.println("FirstName:"+firstname);
		 System.out.println("Father:"+father);
		 System.out.println("Noofoperater:"+noofoperaters);
		 System.out.println("Addition:"+addition);
		 System.out.println("++++++");
		
	}
	}
class Physics
{
	String firstname;
	String scientist;
	String equation;
	String law;
	Physics(String Fname,String Scientist,String Equation,String Law)
	{
		firstname=Fname;
		scientist=Scientist;
		equation=Equation;
		law=Law;
		 System.out.println("FirstName:"+firstname);
		 System.out.println("Scientist:"+scientist);
		 System.out.println("Equation:"+equation);
		 System.out.println("Law:"+law);
		 System.out.println("++++++");
	}
}
class Chemistry
{
	String firstname;
	String scientist;
	String chemical;
	String formula;
	Chemistry(String Fname,String Scientist,String Chemical,String Formula)
	{
		firstname=Fname;
		scientist=Scientist;
		chemical=Chemical;
		formula=Formula;
		 System.out.println("FirstName:"+firstname);
		 System.out.println("Scientist:"+scientist);
		 System.out.println("Chemical:"+chemical);
		 System.out.println("Formula:"+formula);
		 System.out.println("++++++");
	}
}
 public class Parameterconstructor6{
 public static void main(String[] args){
	 Maths maths=new Maths("Maths","Archimedes",4,"Plus");

	 Physics physic=new Physics("Physic","Newton","F=ma","Faraday");

	 Chemistry chemistrys=new Chemistry("Chemistrys","Albert","Hydrochloricacid","Hcl");
 }
}

