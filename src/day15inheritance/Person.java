package day15inheritance;

public class Person {
	protected String name;					//Eligble for inheritance YES, bcoz it is non private (protected,default,public)
	protected int age;						//Eligble for inheritance YES, bcoz it is non private (protected,default,public)
	protected String address;				//Eligble for inheritance NO, bcoz it is  private , private data mem / method CANNOT be inherited		
	
	
	public Person()  //no args construcot of parent/super class
	{
		this.name="Unknown";
		this.age=18;
		this.address="Pune";
	}
	
	public Person(String name,int age,String address) //all args costructor of super class
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	public void displayPerson()
	{
		System.out.println("Name is" + this.name);
		System.out.println("Age is" + this.age);
		System.out.println("Address is" + this.address);
	}
}

//Total Data members in the clas Person : 3
//Total Methods in the clas Person : 2
//lines of code 11