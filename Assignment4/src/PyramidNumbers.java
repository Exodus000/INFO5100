import java.util.Arrays;

public class PyramidNumbers {
	public int[] tri(int n) {
		int[] ret = new int[(n + 1) * n / 2 + 1];
		Arrays.fill(ret, 0);
		for (int i = 1; i <= (n + 1) * n / 2; i++) {
			ret[i] = i;
<<<<<<< Updated upstream
			// please remove it after your test, do not leave unneeded code inside.
			// System.out.println(ret[i]);
=======
>>>>>>> Stashed changes
		}
		return ret;
	}

	public static void main(String[] args) {
		PyramidNumbers p = new PyramidNumbers();
		// why you hardcoded the number? Your program should support input the number from console.
		int n = 4;
		int it = 1;
		int[] s = p.tri(n);
		for (int j = 1; j < s.length; j++) {
			if (j == 1) {
				for (int k = 0; k <= n - it + 1; k++) {
					System.out.print(" ");
				}
				if (n > 5 && j < 11) {
					System.out.print(" ");
				}
			}
			// k is the count of blank
			System.out.print(s[j] + " ");
			if (j == (it + 1) * it / 2) {
				System.out.print("\n");
				
				for (int k = 0; k <= n - it; k++) {
					System.out.print(" ");
				}
				if (n > 5 && j < 9 ) {
					System.out.print(" ");
				}
				it++;

			}
		}
	}
}
