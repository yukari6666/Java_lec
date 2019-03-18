import java.util.Scanner;

public class TechTech {
	public static void main(String[] args) {
		System.out.println("숫자를 입력해 주세요");
		Scanner s = new Scanner(System.in);
		int inputnumber = s.nextInt();
		System.out.println(inputnumber);

		Scanner f = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int number2 = f.nextInt();
		System.out.println(number2);

		System.out.println("계산한 값은");
		System.out.println(inputnumber + number2);

		Scanner g = new Scanner(System.in);
		int number3 = g.nextInt();
		System.out.println("추가 연산 값은");
		System.out.println((inputnumber + number2) + number3);
		
		
		
	}
}
