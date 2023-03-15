package intro;

public class three 
{
	public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 50);
        if (randomNum < 25) {
            System.out.println("num is < 25");
        } else if (randomNum >= 25) {
            System.out.println("num is >= 25");
        }
        if (!(false)) {
            System.out.println("false is true now");
        }
        System.out.println("num is " + randomNum);
        
        int value1 = 1;
        int value2 = 2;
        int biggestValue = (value1 > value2) ? value1 : value2;
        System.out.println(biggestValue);
    }
}
