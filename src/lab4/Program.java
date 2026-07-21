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
		for (int i = nums.length - 1; i >= 0 ; i--) {
			if (nums[i] == 0) {
				return i;
			}
		}
		return -1;
	}

}
