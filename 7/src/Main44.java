import java.util.Scanner;
class Account{
	private int balance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	public synchronized void deposit(int money){
		this.balance  = this.balance + money;
	}
	
	public synchronized void withdraw(int money){
		this.balance  = this.balance - money;
	}
}