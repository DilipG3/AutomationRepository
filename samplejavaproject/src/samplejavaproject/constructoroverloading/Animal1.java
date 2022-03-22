package samplejavaproject.constructoroverloading;

class Animal
{
	Animal(String aname)
	{
		System.out.println("AnimalName:"+aname);
	}
	 Animal(int age)
	 {
		 System.out.println("Age:"+age);
	 }
	 Animal(double liters)
	 {
		 System.out.println("Liters:"+liters);
	 }
	 Animal(float weight)
	 {
		 System.out.println("Weight:"+weight);
	 }
}
public class Animal1{
public static void main(String[] args) {
Animal obj1=new Animal("Cow");
Animal obj2=new Animal(15);
Animal obj3=new Animal(10.5);
Animal obj4=new Animal(60.8f);
}
}
