import java.util.Random;

public class tst4 extends Dita {
	public static void main(String[] args) {
		Random rdnumber = new Random();

		int r1 = rdnumber.nextInt(6) + 1;

		switch (r1) {
		case 1:
			System.out.println("港港");
			break;
		case 2:
			System.out.println("具克");
			break;
		case 3:
			System.out.println(3);
			break;
		case 4:
			System.out.println(4);
			break;
		case 5:
			System.out.println(5);
			break;
		default:
			System.out.println(6);
		}
	}
}
