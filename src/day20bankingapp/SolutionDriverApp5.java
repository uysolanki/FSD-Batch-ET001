
//password : alice123
package day20bankingapp;

import java.util.Scanner;

public class SolutionDriverApp5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		BankCustomer2 customer1=new BankCustomer2("alice@gmail.com","alice123");
		BankCustomer2 customer2=new BankCustomer2("ben@gmail.com","ben123");
		BankCustomer2 customer3=new BankCustomer2("chris@gmail.com","chris123");
		
		
		BankCustomer2 customers[]=new BankCustomer2[3];
		customers[0]=customer1;
		customers[1]=customer2;
		customers[2]=customer3;
		
		
		System.out.println("Username");
		String username=sc.next();
		System.out.println("Password");
		String password=sc.next();
		
		boolean loginStatus=false;
		for(int i=0;i<customers.length;i++)
		{
			loginStatus=customers[i].login(username, password);
			if(loginStatus==true)
				break;
		}
		
		HDFCBank2 bank=new HDFCBank2();
//		boolean loginStatus=customer.login(username, password);
//		if(loginStatus==true)
			
		if(loginStatus)
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
		        		if(depositAmount>0)
		        		{
						bank.deposit(depositAmount);
						System.out.println("Deposit Successful");
		        		}
		        		else
		        		System.out.println("Please enter valid deposit Amount");
				        break;
				case 2: System.out.println("Enter Amount to Withdraw");
						double withdrawAmount=sc.nextDouble();
						if(withdrawAmount<0)
							System.out.println("Please enter valid withdraw Amount");
						else if(withdrawAmount>bank.getBalance())
							System.out.println("Insufficient Balance");
						else
							{
							bank.withdraw(withdrawAmount);
							System.out.println("Withdrawal Successful");
							}
						
		        		break;
				case 3: int receivedOtp=OTPGenerator.generateOTP();
						System.out.println(receivedOtp);
						System.out.println("Enter OTP sent via SMS");
						int enteredOtp=sc.nextInt();
						if(receivedOtp==enteredOtp)
						{
							System.out.println("Enter Amount to Transfer");
				    		double transferAmount=sc.nextDouble();
				    		
				    		if(transferAmount<0)
								System.out.println("Please enter valid transfer Amount");
							else if(transferAmount>bank.getBalance())
								System.out.println("Insufficient Balance");
							else
								{
								bank.onlineTransfer(transferAmount);
								System.out.println("Online Transfer Successful");
								}
						}
						else
						{
							System.out.println("OTP does not match");
							System.out.println("Online Transfer Not Successful");
						}
						
						
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
