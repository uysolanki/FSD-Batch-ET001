package day13settergetter;

public class DriverApp2 {

	public static void main(String[] args) {
		Student s1=new Student();
//		System.out.println(s1.rno);
//		System.out.println(s1.sname);
//		System.out.println(s1.per);
//		System.out.println(s1.isMarried);
		s1.displayStudent();
		
		int a=0;			//local variables do not have any initial value, they must be explicitly initialized else it will throw compile time error
		double b=0.0;		//local
		String c=null;		//local
		boolean d=false;    //local
		
		System.out.println(a);  
		System.out.println(b);  
		System.out.println(c);  
		System.out.println(d);  
		
	}
	
	

}
