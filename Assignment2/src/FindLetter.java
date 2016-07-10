
//- Modify the above method to take a String and character as input and find how many characters are in the String
//	Example #1
//		Input : "North", 'r'
//		Output : "North" has 1 'r'
import java.util.Scanner;

public class FindLetter {

	public int getletter(String str, char c) {
		int n = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				n++;
			}
		}

		return n;
	}

	public static void main(String[] args) {
		FindLetter find = new FindLetter();

		Scanner input1 = new Scanner(System.in);
		System.out.println("Please input a string: ");
		String str = input1.nextLine();
		System.out.println("Please input a char: ");
		char c = input1.next().charAt(0);
		int m = find.getletter(str, c);
		if (m == 0) {
			System.out.println(str + " has no " + c);
		} else {
			System.out.println(str + " has " + m + c);
		}
	}
}
