package day19babstractionturfmgmt;

import java.util.Scanner;

public class TurfOldVersion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your Name");
		String customerName = sc.next();

		System.out.println("Please enter Date");
		String dateOfPlay = sc.next();

		System.out.println("Please enter Time");
		String timeOfPlay = sc.next();

		System.out.println("***Turf Options***");
		System.out.println("1. Cricket");
		System.out.println("2. Football");
		System.out.println("3. Tennis");
		System.out.print("Choice : "); // 1

		int turfChoice = sc.nextInt();

		String turfType = "";
		double turfPrice = 0.0;
		switch (turfChoice) {
		case 1:
			turfType = "Cricket Turf";
			turfPrice = 800;
			break;

		case 2:
			turfType = "Football Turf";
			turfPrice = 1100;
			break;

		case 3:
			turfType = "Tennis Turf";
			turfPrice = 1500;
			break;
			
		case 4:
			turfType = "Skating Turf";
			turfPrice = 2500;
			break;

		}

		System.out.println("***BILL****");
		System.out.println("Customer Name " + customerName);
		System.out.println("Play Date " + dateOfPlay);
		System.out.println("Play Time " + timeOfPlay);
		System.out.println("Turf Type " + turfType);
		System.out.println("Price " + turfPrice);

	}

}
//limitation of this style
//1. main is burdend with business logic
//2