
public class PrimitiveDatatype {

	public static void main(String[] args) {
		int a=10;
		
		System.out.println(a);  //10
		test(a);//Primitive        		by value 
		System.out.println(a);  //10

	}

	private static void test(int b) {
		System.out.println(b);  //10
		b=99;
		System.out.println(b);  //99
	}

}
//10
//10
//99
//10