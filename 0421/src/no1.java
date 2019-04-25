import java.util.Random;
import java.util.Scanner;

public class no1 {
	public static void main(String[] args) {
		Random rand = new Random();
		String fomat;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 1000; i++) {
			int Dice = rand.nextInt(6) + 1;
			System.out.println("주사위를 굴리시겠습니까?");
			fomat = scan.nextLine();
			if (Dice == 1) {
				System.out.println("멍멍");
			} else if (Dice == 2) {
				System.out.println("야옹");
			} else if (Dice == 3) {
				System.out.println("3");
			} else if (Dice == 4) {
				System.out.println("4");
			} else if (Dice == 5) {
				System.out.println("5");
			} else if (Dice == 6) {
				System.out.println("6");
			}
		}
	}
}
