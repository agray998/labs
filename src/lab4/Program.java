package lab4;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 3, -5, 7, 0, 4, 6, 8};
		System.out.println(Program.getSum(numbers));
		System.out.println(Program.getAvg(numbers));
	}
	
	public static int getSum(int[] nums) {
		int result = 0;
		for (int num : nums) {
			result += num;
		}
		return result;
	}
	
	public static double getAvg(int[] nums) {
		int sum = Program.getSum(nums);
		int ints = nums.length;
		double mean = (double) sum / (double) ints;
		return mean;
	}

}
