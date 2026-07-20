package lab1;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String message; // = "Hello World!!";
		// ...
		String defaultMessage = args[0];
		System.out.println(defaultMessage);
		
		char c1;
		
		c1 = 'c';
//		c2 = 'Z';
//		
//		System.out.println((int) c1);
//		System.out.println((int) c2);
		
		// Program p = new Program();
		
//		if (Program.isUpper(c1)) {
//		    System.out.println("Upper Case");
//		} else if () {
//			System.out.println("lower case");
//		} else if () {
//			
//		} else {
//			
//		}
		
		switch (c1) {
		  case 'a':
			  System.out.println("foo");
			  break;
		  case 'b':
			  System.out.println("bar");
			  break;
		  default:
			  System.out.println("Default case");
			  break;
		}
		
		var bigX = Double.parseDouble(args[1]);
		double x = bigX * 2;
		System.out.println(x);
	}
	
	public static boolean isUpper(char c) {
		int charCode = c;
		boolean result;
		result = charCode >= 65 && charCode <= 90;
		return result;
	}

}
