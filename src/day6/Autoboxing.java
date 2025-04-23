package day6;

public class Autoboxing {
	
	public static void main(String[] args) {
		
		int a=10;   //primitive;
		            //proof     a. will not show any list of methods
		System.out.println("Primitive " +a); //10
		Integer aObject=new Integer(a);  //Non Primitive
										//proof     aObject. will show list of methods
		System.out.println("Non Primitive " +aObject);
		
		int x=aObject.intValue();
		System.out.println(x);
		
		
		byte b=10;
		System.out.println(b);  //min byte value -128  maximum byte 127
		
		Byte bObject=new Byte(b); //Autoboxing
		System.out.println(bObject.MAX_VALUE);
		
		byte c=bObject.byteValue();//Unboxing
		System.out.println(c);
		
	}
}
