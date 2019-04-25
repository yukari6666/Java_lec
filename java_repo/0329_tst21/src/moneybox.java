
public class moneybox {
	public int totalCoin = 0;
	public  String name;
	public void setName(String inputName) {
		inputName = name;
	}
	
	public void deposit(int inputCoin) {
		int crash = 0;
		for(int i = 0; i<99999; i++ ) {
			if(totalCoin >= 0) {
			totalCoin = totalCoin + inputCoin;
			System.out.println("땡그랑");
			System.out.println(totalCoin + "이 입금되었습니다.");
			}
		}
	}
	public void deposit2(int inputCOin) {
		totalCoin = totalCoin + inputCOin;
	}
	
//	public void crash() {
//		System.out.println("출금액 : "+ totalCoin);
//		totalCoin = 0;
		
	}

