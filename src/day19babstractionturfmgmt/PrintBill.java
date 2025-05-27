package day19babstractionturfmgmt;

public class PrintBill {

	public static void printBill(Turf turf,String customerName,String dateOfPlay,String timeOfPlay)
	{
		System.out.println(String.format("%-15s","***BILL****"));
		System.out.println(String.format("%-15s : %15s", "CustomerName",customerName));
		System.out.println(String.format("%-15s : %15s", "Date Of Play",dateOfPlay));
		System.out.println(String.format("%-15s : %15s", "Time Of Play",timeOfPlay));
		System.out.println(String.format("%-15s : %15s", "Turf Type",turf.getTurfName()));
		System.out.println(String.format("%-15s : %15s", "Turf Price",turf.getHourlyPrice()));
	}
}
