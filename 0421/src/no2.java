import java.util.Random;

public class no2 {
	public static void main(String[] args) {
		Random rand = new Random();
		int Dice = rand.nextInt(6) + 1;
		switch (Dice) {
		case 1:
			System.out.println("멍멍");
			break;
		case 2:
			System.out.println("야옹");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;
		case 6:
			System.out.println("6");
			break;
		}
	}
}
