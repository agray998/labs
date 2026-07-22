package lab5;

public class Account {
	private int id;
	private String owner;
	private double balance;
	
	public Account(int id, String owner, double balance) {
		this.id = id;
		this.owner = owner;
		this.balance = balance;
	}
	
	public Account(int id, String owner) {
		this(id, owner, 0);
	}
	
	public void Deposit(double amount) {
		if (amount < 0) {
			System.out.printf("Deposit amount %g is invalid: less than zero\n", amount);
		} else {
			this.balance += amount;
		}
	}
	
	public void Withdraw(double amount) {
		if (amount > this.balance) {
			System.out.println("Insufficient funds");
		} else {
			this.balance -= amount;
		}
	}
	
	public String getDetails() {
		return String.format("Account # %d: Owner %s, balance %.2f", this.id, this.owner, this.balance);
	}
	
	public String getOwner() {
		return this.owner;
	}

}
