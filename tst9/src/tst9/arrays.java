package tst9;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//배열 길이 받는 스캐너 선언
		Scanner scanner2 = new Scanner(System.in);//배열 값 받는 스캐너 선언
		
		System.out.println("만들 배열의 길이를 선택해주세요. 추천: 3");
		int inputuser = scanner.nextInt();//배열 길이 받는 부분
		int[][] arr = new int[inputuser + 1][inputuser + 1];//배열 값 총합을 받는 부분을 만들기 위해 +1
		
		int j = 0;
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < arr.length - 1; j++) {
				int inputuser2 = scanner2.nextInt(); //값을 받는 부분.
				arr[i][j] = inputuser2;//이중배열에 값을 넣는 부분.
			}
		}
		
		int c = 0;
		int d = 0;
		for (c = 0; c < arr.length-1; c++) {//합을 마지막 열에 넣을 때 더해서 넣지 말고 for문이 돌 때 값이 총합열에 쌓이게 하자.
		    System.out.println(String.valueOf(c) + "단계진입");
			for (d = 0; d <arr.length-1; d++) {
				int arrayValue = arr[c][d];
				arr[3][c] = arr[3][c] + arrayValue;
				int sum1 = 0;
				if (arr.length == arr[3][d]) {
					sum1 = sum1 + arr[3][d];
					arr[3][3] = sum1;
				}
			}
		}for(int e = 0; e < arr.length; e++) {
			System.out.println(Arrays.toString(arr[e]));
		}
	}
}
