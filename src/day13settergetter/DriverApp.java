package day13settergetter;

public class DriverApp {

	public static void main(String[] args) {
		String s;
		
		int k=99;
		Bank l1=new Bank();
		l1.username="abc@gmail.com";
		l1.setPassword("abc123");
		l1.setAtmpin(1234);
		
		System.out.println("My Username is " + l1.username);
		System.out.println("My Password is " + l1.getPassword());
		System.out.println("My ATM pin is " + l1.getAtmpin());	
		
		int z=90;
		if(z>100)
		{
			z=100;  //block level  - block means parenthesis {}
		}
		else
		{
			System.out.println(z);   
		}
		
		
		System.out.println(k);
	}
	
	

}
