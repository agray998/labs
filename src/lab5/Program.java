package lab5;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account(1, "Bob Smith", 100);
		Account acc2 = new Account(2, "Alice Jones");
		System.out.println(acc2.getDetails());
		acc2.Deposit(1000);
		System.out.println(acc2.getDetails());
	}

}
