package day14static;

import java.util.Scanner;

public class TyStudentDriver {

	static int x;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		x=100;
		
		
		sc.nextInt();
		
		TyStudent.displayTyStudentsStrength();
		TyStudent.displayPrincipal();  ///null
		TyStudent s1=new TyStudent();
		s1.setRno(101);				//out side the class the instance variables are accessed using the object
		s1.setSname("Alice");
		s1.setPer(78.5);
		TyStudent.strength=60;
		
		TyStudent s2=new TyStudent();
		s2.setRno(102);
		s2.setSname("Ben");
		s2.setPer(88.5);
		
		TyStudent s3=new TyStudent();
		s3.setRno(103);
		s3.setSname("Chris");
		s3.setPer(98.5);
		
		s1.displayTyStudent();		//non static method is invoked using object name
		s2.displayTyStudent();
		s3.displayTyStudent();
		
		TyStudent.displayTyStudentsStrength(); //static method is invoked using the class name
		
		System.out.println(TyStudent.principalName);
		System.out.println(s2.principalName);
		System.out.println(s3.principalName);
		
		greet();

	}
	
	public static  void greet()
	{
		System.out.println("Hi");
	}
}
