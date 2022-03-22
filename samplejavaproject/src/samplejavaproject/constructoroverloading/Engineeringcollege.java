package samplejavaproject.constructoroverloading;
class College
{
	College(String cname)
	{
		System.out.println("CollegeName:"+cname);
	}
	College(short professors)
	{
		System.out.println("Professors:"+professors);
	}
	 College(int students)
	 {
		 System.out.println("Students:"+students);
	 }
	  College(boolean a)
	  {
		  System.out.println("A:"+a);
	  }
}
public class Engineeringcollege{
public static void main(String[] args){
  College obj1=new College("Alliance");
  College obj2=new College(20);
  College obj3=new College(4000);
  College obj4=new College("True");
}
}