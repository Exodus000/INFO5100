
public class FindSingle {
	public int singleNumber(int[] nums) {
		if (nums == null) {
			// why 00?
			return 00;
		}
		// why? Is [1] a single number? -5
		if (nums.length <= 2) {
			return 00; // illegal input output
		}
		int x = 0;
		for (int a : nums) {
			x = x ^ a; //find the single one
		}
		return x;
	}
	// finish your code here

	public static void main(String[] args) {
		FindSingle f = new FindSingle();
		int[] nums = { 3, 2, 3 };
		if (f.singleNumber(nums) == 00) {
			System.out.println("Error,please input more than 2 numbers and a number should appear no more than twice.");
		} else {
			System.out.println("The single number is " + f.singleNumber(nums) + ".");
		}
	}
}
