//assign oddnumber 121 to171
package samplejavaproject.programms;

public class ArrayAssignment3 {

	public static void main(String[] args) {
		int count=0;
		for(int i=121;i<=171;i++)
		{
			if(2!=0)
			{
				count++;
			}
		}
		System.out.println("of Odd number"+count);
		int a[]=new int[count];
		int k=0;
		for(int j=121;j<=171;j++)
		{
			if(j%2!=0)
			{
				a[k]=j;
				k++;
				}
			}
		     //read the elements from the array
		  for(int z=a.length-1;z>=0;z--)
		  {
			  System.out.println(a[z]);
		}

	}

}
