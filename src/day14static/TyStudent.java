package day14static;

public class TyStudent {

	private int rno;			//exclusive for each object
	private String sname;		//within the class methods the instance variables are accessed using this keywor
	double per;
	static int z=99;
	
	static int strength; 			//are shared across all the objects of that class
	static String principalName="Tom";
	public void displayTyStudent()  //non static method
	{
		//static int x; static variable cannot be in a local scope
		
		System.out.println("Roll Number is "+ this.rno);
		System.out.println("Name is "+ this.sname);
		System.out.println("Percentage is "+ this.per);
	}
	//every prime number is odd but every odd number is not prime
	//every wk can bat but every batsmen cannot keep wickets
	//every non static method can access static data but every static method cannot access non static data/methods.
	public static void displayTyStudentsStrength()
	{
		System.out.println(z);
		int x=100; //local variable can be non static
		System.out.println(x);
		System.out.println("Total Strength of TY is "+ TyStudent.strength);  //can ONLY access static data
		displayPrincipal();  //can ONLY invoke static methods
		//displayTyStudent();  cannot invoke a non static method  from a static method
		//how do we access non static method from a static method
		TyStudent s1=new TyStudent(); //1. create a local non static instance
		s1.displayTyStudent();        //2. using that instance invoke the non static method
		
		//System.out.println("Roll Number is "+ this.rno);   you cannot access non static data from a static method
	}
	
	public static void displayPrincipal()
	{
		System.out.println("Principal Name  is "+ TyStudent.principalName);
	}
	

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}

	public static int getStrength() {
		return strength;
	}

	public static void setStrength(int strength) {
		TyStudent.strength = strength;
	}
	
	
}
