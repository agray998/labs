package lab3;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1 = Program.getInt("Please enter an int: ");
		String s1 = Program.getString("Enter a string: ");
		System.out.printf("Provided int was: %d, provided string was: %s", i1, s1);
	}
	
	public static int getInt(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		return i;
	}
	
	public static String getString(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		return s1;
	}

}
