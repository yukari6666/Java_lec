import java.util.Scanner;

public class Dita {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("ù ��° ���� �Է����ּ���");
		int ����1 = scan1.nextInt();
		
		System.out.println("�� ��° ���� �Է����ּ���");
		int ����2 = scan1.nextInt();
		
		int sumNumber = ����1 + ����2;
		System.out.printf("%d�� %d�� ���� %d�Դϴ�", ����1, ����2, sumNumber);
	}
}
