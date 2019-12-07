package entities;

public class Account {
		
	private int number;
	private String holder;
	private double balance;
	
	public Account (int number, String holder, double balance) {
		this.number= number;
		this.holder= holder;
		this.balance= balance;
	}
	
	public Account (int number, String holder) {
		this.number= number;
		this.holder = holder;
	}
		
	public int getnumber() {
		return this.number;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(int balance) {
		this.balance += balance;
	}

	public void withdraw(int balance) {
		this.balance -= (balance-5);
	}

	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+", Balance: $ "
				+String.format("%.2f", balance);
	}
}
	


