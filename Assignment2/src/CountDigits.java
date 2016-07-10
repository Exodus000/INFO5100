// - Write a method to find how many digits does a number
// 	Example # 1 
// 		Input : 5432
// 		Output : 5432 has 4 digits
// 	Example # 2
// 		Input : 32
// 		Output : 32 has 2 digits


import java.util.Scanner;

public class CountDigits {

	public int countdigits(int n) {
		int i;
		if (n == 0) {
			i = 1 ;
			return i;
		}
		
		for (i = 1; n >= 10; i++) {
			n = (n - n % 10) / 10;
		}
		
		return i;

	}

	public static void main(String[] args) {
		CountDigits c = new CountDigits();
		System.out.println("Please input an integer:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(n+" has "+ c.countdigits(n)+" digits");

	}
}
