import java.util.Scanner;

public class TechTech {
	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��� �ּ���");
		Scanner s = new Scanner(System.in);
		int inputnumber = s.nextInt();
		System.out.println(inputnumber);

		Scanner f = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���");
		int number2 = f.nextInt();
		System.out.println(number2);

		System.out.println("����� ����");
		System.out.println(inputnumber + number2);

		Scanner g = new Scanner(System.in);
		int number3 = g.nextInt();
		System.out.println("�߰� ���� ����");
		System.out.println((inputnumber + number2) + number3);
		
		
		
	}
}
