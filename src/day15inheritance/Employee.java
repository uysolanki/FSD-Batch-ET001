package day15inheritance;

public class Employee extends Person  //all the eligible data members and methods will be inhrited
{
	public int eno;
	public String designation;
	public double salary;
	
	public Employee()  //no args constructor of child/sub class
	{
		super();  //IN A CONSTRUCOT, the call to super should be made from the 1st line compulsory
		this.eno=101;
		this.designation="Manager";
		this.salary=9000;
	}
	
	public Employee(String name,int age,String address,int eno,String designation,double salary)
	{
		super(name,age,address);
		this.eno=eno;
		this.designation=designation;
		this.salary=salary;
	}
	
	

	@Override  //invoked implicitly when there arises a need to convert from Object->String
	public String toString() {
		return "Employee [eno=" + eno + ", designation=" + designation + ", salary=" + salary + ", name=" + name
				+ ", age=" + age + ", address=" + address + "]";
	}
	
	public void displayEmployee()
	{	
		System.out.println("Emp Number is" + this.eno);
		System.out.println("Designation is" + this.designation);
		super.displayPerson();
		System.out.println("Salary is" + this.salary);
		
	}
	
	
}

//3 lines of Code
//Total how many Data members are there in the Employee? 3+3 = 6
//Total how many methods are there in the Employee? 1+2 = 3
