package day20bankingapp;

import java.util.Random;
import java.util.Scanner;

public class HDFCBank2 implements BankingService2 {
	private double balance;
	Scanner sc = new Scanner(System.in);

	public HDFCBank2() {
		this.balance = 5000;
	}

	@Override
	public void deposit(double depositAmount) {
		balance += depositAmount;
	}

	@Override
	public void withdraw(double withdrawAmount) {
		balance -= withdrawAmount;
	}

	@Override
	public void checkBalance() {
		System.out.println(balance);

	}

	@Override
	public void onlineTransfer(double transferAmount) {
		withdraw(transferAmount);
	}

	public double getBalance() {
		return balance;
	}

}
