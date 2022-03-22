package samplejavaproject.constructoroverloading;
class University
{
	University(String string)
	{
		System.out.println("University:"+string);
	}
	University(int year)
	{
		System.out.println("Year:"+year);
	}
	University(float busf)
	{
		System.out.println("Bus:"+busf);
	}
	University(String percentage,double marks)
	{
		System.out.println("Percentage:"+percentage+"Marks:"+marks); 
	}
	public University(double d) {
		// TODO Auto-generated constructor stub
	}

}



public class University1{
	public static void main(String[] args){
		University obj1=new University("Alliance");
		University obj2=new University(2010);
		University obj3=new University(55.5);
		University obj4=new University("90.5%",99.9);
	}
}