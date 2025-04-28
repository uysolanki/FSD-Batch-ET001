package day11oops;

public class DriverApp {

	public static void main(String[] args) {
		
		final Mobile m1=new Mobile(101, "Samsung", "S24 Ultra", 75000.0);   //day 1 : simple syntax to create an object in java
		m1.price=67500.0;
		
		Mobile m2=new Mobile(102, "One Plus", "12 pro", 55000.0);
		
		Mobile mobile3=new Mobile(103,"Apple","Ipone16 Pro Max",135000.0);
		mobile3.price=145000.0;
		
		new Mobile(104,"Apple","Ipone15 Pro Max",100000.0);	 
	}

}
