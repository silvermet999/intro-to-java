package intro;
import java.util.Scanner;

public class lTwo {
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("your fav num: ");
		if (userInput.hasNextInt())
		{
			int numberEntered = userInput.nextInt();
			System.out.println("you entered " + numberEntered);
			int numEntered2 = numberEntered + numberEntered;
			System.out.println(numberEntered + " + " + numberEntered + " = " + numEntered2);
		} else {
			System.out.println("Enter an integer");
		}
	}
}