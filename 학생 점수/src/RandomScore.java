
public class RandomScore {
	int korScore;
	int engScore;
	int mathScore;
	int Sum;
	int Total;
	int StudentAverage;
	int TotalAverage;

	public void ScoreFunction() {
		java.util.Random rand = new java.util.Random();
		for (int i = 0; i < 5; i++) {
			korScore = rand.nextInt(100);
			engScore = rand.nextInt(100);
			mathScore = rand.nextInt(100);
			Sum = 0;
			StudentAverage = 0;
			System.out.println((i + 1) + "번째 학생의 점수는");
			System.out.println("국어: " + korScore + "점");
			System.out.println("영어: " + engScore + "점");
			System.out.println("수학: " + mathScore + "점");
			Sum = korScore + engScore + mathScore;
			System.out.println((i + 1) + "번째 학생의 총점은" + Sum + " 점입니다.");
			StudentAverage = Sum / 3;
			System.out.println((i + 1) + " 번째 학생의 평균 점수는" + StudentAverage + " 점입니다.");
			Total = Total + korScore + engScore + mathScore;
			if (korScore < 30) {
				System.out.println((i + 1) + "번째 학생의 국어 과목은 낙제입니다.");
			}
			if (engScore < 30) {
				System.out.println((i + 1) + "번째 학생의 영어 과목은 낙제입니다.");
			}
			if (mathScore < 30) {
				System.out.println((i + 1) + "번째 학생의 수학 과목은 낙제입니다.");
			}
		}
		System.out.println("학생들의 총점은 " + Total + " 점입니다.");
		TotalAverage = Total / 5;
		System.out.println("학생들의 총 평균 점수는 " + TotalAverage + " 점입니다.");
	}
}
