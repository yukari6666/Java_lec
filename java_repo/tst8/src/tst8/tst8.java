package tst8;

public class tst8 {
	public static void main(String[] args) {
		int i = 0;
		int evensum = 0;
		int total = 0;
		int oddsum = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evensum = evensum + i;
			}else {
				oddsum = oddsum + i;
			}
		}
		total = evensum + oddsum;
		System.out.println("총합은: "+total);
		System.out.println("짝수의 총합은: "+evensum);
		System.out.println("홀수의 총합은: "+oddsum);
	}
}