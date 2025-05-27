package day19babstractionturfmgmt;

import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your Name");
		String customerName=sc.next();
		
		System.out.println("Please enter Date");
		String dateOfPlay=sc.next();
		
		System.out.println("Please enter Time");
		String timeOfPlay=sc.next();
		
		System.out.println("***Turf Options***");
		System.out.println("1. Cricket");
		System.out.println("2. Football");
		System.out.println("3. Tennis");
		System.out.println("4. Skating");
		System.out.print("Choice : ");  //1
		
		int turfChoice=sc.nextInt();
		
		Turf turf=TurfManager.getTurf(turfChoice);
		//P p = new C()   with overriding
		
		PrintBill.printBill(turf,customerName,dateOfPlay,timeOfPlay);
	}

}
