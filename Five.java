package intro;


public class Five {
	static double myPI = 3.14159; //class var
	public static void main(String[] args) {
		addThem(1,2);
		System.out.println("global " + myPI);
	}
	public static int addThem(int a, int b) { 
		double myPI = 3.140; //local var
		// myPI = myPI + 3.0; changes values in local and global
		System.out.println("local " + myPI);
		return 1;
	}

}
