import java.util.Arrays;

public class CountZeros {

	public int[] move(int[] nums, int digit) {
		// please check if nums is null.

		int length = nums.length;
		int[] ret = new int[length];
		// no need to add this line, init int array the default value should be
		// all 0.
		Arrays.fill(ret, 0);
		// iterate each number for first 0
		for (int it = 0; it < length; it++) {
			if (nums[it] == digit) {
				int counter = 0;
				// count numbers of 0
				for (int j = it; j < nums.length; j++) {
					if (nums[j] == digit) {
						counter++;
					} else {
						break;
					}
				}

				ret[it] = counter;
				it = it + counter;
			}
		}

		return ret;

	}

	// rename is to a better name.
	// in move() function, you pass in digit as the target number to write down,
	// so in this function you may also need to pass in the target number to
	// keep consistency.
	public void print(int[] result, int digit) {
		int len = result.length;
		for (int k = 0; k < len; k++) {
			if (result[k] > 1) {
				for (int j = 0; j < result[k]; j++) {
					System.out.print(digit);
				}
				System.out.print(" occurs @ index " + k + "\n");
			}
		}
	}

	public static void main(String[] args) {
		int nums[] = { 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0 };
		if (nums == null) {
			System.out.print("Invalid input.");
		} else {
			CountZeros m = new CountZeros();
			// if you call m.move(null, 0), what will get NPE, so all the
			// functions need to check input first.
			int[] f = m.move(nums, 0);
			m.print(f, 0);
		}
	}

}