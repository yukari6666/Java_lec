package tst18;

public class test_tst18 {
public static void main(String[] args) {
	tst18 s1 = new tst18();
	System.out.println("6의 배수는");
	for (int i = 0; i < 100; i++) {
		int checkNumber = i + 1;
		boolean result = s1.six(checkNumber);
		if (result) {
			System.out.println("  "+ (checkNumber));
		}
	}
}
}
