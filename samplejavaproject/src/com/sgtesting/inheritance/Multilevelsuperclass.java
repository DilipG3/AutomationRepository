package com.sgtesting.inheritance;

class Department
{
	Department(String pname,String subject)
	{
		System.out.println("Professor Name"+pname+"Subject Name"+subject);
	}
}
class Professor extends Department
{
	 	 Professor(String pname,String department )
	{
	 		super(pname,department);
	}
}
class Student extends Professor
{
	 Student(String name,String branch)
	{
		super(name,branch);
	}
}
public class Multilevelsuperclass{
 public static void main(String[] args) {
	 Student o=new Student("vishwa","Biology");
	 Student o2=new Student("Chandru","Physics");
	 Student o3=new Student("Giri","Civil");
 }
}
