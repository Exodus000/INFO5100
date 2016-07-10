import java.util.ArrayList;
import java.util.Scanner;

public class Even {

	private static Scanner s;

	public ArrayList<Integer> findeven(int limit) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		System.out.println("Printing Even numbers between 2 and " + limit);
		for (int i = 1; i <= limit; i++) {
			if (i % 2 == 0) {
				ret.add(i);
			}

		}
		return ret;
	}

	public static void main(String[] args) {
		Even E = new Even();
		System.out.println("Please input an integer:");
		s = new Scanner(System.in);
		int limit = s.nextInt();
		System.out.println(E.findeven(limit));

	}
}
