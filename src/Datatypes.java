
public class Datatypes {

	public static void main(String[] args) {
		
		String s2 = new String("hello");
		String s1 = "hello";
		

		System.out.println(s1 == s2); // false (different memory locations)
		System.out.println(s1.equals(s2));
		

	}

}
