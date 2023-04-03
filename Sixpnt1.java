package intro;
import java.util.*;

public class Sixpnt1 {
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Age?");
		int age = checkValidAge();
		if (age != 0) {
			System.out.println("your age is " + age);
		}
	}
	public static int checkValidAge() {
		try {
			return userInput.nextInt(); 
		}
		catch (InputMismatchException e) {
			userInput.next(); //skip to next
			System.out.println("not valid");
			return 0; //should be specified because of the int in public static
		}
	}
}
