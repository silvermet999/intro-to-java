package intro;
import java.util.Scanner;

public class Fivepnt1 {
	static int randomNum;
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(getRandomNum());
		int guessResult = 1;
		int randomGuess = 0;
		while(guessResult != -1) {
			System.out.print("guess btw 0 and 50: ");
			randomGuess = userInput.nextInt();
			guessResult = checkGuess(randomGuess);
		}
		System.out.print("random num is " + randomGuess);
	}
	public static int getRandomNum() { 
		randomNum = (int)(Math.random()*51);
		return randomNum;
	}
	public static int checkGuess(int guess) {
		if(guess == randomNum) {
			return -1;
		} else {
			return guess;
		}
	}

}
