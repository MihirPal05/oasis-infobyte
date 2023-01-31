import java.util.Random;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		generateNumber();
	}

	public static void generateNumber() {
		Random num = new Random();

		int random = num.nextInt(100) + 1;
		guessNumber(random);
	}

	public static void guessNumber(int random) {
		Scanner sc = new Scanner(System.in);

		System.out.println("");
		System.out.println("NUMBER GUESSING GAME");
		System.out.println("---------------------");
		System.out.println("Guess any number between 1-100:");
		System.out.println("");

		while (true) {
			int guessNum = sc.nextInt();

			if (guessNum == random) {

				System.out.println("Great...!\n You Won");
				break;
			} else if (guessNum > random) {
				System.out.println("OOPS...!\nThe Number is Higher");
				System.out.println("Guess Again! ");
			} else {
				System.out.println("OOPS...!\nThe Number is Lower");
				System.out.println("Guess Again! ");
			}
		}

	}

}