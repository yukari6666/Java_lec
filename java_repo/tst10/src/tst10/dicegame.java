package tst10;

import java.util.Random;
import java.util.Scanner;

public class dicegame {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner inputFomUser = new Scanner(System.in);
		String inputAccept;
		String inputAccept2;
		int i = 0;
		int comChoice = r.nextInt(6) + 1;
		int userChoice = r.nextInt(6) + 1;
		for (i = 1; i <= 4000000; i++) {
			System.out.println("화면에 주사위를 굴릴까요?");
			String inputAccept = inputFromUser.nextLine();
			System.out.println(userChoice);
			System.out.println("컴퓨터가 주사위를 굴립니다. 실행할까요?");
			String inputAccept2 = inputFromUser.nextLine();
			System.out.println(comChoice);
		}
		if(userChoice == comChoice) {
			System.out.println("무승부");
		}else if(userChoice > comChoice) {
			System.out.println("승리");
		}else if(comChoice > userChoice) {
			System.out.println("패배");
		}
	}

}
