import java.util.Random;

public class test2 extends Dita {
	public static void main(String[] args) {
		Random r = new Random();
		int rcs = r.nextInt(2);
		System.out.println(rcs);

		if (rcs == 0) {
			System.out.println("����");
		} else if (rcs == 1) {
			System.out.println("����");
		} else if (rcs == 2) {
			System.out.println("��");
		}
	}
}