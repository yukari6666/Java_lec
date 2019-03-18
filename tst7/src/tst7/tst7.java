package tst7;
import java.util.Scanner;
public class tst7 {
public static void main(String[] args) {
	int p1_score;
	int p2_score;
	int p3_score;
	int sum;
	int avarage;
	Scanner scan = new Scanner(System.in);
	
	System.out.println("국어 점수를 입력해주세요 (총 3명)");
	System.out.print("홍길동의 국어 점수 : ");
	p1_score = scan.nextInt();
	System.out.print("임꺽정의 국어 점수 : ");
	p2_score = scan.nextInt();
	System.out.print("윤봉길의 국어 점수 : ");
	p3_score = scan.nextInt();
	
	System.out.println("입력 받은 점수 홍길동 " + p1_score + "점 " + "임꺽정 " + p2_score + "점 " + "윤봉길 " + p3_score + "점");
	
	sum = p1_score + p2_score + p3_score;
	
	System.out.println("총 점수는 " + sum + "점 입니다.");
	
	avarage = sum / 3;
	
	System.out.println("평균은 "+ avarage + "입니다.");
	}
	
}

