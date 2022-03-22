package samplejavaproject.constructoroverloading;

class Food
{
	Food(String fname)
	{
		System.out.println("FoodName:"+fname);
	}
	 Food(float pricef)
	 {
		 System.out.println("Price:"+pricef);
	 }
	 Food(int quantity)
	 {
		 System.out.println("Quantity:"+quantity);
	 }
	 Food(String hotel,String area)
	 {
		 System.out.println("Hotel:"+hotel+"Area:"+area);
	 }
}
public class Fooditem1{
public static void main(String[] args){
 Food obj1=new Food("Idli");
 Food obj2=new Food(20.5f);
 Food obj3=new Food(2);
 Food obj4=new Food("Sri","Bng");
}
}