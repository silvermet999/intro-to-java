package intro;
import java.io.*;

public class Sixpnt2 {
	public static void main(String[] args) throws ClassNotFoundException {
		getAFile("./stuff.txt");
	}
	public static void getAFile(String fileName) throws ClassNotFoundException { //throw it back at main
		try {
			FileInputStream file = new FileInputStream(fileName); // get file
		}
		catch(FileNotFoundException e) {
			System.out.println("file doesnt exist");
		}
		catch(IOException e) { //general error
			System.out.println("IO error");
		}
		catch(Exception e) { //general error
			System.out.println("error");
		}
		finally { // basic cleanup (close files..)
			System.out.println("");
		}
		// most specific error first then general
	}
}
