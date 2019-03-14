import java.util.Scanner;

public class Dita {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("첫 번째 값을 입력해주세요");
		int 숫자1 = scan1.nextInt();
		
		System.out.println("두 번째 값을 입력해주세요");
		int 숫자2 = scan1.nextInt();
		
		int sumNumber = 숫자1 + 숫자2;
		System.out.printf("%d와 %d의 값은 %d입니다", 숫자1, 숫자2, sumNumber);
	}
}
