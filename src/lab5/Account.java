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
	
	public void close() {
		System.out.printf("Account %d is closed\n", this.id);
	}
	
	public void Deposit(double amount) throws IllegalArgumentException {
		if (amount < 0) {
			throw new IllegalArgumentException();
		} else {
			this.balance += amount;
		}
	}
	
	public void Withdraw(double amount) throws IllegalArgumentException {
		if (this.balance < amount) {
			throw new IllegalArgumentException();
		}
 		this.balance -= amount;
	}
	
	public String getDetails() {
		return String.format("Account # %d: Owner %s, balance %.2f", this.id, this.owner, this.balance);
	}
	
	public String getOwner() {
		return this.owner;
	}

	public void addInterest() {
		// 2.5% = 0.025
		this.balance *= 1.025;
	}

}
