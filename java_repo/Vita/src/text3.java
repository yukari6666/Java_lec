import java.util.Random;
import java.util.Scanner;

public class text3 extends Dita {
	public static void main(String[] args) {
		Random r = new Random();
		int rcs = r.nextInt(2);
		int rcs2;
		System.out.println("������������ �Է����ּ���.|n ������ 0, ������ 1, ���� 2 �Դϴ� : ");
		Scanner scan = new Scanner(System.in);
		rcs2 = scan.nextInt();

		if (rcs == rcs2) {
			System.out.println("�����ϴ�");
		} else if (rcs == 0 && rcs2 == 1) {
			System.out.println("����ڰ� �̰���ϴ�");
		} else if (rcs == 0 && rcs2 == 2) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�");
		} else if (rcs == 1 && rcs2 == 2) {
			System.out.println("����ڰ� �̰���ϴ�");
		} else if (rcs == 1 && rcs2 == 0) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�");
		} else if (rcs == 2 && rcs2 == 0) {
			System.out.println("����ڰ� �̰���ϴ�");
		} else if(rcs == 2 && rcs2 == 1) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�");
		}
	}
}
