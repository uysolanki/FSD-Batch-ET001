package day16poly;

public class DriverApp {

	public static void main(String[] args) {
		Aradhya a1=new Aradhya();
		a1.home(); //NJPM   //home() is a method, so for a method check we check for type of object, as object is of Aradhya then the home of Ardhya will be called
		a1.car();  //BMW
		a1.office(); //AO
		System.out.println(a1.qualification); //PHD qualification is data, for data we check type of ref, as ref is of Aradhya then the qual of Aradhya will be displayed.
		
		Abhishek a2=new Aradhya();
		a2.home();	//NJPM //once the sub class overrides the method then it will invoke the overridden method
		a2.car();	//BMW
		System.out.println(a2.qualification); //MCOM
		 
		Amitabh a3=new Aradhya();
		a3.home();  //NJPM
		System.out.println(a3.qualification); //BCOM

	}

}


//Data belongs to the ref
//method belongs to the object