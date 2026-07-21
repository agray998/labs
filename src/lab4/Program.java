package lab4;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 3, -5, 7, 0, 4, 6, 8};
		System.out.println(Program.getSum(numbers));
		System.out.println(Program.getAvg(numbers));
		System.out.println(Program.getMin(numbers));
		System.out.println(Program.findZero(numbers));
		int[] numbers2 = {1, 0, -5, 7, 0, 4, 0, 8};
		System.out.println(Program.findLastZero(numbers2));
		String[] names = {"alice", "bob", "claire", "derek", "emily"};
		int[] marks = {77, 61, 53, 30, 55};
		String grade;
		for (int i = 0; i < names.length; i++) {
			grade = Program.getGrade(marks[i]);
			System.out.printf("Student %s got grade: %s\n", names[i], grade);
		}
		Program.multiplicationTable(10, 12);
	}
	
	// Task 1
	public static int getSum(int[] nums) {
		int result = 0;
		for (int num : nums) {
			result += num;
		}
		return result;
	}
	
	// Task 2
	public static double getAvg(int[] nums) {
		int sum = Program.getSum(nums);
		int ints = nums.length;
		double mean = (double) sum / (double) ints;
		return mean;
	}
	
	// Task 3
	public static int getMin(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		int min = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		return min;
	}
	
	// Task 4
	public static int getMax(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		return max;
	}
	
	// Task 5
	public static int findZero(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				return i;
			}
		}
		return -1;
	}
	
	// Task 5 modified - find last zero
	public static int findLastZero(int[] nums) {
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == 0) {
				return i;
			}
		}
		return -1;
	}
	
	// Part 2 - Grades for multiple students
	public static String getGrade(int mark) {
		if (mark < 0 || mark > 100) {
			return "N/A (Invalid score)";
		}
		else if (mark < 50) {
			return "Fail";
		} else if (mark <= 60) {
			return "Pass";
		} else if (mark <= 70) {
			return "Merit";
		} else {
			return "Distinction";
		}
	}

	// Part 3
	public static void multiplicationTable(int cols, int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= cols; j++) {
				System.out.printf("%5d", i * j);
			}
			System.out.printf("\n");
		}
	}
}
