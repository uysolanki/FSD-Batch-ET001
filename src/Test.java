import java.util.Scanner;

public class Test {
	
	public static void main(String args[])
	{
		//display maximum of 2 numbers
		//int n1 = 0,n2 = 0;
		
//		n1=1000;
//		n2=500;
		//you cannot benefit from a class without creating its object
		Scanner sc=new Scanner(System.in);       //Predefined Class  ctrl shift O
		// classname objectname = new Classname();
		
		System.out.print("Enter the first Number"); //7
		int n1=sc.nextInt();
		System.out.print("Enter the second Number"); //8
		int n2=sc.nextInt();
		
//		if(n1>=n2)
//		{
//			System.out.println(n1+" is greater");
//		}
//		else
//		{
//			System.out.println(n2+" is greater");
//		}
		
		
		
//		if(n1>=n2)
//		{
//			System.out.println(String.format("%d is greaterr", n1));
//		}
//		else
//		{
//			System.out.println(String.format("%d is greaterr", n2));
//		}
		
		System.out.println(n1>=n2?String.format("%d is greaterrrrrr", n1):String.format("%d is greaterrrrrr", n2));
		
	}
}
