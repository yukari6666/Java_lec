import java.util.Scanner;

public class Grade1 {
	public static void main(String[] args) {
		int p1_score; // ȫ�浿
		int p2_score; // �Ӳ���
		int p3_score; // ������
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� ������ �Է����ּ��� (�� 3��)");
		System.out.print("ȫ�浿�� ���� ���� : ");
		p1_score = scan.nextInt();
		System.out.print("�Ӳ����� ���� ���� : ");
		p2_score = scan.nextInt();
		System.out.print("�������� ���� ���� : ");
		p3_score = scan.nextInt();
		
		System.out.println("�Է� ���� ���� ȫ�浿 " + p1_score + "�� " + "�Ӳ��� " + p2_score + "�� " + "������ " + p3_score + "��");
		
		if (p1_score > p2_score && p1_score > p3_score && p2_score > p3_score) {
			// 1, 2, 3
			System.out.println("1�� : ȫ�浿 (" + p1_score + "��)");
			System.out.println("2�� : �Ӳ��� (" + p2_score + "��)");
			System.out.println("3�� : ������ (" + p3_score + "��)");
		} else if (p1_score > p2_score && p1_score > p3_score && p2_score < p3_score) {
			// 1, 3, 2
			System.out.println("1�� : ȫ�浿 (" + p1_score + "��)");
			System.out.println("2�� : ������ (" + p3_score + "��)");
			System.out.println("3�� : �Ӳ��� (" + p2_score + "��)");
		} else if (p2_score > p1_score && p2_score > p3_score && p1_score > p3_score) {
			// 2, 1, 3
			System.out.println("1�� : �Ӳ��� (" + p2_score + "��)");
			System.out.println("2�� : ȫ�浿 (" + p1_score + "��)");
			System.out.println("3�� : ������ (" + p3_score + "��)");
		} else if (p2_score > p1_score && p2_score > p3_score && p1_score < p3_score) {
			// 2, 3, 1
			System.out.println("1�� : �Ӳ��� (" + p2_score + "��)");
			System.out.println("2�� : ������ (" + p3_score + "��)");
			System.out.println("3�� : ȫ�浿 (" + p1_score + "��)");
		} else if (p3_score > p1_score && p3_score > p2_score && p1_score > p2_score) {
			// 3, 1, 2
			System.out.println("1�� : ������ (" + p3_score + "��)");
			System.out.println("2�� : ȫ�浿 (" + p1_score + "��)");
			System.out.println("3�� : �Ӳ��� (" + p2_score + "��)");
		} else if (p3_score > p1_score && p3_score > p2_score && p1_score < p2_score) {
			// 3, 2, 1
			System.out.println("1�� : ������ (" + p3_score + "��)");
			System.out.println("2�� : �Ӳ��� (" + p2_score + "��)");
			System.out.println("3�� : ȫ�浿 (" + p1_score + "��)");
		}
			
	}
}
