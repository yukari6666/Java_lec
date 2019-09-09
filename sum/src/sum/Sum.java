package sum;
import java.util.Scanner;

public class Sum {
 public int a;
 public int b;
 public int sum = 0;
 public void sumMachine() {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("숫자를 입력해주세요.");
	 this.a = scan.nextInt();
	 System.out.println("첫 번째 숫자는 "+a+"입니다.");
	 this.b = scan.nextInt();
	 System.out.println("두 번째 숫자는 "+b+"입니다.");
	 this.sum = this.a+this.b;
	 System.out.println("두 숫자의 합은 "+this.sum+"입니다.");
 }
}
