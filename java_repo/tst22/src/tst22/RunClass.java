package tst22;

import java.util.Scanner;

public class RunClass {
	public static void main(String[] args) {
		tst22[] sArray = new tst22[10];
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < sArray.length; i++) {
			
			sArray[i] = new tst22();
			
			System.out.println("" + (i + 1) + "번째 학생 데이터 입력");
			
			System.out.println("이름 : ");
			sArray[i].name = scan.nextLine();
			
			System.out.println("국어점수 : ");
			String korString = scan.nextLine();
			sArray[i].korScore = Integer.parseInt(korString);
			
			System.out.println("영어점수 : ");
			String engString = scan.nextLine();
			sArray[i].engScore = Integer.parseInt(engString);
			
			System.out.println("수학점수 : ");
			String mathString = scan.nextLine();
			sArray[i].mathScore = Integer.parseInt(mathString);
			
//	int a;
//	tst22 s1 = new tst22();
//	sArray[0] = new tst22();
//	
//	s1.korScore = 10;
//	sArray[ 0 ].korScore = 10;
		}
	}
}
