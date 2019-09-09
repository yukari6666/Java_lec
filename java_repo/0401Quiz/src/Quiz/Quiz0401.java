package Quiz;
import java.util.Scanner;
import java.util.Arrays;
public class Quiz0401 {
	
	public String name;
	
	private int korScore;
	private int engScore;
	private int mathScore;
	
	public int sumKor;
	public int sumEng;
	public int sumMath;
	
	public int avKor;
	public int avEng;
	public int avMath;
	
	public int FinalScore;
	
public void Score() {
	
	this.korScore = korScore;
	this.engScore = engScore;
	this.mathScore = mathScore;
	
	Scanner scanner = new Scanner(System.in);
	
	int sArrkor[] =new int[5];
	int sArreng [] = new int [5];
	int sArrmath [] = new int [5];
	for(int i = 0; i <5; i++) {
		System.out.println((i+1)+"명의 이름을 입력하세요");
		String name = scanner.nextLine();
		
		System.out.println("국어점수 : ");
		String korString = scanner.nextLine();
		korScore = Integer.parseInt(korString);
		sArrkor[i] = korScore;
		
		System.out.println("영어점수 : ");
		String engString = scanner.nextLine();
		engScore = Integer.parseInt(engString);
		sArreng[i] = engScore;
		
		System.out.println("수학 점수 : ");
		String mathSring = scanner.nextLine();
		mathScore = Integer.parseInt(mathSring);
		sArrmath[i] = mathScore;
		
		this.sumKor = this.sumKor+sArrkor[i];
		this.sumEng = this.sumEng+sArreng[i];
		this.sumMath = this.sumMath+sArrmath[i];
		FinalScore = this.sumKor+this.sumEng+this.sumMath;
		
		avKor = this.sumKor/5;
		avEng = this.sumEng/5;
		avMath = this.sumMath/5;
		
	}
	System.out.println("국어 총점은 "+this.sumKor+"점 입니다.");
	System.out.println("영어 총점은 "+this.sumEng+"점 입니다.");
	System.out.println("수학 총점은 "+this.sumMath+"점 입니다.");
	
	System.out.println("");//가독성을 위한 공백
	
	System.out.println("국어 평균은" +(double)avKor+"점 입니다.");
	System.out.println("영어 평균은" +(double)avEng+"점 입니다.");
	System.out.println("수학 평균은" +(double)avMath+"점 입니다.");
	
	System.out.println("");//가독성을 위한 공백
	
	System.out.println("최종 총점은 "+FinalScore+"점 입니다.");
	System.out.println("최총 평균은" +((double)FinalScore/5)+"점 입니다.");
}
}

