//username : alice@gmail.com
//password : alice123
package day20bankingapp;

import java.util.Random;
import java.util.Scanner;

public class SolutionDriverApp3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		BankCustomer2 customer=new BankCustomer2("alice@gmail.com","alice123");
		
		System.out.println("Username");
		String username=sc.next();
		System.out.println("Password");
		String password=sc.next();
		
		HDFCBank bank=new HDFCBank();
//		boolean loginStatus=customer.login(username, password);
//		if(loginStatus==true)
			
		if(customer.login(username, password))
		{
			do
			{
				System.out.println("***Banking Menu***");
				System.out.println("1. Deposit");
				System.out.println("2. Withdraw");
				System.out.println("3. Online Transfer");
				System.out.println("4. Check Balance");
				System.out.println("0. Exit");
				System.out.print("Choice : ");
				int userChoice=sc.nextInt();
				switch(userChoice)
				{
				case 1: bank.deposit();
				        break;
				case 2: bank.withdraw();
		        		break;
				case 3: bank.onlineTransfer();
        				break;
				case 4 : bank.checkBalance();
				 	 	break;
				case 0 : System.exit(0);  //peaceful exit 
				default : System.out.println("Invalid Choice");		
				}
			}while(true);
				
		}
		else
		{
			System.out.println("Bad Credentials");
		}

	}

}
