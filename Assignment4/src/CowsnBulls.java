import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CowsnBulls {

	public ArrayList<Integer> num = new ArrayList<Integer>();
	private Scanner s;
	private int n;
	boolean mark = false;

	public CowsnBulls() {
		while (true) {
			Random randomGenerator = new Random();
			n = randomGenerator.nextInt(9000) + 1000;
			num = new ArrayList<Integer>();
			for (int i = 0; i < 4; i++) {
				num.add(n % 10);
				n = (n - n % 10) / 10;
			}
			if (init(this.num)) {
				break;
			}
		}
	}

	public boolean init(ArrayList<Integer> test) {

		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 4; j++) {
				if (test.get(i) == test.get(j)) {
					return false;
				}
			}
		}
		return true;
	}

	public ArrayList<Integer> guessnum() {
		ArrayList<Integer> cur = new ArrayList<Integer>();
		s = new Scanner(System.in);
		int input = s.nextInt();
		for (int i = 0; i < 4; i++) {
			cur.add(input % 10);
			input = (input - input % 10) / 10;
		}
		return cur;
	}

	public int[] game() {
		System.out.println("Please input a number between 1000 and 9999");
		ArrayList<Integer> cur = guessnum();
		while (true) {
			if (init(cur)) {
				break;
			} else {
				System.out.println("Please input a number between 1000 and 9999");
				cur = guessnum();
			}
		}
		int[] ret = new int[2];
		int all = 0;
		int bulls = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (cur.get(i) == num.get(j)) {
					all++;
					if (i == j) {
						bulls++;
					}
				}
			}
		}
		ret[0] = all - bulls;
		ret[1] = bulls;
		return ret;
	}

	public static void main(String[] args) {
		CowsnBulls play = new CowsnBulls();
		int[] s = play.game();
		while (s[1] != 4) {
			if (s[0] > 1) {
				System.out.print(s[0] + " Cows ");
			} else {
				System.out.print(s[0] + " Cow ");
			}
			if (s[1] > 1) {
				System.out.println(s[1] + " Bulls ");
			} else {
				System.out.println(s[1] + " Bull ");
			}
			s = play.game();
		}
		System.out.println("4 bulls, you're rght.");

	}

}
