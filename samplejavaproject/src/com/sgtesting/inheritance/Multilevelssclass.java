package com.sgtesting.inheritance;

class Smartcity
{
	void displaycity(String cityname)
	{
		System.out.println("The city name in super class:"+cityname);
	}
}
class Democity extends Smartcity
{
	Democity(String city)
	{
		super.displaycity(city);
	}
	 void displaycity(String cityname)
	 {
		 System.out.println("The city Name in sub class:"+cityname);
	 }
}
class Smallcity extends Democity
{
	Smallcity(String city) 
	{
		super(city);
	}
	  void displaycity(String name)
	{
		System.out.println("The city Name in sub class:"+name);
	}
}
public class Multilevelssclass{
public static void main(String[] args) {
	Smallcity o=new Smallcity("Bangalore");
	o.displaycity("Raichur");
    o.displaycity("Sindhnur");
}

}
	