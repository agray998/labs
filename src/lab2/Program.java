package lab2;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		score = Integer.parseInt(args[0]);
		
		if (score < 0 || score > 100) {
			System.out.println("Invalid score");
		}
		else if (score < 50) {
			System.out.println("Fail");
		} else if (score <= 60) {
			System.out.println("Pass");
		} else if (score <= 70) {
			System.out.println("Merit");
		} else {
			System.out.println("Distinction");
		}
	}

}
