import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//- Write a Java program to generate Fibonacci number : https://en.wikipedia.org/wiki/Fibonacci_number
//	- For eg: - Input : 145 (Maximum number upto which you need to generate the Fibonacci numbers)
//	- Output : 1,1,2,3,5,8,13,21,44,55,89,144   		
//	
public class Fibonacci {
	public ArrayList<Integer> fi(int n) {
<<<<<<< Updated upstream
		// try List<Integer> ret = new ArrayList<>();
		ArrayList<Integer> ret = new ArrayList<Integer>();
=======
		List<Integer> ret = new ArrayList<>();
>>>>>>> Stashed changes
		if (n < 1) {
			ret.add(1);
		} else {
			ret.add(1);
			ret.add(1);
			while (true) {
				int len = ret.size();
				int temp = ret.get(len - 2) + ret.get(len - 1);
				if (temp <= n) {
					ret.add(temp);
				} else {
					break;
				}
			}
		}
		return (ArrayList<Integer>) ret;
	}

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
<<<<<<< Updated upstream
		int n = 145;
		// the same issue, your program should support input.
=======
		int n = 0;
		while (n <= 0) {
			System.out.println("Please input a integer");
			Scanner scan = new Scanner(System.in);
			n = scan.nextInt();
		}
>>>>>>> Stashed changes
		ArrayList<Integer> s = f.fi(n);
		for (int i = 0; i < s.size(); i++) {
			if (i == s.size() - 1) {
				System.out.print(s.get(i));
			} else {
				System.out.print(s.get(i) + ",");
			}
		}
	}
}
