package com.enumtech.academic;

public class Student {
	
	public int rno;							//instance 
	private String sname;                   //instance
	protected double per;					//instance
	
	
	public void displayStudent()
	{
		Student s2=new Student();    //Akash object
		s2.rno=101;
		s2.sname="Akash";
		s2.per=78.5;
		
		s2.displayStudent();
		System.out.println(rno);
		System.out.println(sname);
		System.out.println(per);
	}
}


/*  default value

int 0
double 0.0
String null
boolean false
*/