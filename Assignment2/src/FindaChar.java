
//- Modify the above method to take a String and character as input and find how many characters are in the String
//Example #1
//Input : "North", 'r'
//Output : "North" has 1 'r'

import java.util.Scanner;

public class FindaChar {

	public int findA(String str) {
		int counter = 0;

		for (int it = 0; it < str.length(); it++) {
			if (str.charAt(it) == 'a') {
				counter++;
			}
		}

		if (counter == 0) {
			System.out.println(str + " has no a");
		} else {
			System.out.println(str + " has " + counter + " a");
		}

		return counter;
	}

	public static void main(String[] args) {
		FindaChar a = new FindaChar();
		System.out.println("Please input a string and a charcter :");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		a.findA(str);
	}
}
