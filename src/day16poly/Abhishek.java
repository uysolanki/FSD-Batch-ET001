package day16poly;

public class Abhishek extends Amitabh
{														//                   Jalsa    Mercedes
	public String qualification = "MCOM";
	
	public void car()									//total how many 2 : home() + car()
	{
		System.out.println("Mercedes");
	}
	
	@Override
	protected void home()		//function with the same name & same parameter list allready exists in the parent/super class
	{						//but still i am creating a function with the same name and parameter in child/sub class also
							//but with a different implementation
							//known as function overriding
		System.out.println("New Jalsa");
	}
	
	
	final public void gold()    //cannot overide this function, it can be inherited cannot be modified
	{
		System.out.println("Ranka jewellers");
	}

}
