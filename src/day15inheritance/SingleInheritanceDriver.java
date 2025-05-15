package day15inheritance;

public class SingleInheritanceDriver {

	public static void main(String[] args) {
//		Employee emp1=new Employee(); //NoArgsConstructor
//		emp1.displayEmployee();
		
		Employee emp2=new Employee("Virat",34,"Delhi",112,"Ceo",12000); //NoArgsConstructor
		emp2.displayEmployee();
		
		//System.out.println(emp2); //requires the data in string format
								  //father requires nutrition in liquid food

	}

}
