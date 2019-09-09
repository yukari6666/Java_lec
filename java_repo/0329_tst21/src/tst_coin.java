
public class tst_coin {
	private int coin;

	public void deposit(int coin, String message) {
		this.coin = this.coin + coin;
		if (message.equals("")) {
			System.out.println("땡그랑");
		} else {
			System.out.println(message);
		}
	}

	public void crash() {
		System.out.println("모든 금액이 출금되었습니다.");
		this.coin = 0;
	}
}
