package com.sgtesting.inheritance;

 class Grandfather
 {
	 void printGrandfather()
	 {
		 System.out.println("Grandfather class");
	 }
 }
 class Father extends Grandfather
 {
	 void printFather()
	 {
		 System.out.println("Father class has inherited Grandfather");
	 }
 }
 class Son extends Father
 {
	 void printSon()
	 {
		 System.out.println("Son class has inherited Father");
	 }

	public void printDaughter() {
		
		
	}
 }
 class Daughter extends Father
 {
	 void printDaughter()
	 {
		 System.out.println("Daughter class has inherited Father");
	 }
 }
 public class Hybridinheritance{
 public static void main(String[] args) {
	 Son obj=new Son();
	 obj.printGrandfather();
	 obj.printFather();
	 obj.printSon();
	 
	 Daughter obj2=new Daughter();
	 obj.printDaughter();
	 obj.printFather();
	 obj.printGrandfather();
	
 }
 }