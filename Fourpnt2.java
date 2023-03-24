package intro;
import java.util.Scanner;

public class Fourpnt2 {
	static Scanner userInput = new Scanner(System.in); //create scanner object
	public static void main(String[] args)
	{
		String contYorN = "Y";
		int h = 1;
		while (contYorN.equalsIgnoreCase("y"))
		{
			System.out.println(h);
			System.out.print("continue y or n? ");
			contYorN = userInput.nextLine();
			h++;
		}
	}
}
