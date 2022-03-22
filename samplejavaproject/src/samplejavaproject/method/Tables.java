package samplejavaproject.method;
class Table1
{
	void table()
	{
	  for(int i=1;i<=20;i++)
	  {
		 for(int j=1;j<=10;j++)
		 {
			 System.out.println(i+"*"+j+"="+i*j);
		 }
		   System.out.println("-----------");
	  }
	}
}
public class Tables{
  public static void main(String[] args) {
	   Table1 tab=new Table1();
	   tab.table();
   }

}