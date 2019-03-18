import java.util.Random;
import java.util.Scanner;

public class text3 extends Dita {
	public static void main(String[] args) {
		Random r = new Random();
		int rcs = r.nextInt(2);
		int rcs2;
		System.out.println("가위바위보를 입력해주세요.|n 가위는 0, 바위는 1, 보는 2 입니다 : ");
		Scanner scan = new Scanner(System.in);
		rcs2 = scan.nextInt();

		if (rcs == rcs2) {
			System.out.println("비겼습니다");
		} else if (rcs == 0 && rcs2 == 1) {
			System.out.println("사용자가 이겼습니다");
		} else if (rcs == 0 && rcs2 == 2) {
			System.out.println("컴퓨터가 이겼습니다");
		} else if (rcs == 1 && rcs2 == 2) {
			System.out.println("사용자가 이겼습니다");
		} else if (rcs == 1 && rcs2 == 0) {
			System.out.println("컴퓨터가 이겼습니다");
		} else if (rcs == 2 && rcs2 == 0) {
			System.out.println("사용자가 이겼습니다");
		} else if(rcs == 2 && rcs2 == 1) {
			System.out.println("컴퓨터가 이겼습니다");
		}
	}
}
