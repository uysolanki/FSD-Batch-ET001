package day15inheritance;

public class InheritanceReturnDemo {

	public static void main(String[] args) {
		//area();
//		int ans=area1();
//		System.out.println("Area is "+ans);
		
		double result=areaRect();
		System.out.println("Area is Rectangle is "+result);
	}
	
	static void area()
	{
	int radius=5;
	double area=3.14*radius*radius;
	System.out.println("Area is "+area);
	}
	
	static int area1()
	{
	int radius=5;
	double area=3.14*radius*radius;
	return (int)area;
	}
	
	static double areaRect()
	{
		int len=5,br=10;
		int area=len*br;
		return area;	
	}
}
