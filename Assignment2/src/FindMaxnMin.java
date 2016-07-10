//- Modify the above method to find the maximum and minimum number in an array of numbers
//	Example:
//		Input : [3, 5, 7, 1, 4, 32, 15]
//		Output : Max is 32 and Min is 1

public class FindMaxnMin {
	public int[] findmaxnmin(int[] nums) {
		int[] ret = new int[2];
		int max = nums[0];
		int min = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		ret[0] = max;
		ret[1] = min;
		return ret;

	}

	public static void main(String[] args) {
		FindMaxnMin n = new FindMaxnMin();
		int nums[] = { 1, 2, 55, 47, 99, 12 };
		int[] res = n.findmaxnmin(nums);
		System.out.println("Max is " + res[0] + " and " + "Min is " + res[1] + ".");
	}

}
