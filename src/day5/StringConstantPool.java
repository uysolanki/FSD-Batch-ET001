package day5;

public class StringConstantPool {

	public static void main(String[] args) {
		String name1="Alice";
		String name2="alice";
		
		System.out.println(name1==name2);  //true   SCP case insensitive    
										   //false  SCP case sensitive
		
		
		String name3=new String("Alice");
		System.out.println("FSD " +name1==name3); //false
		
		String name4=new String("Alice");
		System.out.println("ET " +name3==name4);
		System.out.println("ET " +name3.equals(name4));
		System.out.println("ABC" +name1.equals(name2));
		System.out.println("XYZ" +name1.equalsIgnoreCase(name2));
	}

}
