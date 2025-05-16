package day16poly;

public class Aradhya extends Abhishek
{
	public String qualification = "PHD";																				//  New Jalsa    BMW  AndheriOffice
	public void office()									//total how many methods 3 : home() + car() + office()
	{
		System.out.println("Andheri Office");
	}
	
	@Override
	public void car()									
	{
		System.out.println("BMW");
	}
	
	@Override
	public void home()									
	{
		System.out.println("New Jalso Pro max");
	}
}
