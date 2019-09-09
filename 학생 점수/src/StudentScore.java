
public class StudentScore {
	int korScore;
	int engScore;
	int mathScore;
	int Total;
	int Average;
	public void ScoreFuntion2() {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		for(int i=1; i <6; i++) {
		System.out.println(i+"번째 학생의 점수를 입력해주새요.");
		System.out.println("국어 :");
		korScore = scan.nextInt();
		System.out.println(korScore);
		System.out.println("영어 :");
		engScore = scan.nextInt();
		System.out.println(engScore);
		System.out.println("수학 :");
		mathScore = scan.nextInt();
		System.out.println(mathScore);
		Total = Total+korScore+engScore+mathScore;
		}
		System.out.println("학생들의 총점은"+Total+" 입니다.");
		Average = Total/5;
		System.out.println("학생들의 총 평균은"+Average+" 입니다.");
	}
}
