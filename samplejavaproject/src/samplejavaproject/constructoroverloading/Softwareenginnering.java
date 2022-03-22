package samplejavaproject.constructoroverloading;

class Engineer
{
	Engineer(String ename)
	{
		System.out.println("EngineerName:"+ename);
	}
	Engineer(String company,String location,String area)
	{
		System.out.println("Company:"+company+"Location:"+location+"Area:"+area);
	}
	Engineer(int salary)
	{
		System.out.println("Salary:"+salary);
	}
	Engineer(long village)
	{
		System.out.println("Village:"+village);
	}
}
 public class Softwareenginnering{
	 public static void main(String[] args){
		 Engineer obj1=new Engineer("Rohit");
		 Engineer obj2=new Engineer("Hcl","Bommsandra","Ecity");
		 Engineer obj3=new Engineer(30000);
		 Engineer obj4=new Engineer("Bangalore");
	 }
 }



