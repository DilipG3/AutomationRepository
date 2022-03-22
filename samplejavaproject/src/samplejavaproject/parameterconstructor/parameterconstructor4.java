package samplejavaproject.parameterconstructor;

class Metrocity
{
	String firstname;
	String founded;
	int noofward;
	String state;
	public int noofwards;
	Metrocity(String Fname,String Founded,int Noofward,String State)
	{
		firstname=Fname;
		founded=Founded;
		noofward=Noofward;
		state=State;
		System.out.println("FirstName:"+firstname);
		System.out.println("Founded:"+founded);
		System.out.println("Noofward:"+noofward);
		System.out.println("State:"+state);
		System.out.println("++++++");
	}
}
class Districts
{
	String firstname;
	int nooftaluks;
	int pincode;
	String state;
	Districts(String Fname,int Nooftaluks,int Pincode,String State)
	{
		firstname=Fname;
		nooftaluks=Nooftaluks;
		pincode=Pincode;
		state=State;
		System.out.println("FirstName:"+firstname);
		System.out.println("Nooftaluks:"+nooftaluks);
		System.out.println("Pincode:"+pincode);
		System.out.println("State:"+state);
		System.out.println("+++++++");
		
	}
	public Districts(String string, int i, double d) {
		// TODO Auto-generated constructor stub
	}
	
}
class Taluk
{
	String firstname;
	int noofvillages;
	int pincode;
	String district;
	Taluk(String Fname,int Noofvillages,int Pincode,String District)
	{
		firstname=Fname;
		noofvillages=Noofvillages;
		pincode=Pincode;
		district=District;
		System.out.println("FirstName:"+firstname);
		System.out.println("Noofvillages:"+noofvillages);
		System.out.println("Pincode:"+pincode);
		System.out.println("District:"+district);
		System.out.println("+++++");
	}
}
	public class parameterconstructor4{
	public static void main(String[] args){
		Metrocity bangalore=new Metrocity("Bangalore","Kempegoud",198,"Karnataka");
	
		
		Districts raichur=new Districts("Raichur",7,584101,"Karnataka");
		
		
		Taluk sindhnur=new Taluk("Sindhnur",164,584128,"Raichur");
		
		
	}
	}




