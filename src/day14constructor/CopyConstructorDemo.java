package day14constructor;

public class CopyConstructorDemo {

	public static void main(String[] args) {
	
	
	Student s4=new Student(18,"Virat",78.5); 
	//s4.displayPerson();
	
	System.out.println(s4.getSname());  //Virat
	
	Student s6=new Student(s4);
	System.out.println(s6.getSname());  //Virat
	
	s6.setSname("Rohit");
	System.out.println(s4.getSname());  //Virat
	System.out.println(s6.getSname());  //Rohit
	
	
	}

}
