package day20bankingapp;

import java.util.Random;
import java.util.Scanner;

public class HDFCBank implements BankingService
{
	double balance;
	Scanner sc=new Scanner(System.in);
	
	public HDFCBank()
	{
		this.balance=5000;
	}

	@Override
	public void deposit() {
		System.out.println("Enter Amount to Deposit");
        double depositAmount=sc.nextDouble();
        balance+=depositAmount;
        System.out.println("Deposit Successful");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Enter Amount to Withdraw");
		double withdrawAmount=sc.nextDouble();
		balance-=withdrawAmount;
		System.out.println("Withdrawal Successful");
		
	}

	@Override
	public void checkBalance() {
		System.out.println(balance);
		
	}

	@Override
	public void onlineTransfer() {
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
		
	}

}
