package lab5;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account(1, "Bob Smith", 100);
		try {
			acc.Withdraw(50);
		} catch (IllegalArgumentException e) {
			System.out.println("Insufficient funds");
		} finally {
			System.out.println(acc.getDetails());
		}
		try {
			acc.Withdraw(60);
		} catch (IllegalArgumentException e) {
			System.out.println("Insufficient funds");
		} finally {
			System.out.println(acc.getDetails());
		}
	}

	public static void lab5() {
		Account acc = new Account(1, "Bob Smith", 100);
		Account acc2 = new Account(2, "Alice Jones");
		System.out.println(acc2.getDetails());
		acc2.Deposit(1000);
		System.out.println(acc2.getDetails());
		Account acc3 = new Account(3, "claire smith");
		Account[] accounts = {acc, acc2, acc3};
		for (Account a : accounts) {
			System.out.println(a.getDetails());
		}
		Account myAccount = new Account(4, "john smith", 100);
		myAccount.addInterest();
		System.out.println(myAccount.getDetails());
		Account partnerAccount = myAccount;
		partnerAccount.addInterest();
		System.out.println(myAccount.getDetails());
	}
}
