package test_0408;

import java.util.Scanner;

public class Test {
	int number1 = 0;
	int number2 = 0;

	public void inputNumbers() {
		System.out.println("두개의 숫자를 입력해주세요.");
		System.out.println("첫 번째 숫자 입력");
		Scanner scan = new Scanner(System.in);
		this.number1 = scan.nextInt();

		System.out.println("두 번째 숫자 입력");
		this.number2 = scan.nextInt();
	}

	public void printResult() {
		System.out.println("입력된 숫자는 " + this.number1 + ", " + this.number2 + " 입니다.");
	}
}
