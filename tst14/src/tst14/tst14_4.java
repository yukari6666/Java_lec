package tst14;

import java.util.Random;
import java.util.Arrays;

public class tst14_4 {
	public static void main(String[] args) {
		Random r = new Random();
		int i = 0;
		int[] arr = new int[30];
		for (i = 0; i < 30; i++) {
			int rand = r.nextInt(100);
			arr[i] = rand;
		}
		System.out.println("랜덤하게 발생한 숫자는");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("정렬합니다.");
		System.out.println(Arrays.toString(arr));
	}
}
