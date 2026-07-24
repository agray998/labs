package lab3;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i1 = Program.getInt("Please enter an int: ");
//		String s1 = Program.getString("Enter a string: ");
//		System.out.printf("Provided int was: %d, provided string was: %s", i1, s1);
		Program.theLunchQueue();
		int pounds = Program.getInt("Enter a weight in pounds: ");
		Program.convertInputToStonesPounds(pounds);
		
		int kgs = Program.getInt("Enter a weight in kgs: ");
		Program.convertKgsToStonesPounds(kgs);
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
	
	public static void theLunchQueue() {
		String mainCourse; 
		do {
		    mainCourse = Program.getString("What main dish would you like (fish, burgers or veg)?");
		} while (!(mainCourse.toLowerCase().equals("veg")) && !(mainCourse.toLowerCase().equals("fish")) && !(mainCourse.toLowerCase().equals("burgers")));
		// switch (mainCourse) {
		//     case "veg", "fish", "burgers":
		//     	break;
		//     default:
		//     	System.out.printf("Main choice %s is invalid. Defaulting to burgers\n", mainCourse);
		//     	mainCourse = "burgers";
		//     	break;
		// }
		int potatoes = Program.getInt("How many potatoes do you want?");
		int sprouts = Program.getInt("How many sprouts do you want?");
		System.out.printf("Hello, your lunch is %s, with %d potatoes and %d sprouts\n", mainCourse, potatoes, sprouts);
	}

	static void convertInputToStonesPounds(int pounds) {
		int stones = pounds / 14;
		int remainderPounds = pounds % 14;
		System.out.printf("%d pounds is equal to %d stone %d pounds\n", pounds, stones, remainderPounds);
	}
	
	static void convertKgsToStonesPounds(int kgs) {
		double pounds = kgs * 2.2;
		int poundsInt = (int) pounds;
		
		Program.convertInputToStonesPounds(poundsInt);
	}
}
