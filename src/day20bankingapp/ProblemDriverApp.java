//username : alice@gmail.com
//password : alice123
package day20bankingapp;

import java.util.Random;
import java.util.Scanner;

public class ProblemDriverApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Username");
		String username=sc.next();
		System.out.println("Password");
		String password=sc.next();
		double balance=5000;
		if(username.equals("alice@gmail.com") && password.equals("alice123"))
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
				case 1: System.out.println("Enter Amount to Deposit");
				        double depositAmount=sc.nextDouble();
				        balance+=depositAmount;
				        System.out.println("Deposit Successful");
				        break;
				case 2: System.out.println("Enter Amount to Withdraw");
		        		double withdrawAmount=sc.nextDouble();
		        		balance-=withdrawAmount;
		        		System.out.println("Withdrawal Successful");
		        		break;
				case 3: 
						Random random=new Random();
						int receivedOtp=random.nextInt(900000)+100000;
						System.out.println(receivedOtp);
						System.out.println("Enter OTP sent via SMS");
		        		int enteredOtp=sc.nextInt();
		        		if(receivedOtp==enteredOtp)
		        		{
		        			System.out.println("Enter Amount to Transfer");
			        		double transferAmount=sc.nextDouble();
			        		balance-=transferAmount;
			        		System.out.println("Online Transfer Successful");
		        		}
		        		else
		        		{
		        			System.out.println("OTP does not match");
		        			System.out.println("Online Transfer Not Successful");
		        		}
        				break;
				case 4 : System.out.println(balance);
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
