package day20bankingapp;

public interface BankingService2 {
	
	void deposit(double depositAmount);
	void withdraw(double withdrawAmount);
	void checkBalance();
	void onlineTransfer(double transferAmount);

}
