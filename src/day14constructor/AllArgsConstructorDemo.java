package day14constructor;

public class AllArgsConstructorDemo {

	public static void main(String[] args) {
	Student s1=new Student();  //NoArgsConstructor		Car 5 6 Colors  
	Student s2=new Student();  //NoArgsConstructor
	Student s3=new Student();  //NoArgsConstructor
	
	s1.displayPerson();
	s2.displayPerson();
	s3.displayPerson();  //limitation of using default constructor is it thorwd NullPointerException
	System.out.println(s1.getSname().length());
	
	System.out.println("hii");
	                      //int,String,double
	Student s4=new Student(18,"Virat",78.5); //AllArgsConstructor
	s4.displayPerson();
	
	}

}
