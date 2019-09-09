import java.util.Scanner;
public class MethodPractice {
public double weight;
public double hight;
public double kaupValue;
public void UserData() {
	Scanner scanner1 = new Scanner(System.in);
	Scanner scanner2 = new Scanner(System.in);
	
	System.out.print("체중을 입력해주세요: ");
	this.weight = scanner1.nextDouble();
	
	System.out.println("신장을 입력해주세요: ");
	this.hight = scanner2.nextDouble();
}
public void kaup() {
	
	this.hight = (this.hight/100 * this.hight/100);
	
	kaupValue =(this.weight/this.hight);
	
	if(kaupValue  >= 30) {
		
		System.out.println("당신의 카우프 지수는 "+ kaupValue+ "입니다. 비만이네. 살 좀 빼세요!");
		
	}else if(kaupValue >= 24 && kaupValue <= 29) {
		
		System.out.println("당신의 카우프 지수는 "+ kaupValue+ "입니다. 과체중이네. 살 좀 빼세요!");
		
	}else if(kaupValue >= 20 && kaupValue <=24) {
		
		System.out.println("당신의 카우프 지수는 "+ kaupValue + "입니다. 정상이네요.");
		
	}else if(kaupValue < 20) {
		
		System.out.println("당신의 카우프 지수는 "+ kaupValue+ "입니다. 저체중이네요. 살 좀 찌우셔야겠어요.");
		
	}else if(kaupValue >= 13 && kaupValue<= 15) {
		
		System.out.println("당신의 카우프 지수는"+kaupValue+ " 입니다. 당신, 여위었군요?" );
		
	}else if(kaupValue >= 10 || kaupValue <= 13) {
		
		System.out.println("당신의 카우프 지수는"+kaupValue+ " 입니다. 영양실조네요? 뭣 좀 먹고 다녀요!!");
		
	}else if(kaupValue < 10) {
		
		System.out.println("당신의 카우프 지수는"+kaupValue+ " 입니다. 소모증 축하 ㅋㅋ");
		
	}else {
		
		System.out.println("오류입니다.");
		
	}
}
}
