package com.sgtesting.inheritance;

class Shape
{
	void display()
	{
		System.out.println("Inside display");
	}
}
class Rectangle extends Shape
{
	void area()
	{
		System.out.println("Inside area");
	}
}
class Cube extends Rectangle
{
	void volume()
	{
		System.out.println("Inside volume");
	}
}
public class Multilevelinheritance{
 public static void main(String[] args) {
	 Cube cube=new Cube();
	 cube.display();
	 cube.area();
	 cube.volume();
 }
}



