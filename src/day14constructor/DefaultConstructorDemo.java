package day14constructor;

public class DefaultConstructorDemo {

	public static void main(String[] args) {
	Student s1=new Student();  //rno  sname per
	Student s2=new Student();  //rno  sname per
	Student s3=new Student();  //rno  sname per
	
	s1.displayPerson();
	s2.displayPerson();
	s3.displayPerson();  //limitation of using default constructor is it thorwd NullPointerException
	System.out.println(s1.getSname().length());
	
	System.out.println("hii");
	
	}

}
