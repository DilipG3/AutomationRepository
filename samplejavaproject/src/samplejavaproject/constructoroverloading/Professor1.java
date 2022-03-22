package samplejavaproject.constructoroverloading;
class Professor
{
	Professor(String pname)
	{
		System.out.println("Professor Name:"+pname);
	}
	 Professor(String character,int subject)
	 {
	 System.out.println("Character:"+character+"Subject:"+subject);	 
	 }
	 Professor(int age)
	 {
	 System.out.println("Age:"+age);	 
	 }
	  Professor(String subject,String location)
	  {
		  System.out.println("Subject:"+subject+"Location:"+location);
	  }
}    
public class Professor1{
public static void main(String[] args){
	Professor obj1=new Professor("Patil");
	Professor obj2=new Professor("Good",4);
	Professor obj3=new Professor(40);
	Professor obj4=new Professor("Maths","Bangalore");
}
}
