package intro;

public class Six {
	public static void main(String[] args) {
		div(2);
	}
	public static void div(int a) {
		try {
			System.out.println(a/0);
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
}
