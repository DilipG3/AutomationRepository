package samplejavaproject.method;

class Even
{
	void even(int x,int y)
	{
		for(int i=x;i>=y;i--)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
public class Evennumber{
	public static void main(String[] args){
		Even e=new Even();
		e.even(40, 20);
	}
}