
public class PrimitiveDatatype2 {

	public static void main(String[] args) {
		int arr[]= {10,20,30};
		
		System.out.println(arr[0]);  //10
		test(arr[0]);//Primitive        		by val
		System.out.println(arr[0]);  //99

	}

	private static void test(int z) {
		System.out.println(z);  //10
		z=99;
		System.out.println(z);  //99
		
	}	
}
//10
//10
//99
//10