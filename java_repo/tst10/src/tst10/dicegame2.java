package tst10;
import java.util.Random;
import java.util.Scanner;
public class dicegame2 {
public static void main(String[] args) {
	int j;
     for (j = 1; j <= 4000000; j++) {
    	 Random r = new Random();
         Scanner scan = new Scanner(System.in);
         int i = 0;
         int userChoice = r.nextInt(6) + 1;
         int comChoice = r.nextInt(6) + 1;
        System.out.println("컴퓨터의 주사위는 " + comChoice + "입니다.");
        String dice = scan.nextLine();
        System.out.println("Enter를 눌러주세요");
        if(userChoice == comChoice) {
			System.out.println("무승부");
		}else if(userChoice > comChoice) {
			System.out.println("승리");
		}else if(comChoice > userChoice) {
			System.out.println("패배");
		}
		}
	}
}
