import java.util.Random;

public class random extends techfin {
	public static void main(String[] args) {
		Random r = new Random();
		int randomValue = r.nextInt(100);
		System.out.println(randomValue);

//		if (randomValue % 2 == 0) {
//			System.out.println("¦���Դϴ�");
//		} else {
//			System.out.println("Ȧ���Դϴ�");
//		}
		if (randomValue % 2 == 0) {
			System.out.println("¦���Դϴ�");
		}
		if (randomValue % 2 == 1) {
			System.out.println("Ȧ���Դϴ�");
		}

	}
}
