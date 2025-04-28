package day11oops;

public class Mobile {
	
	public int mno;
	public String mfgName;
	public String modelName;
	public double price=100;
	

	
	public Mobile() {}
	public Mobile(int mno, String mfgName, String modelName, double price) 
	{
		this.mno = mno;
		this.mfgName = mfgName;
		this.modelName = modelName;
		this.price = price;
	}

	public void acceptMobile()
	{
		mno=101;
		mfgName="Samsung";
		modelName="S24 Ultra";
		price=65000;
	}

	public void displayMobile()
	{
		System.out.println("Mobile Number is "+ mno);
		System.out.println("Mobile MfgName is "+ mfgName);
		System.out.println("Mobile modelName is "+ modelName);
		System.out.println("Mobile Price is "+ price);
	}
}
