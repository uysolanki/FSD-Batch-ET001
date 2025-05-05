package day13settergetter;

public class Student {
	
	public int rno;							//instance 
	public String sname;                    //instance
	public double per;				     	//instance
	public boolean isMarried;				//instance
	
	public void displayStudent()
	{	
		System.out.println("INT " +rno);
		System.out.println("String" +sname);
		System.out.println("Double "+per);
		System.out.println("Boolean " +isMarried);
	}
}


/*  default value

int 0
double 0.0
String null
boolean false
*/