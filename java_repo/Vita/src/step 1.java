import java.util.Scanner;

public class Grade1 {
	public static void main(String[] args) {
		int p1_score; // È«±æµ¿
		int p2_score; // ÀÓ²©Á¤
		int p3_score; // À±ºÀ±æ
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("±¹¾î Á¡¼ö¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä (ÃÑ 3¸í)");
		System.out.print("È«±æµ¿ÀÇ ±¹¾î Á¡¼ö : ");
		p1_score = scan.nextInt();
		System.out.print("ÀÓ²©Á¤ÀÇ ±¹¾î Á¡¼ö : ");
		p2_score = scan.nextInt();
		System.out.print("À±ºÀ±æÀÇ ±¹¾î Á¡¼ö : ");
		p3_score = scan.nextInt();
		
		System.out.println("ÀÔ·Â ¹ÞÀº Á¡¼ö È«±æµ¿ " + p1_score + "Á¡ " + "ÀÓ²©Á¤ " + p2_score + "Á¡ " + "À±ºÀ±æ " + p3_score + "Á¡");
		
		if (p1_score > p2_score && p1_score > p3_score && p2_score > p3_score) {
			// 1, 2, 3
			System.out.println("1µî : È«±æµ¿ (" + p1_score + "Á¡)");
			System.out.println("2µî : ÀÓ²©Á¤ (" + p2_score + "Á¡)");
			System.out.println("3µî : À±ºÀ±æ (" + p3_score + "Á¡)");
		} else if (p1_score > p2_score && p1_score > p3_score && p2_score < p3_score) {
			// 1, 3, 2
			System.out.println("1µî : È«±æµ¿ (" + p1_score + "Á¡)");
			System.out.println("2µî : À±ºÀ±æ (" + p3_score + "Á¡)");
			System.out.println("3µî : ÀÓ²©Á¤ (" + p2_score + "Á¡)");
		} else if (p2_score > p1_score && p2_score > p3_score && p1_score > p3_score) {
			// 2, 1, 3
			System.out.println("1µî : ÀÓ²©Á¤ (" + p2_score + "Á¡)");
			System.out.println("2µî : È«±æµ¿ (" + p1_score + "Á¡)");
			System.out.println("3µî : À±ºÀ±æ (" + p3_score + "Á¡)");
		} else if (p2_score > p1_score && p2_score > p3_score && p1_score < p3_score) {
			// 2, 3, 1
			System.out.println("1µî : ÀÓ²©Á¤ (" + p2_score + "Á¡)");
			System.out.println("2µî : À±ºÀ±æ (" + p3_score + "Á¡)");
			System.out.println("3µî : È«±æµ¿ (" + p1_score + "Á¡)");
		} else if (p3_score > p1_score && p3_score > p2_score && p1_score > p2_score) {
			// 3, 1, 2
			System.out.println("1µî : À±ºÀ±æ (" + p3_score + "Á¡)");
			System.out.println("2µî : È«±æµ¿ (" + p1_score + "Á¡)");
			System.out.println("3µî : ÀÓ²©Á¤ (" + p2_score + "Á¡)");
		} else if (p3_score > p1_score && p3_score > p2_score && p1_score < p2_score) {
			// 3, 2, 1
			System.out.println("1µî : À±ºÀ±æ (" + p3_score + "Á¡)");
			System.out.println("2µî : ÀÓ²©Á¤ (" + p2_score + "Á¡)");
			System.out.println("3µî : È«±æµ¿ (" + p1_score + "Á¡)");
		}
			
	}
}
