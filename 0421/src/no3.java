
public class no3 {
public static void main(String[] args) {
	int sum1 = 0;
	int sum2 = 0;
	for(int i = 1; i < 101; i++) {
		if(i % 2 == 0) {
			sum1 = sum1+i;
		}
	}
	System.out.println(sum1);

	for(int i = 1; i < 101; i++) {
		if(i % 2 == 1) {
			sum2 = sum2+i;
		}
	}
	System.out.println(sum2);
}

}

