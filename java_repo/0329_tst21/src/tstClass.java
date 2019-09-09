import java.util.Scanner;

public class tstClass {
	public static void main(String[] args) {
		tst_coin box1 = new tst_coin();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 9999; i++) {
			System.out.println("메뉴선택 1.입금 2.입금+메세지, 3.종료");
			int selectMenu = scanner.nextInt();
			if (selectMenu == 1) {
				System.out.println("입금할 금액: ");
				int coin = scanner.nextInt();
			} else if (selectMenu == 2) {
				System.out.println("입금할 금액: ");
				int coin = scanner.nextInt();
				String message = scanner.nextLine();
			} else if (selectMenu == 3) {
				box1.crash();
				break;
			}
		}
	}

}
