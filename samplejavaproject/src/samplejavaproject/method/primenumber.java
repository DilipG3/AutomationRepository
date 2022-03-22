package samplejavaproject.method;

class Prime
{
	void prime(int x)
	{
		int temp=0;
		for(int i=2;i<x;i++)
		{
			if(x%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println(x+"It is not a prime number");
		}
		else
		{
			System.out.println(x+"It is a prime number");
		}
	}
}
public class primenumber{
	public static void main(String[] args) {
		Prime o1=new Prime();
		o1.prime(2);
		o1.prime(0);
		o1.prime(5);
		o1.prime(6);
	}
}