//Programmatically assign odd number 51 t0 31 into a 1D array and read the elements from 1D array  
package samplejavaproject.programms;

public class ArrayAssignment1 {

	public static void main(String[] args) {
		int count=0;
		for(int i=31;i<=51;i++)
		{
			if(i%2!=0)
			{
				count=count+1;
			}
		}
		System.out.println("# of Odd NUmber:"+count);
		int a[]=new int[count];
		int k=0;
		for(int j=31;j<=51;j++)
		{
			 if(j%2!=0)
			 {
				 a[k]=j;
				 k=k+1;
			 }
		}
		//read the elements from the array
		for(int z=a.length-1;z>=0;z--)
		{
			System.out.println(a[z]);
		}

	}

}
