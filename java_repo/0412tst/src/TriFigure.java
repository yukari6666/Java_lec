import java.util.Scanner;

public class TriFigure extends Figure {
	TriFigure() {
		this.name = "삼각형 넓이 구하기";
	}

	public String tmp;
	public double triHight;
	public double triBaseside;
	public double triAreaValue;
	Scanner scan = new Scanner(System.in);
	
	@Override
	public void inputValue() {
		System.out.println("삼각형의 높이를 입력해주세요.(cm)");
		tmp = scan.nextLine();
		try {
			this.triHight = Double.parseDouble(tmp);
		} catch (Exception e) {
			System.out.println("숫자값을 입력해주세요.");
			this.triHight = 0;
		}
		System.out.println("삼각형의 밑변을 입력해주세요.(cm)");
		tmp = scan.nextLine();
		try {
			this.triBaseside = Double.parseDouble(tmp);
		} catch (Exception e) {
			System.out.println("숫자값을 입력해주세요.");
			this.triBaseside = 0;
		}
		this.triAreaValue = (this.triBaseside * this.triHight) / 2;
	}

	public void printResult() {
		super.printResult();
		System.out.println("삼각형의 넓이는 " + this.triAreaValue + "cm 입니다.");
	}
}
