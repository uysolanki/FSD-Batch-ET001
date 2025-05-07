package day14static;

public class StaticBlockDemo {
	
	int a,b;
//	static int c=18,d=45;					//initialise the static/class variable
//	static String e="Alice",f="Ben";
//	static boolean g=true,h=false;
//	static double i=1.1,j=2.1;
	
	static int c,d;					//initialise the static/class variable
	static String e,f;
	static boolean g,h;
	static double i,j;
	
	static
	{
		c=18;
		d=45;
		e="Alice";
		f="Ben";
		g=true;
		h=false;
		i=1.1;
		j=2.1;
		System.out.print("Welcome to ");
	}


	static void displayStaticData()
	{
		System.out.println("Static Integer"+c);
		System.out.println("Static String"+e);
		System.out.println("Static boolean"+g);
		System.out.println("Static double"+i);	
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enumtech");
		displayStaticData();
		System.out.println("Good Bye");
	}
	

}
