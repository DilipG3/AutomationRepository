package samplejavaproject.method;
class Array
{
	void reverse(int a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
			
}
 public class ArrayDemo{
	public static void main(String[] args) {
		Array demo=new Array();
		int x[]= {1,2,3,4,5,6};
		demo.reverse(x);
	}
 }
