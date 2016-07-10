import java.util.Random;
import java.util.Scanner;

public class PlayGame {
	private int chances;
	private int num;
	private Scanner s;

	public PlayGame(int chances) {
		this.chances = chances;
		Random randomGenerator = new Random();
		num = randomGenerator.nextInt(100) + 1;
	}

	private int nextNum() {
		s = new Scanner(System.in);
		return s.nextInt();
	}

	public void play() {
		System.out.println("Please guess a number between 1 and 100 - You have " + chances + " chances to guess");
		for (int it = 0; it < chances; it++) {
			int cur = nextNum();

			if (cur == num) {
				System.out.println("Congratulations! You've guessed it right and you guessed it in "
						+ (chances - it - 1) + " chances..");
				return;
			} else {
				System.out.println(cur + " is " + (cur < num ? "less" : "greater")
						+ " than what I've guessed - You have " + (chances - it - 1) + " chances to guess");
			}
		}
		System.out.println("sorry, you failed, the number I've guessed is " + num + ".");
	}

	public static void main(String[] args) {
		PlayGame game = new PlayGame(5);
		game.play();

	}

}
