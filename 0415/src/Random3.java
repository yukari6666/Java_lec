import java.util.Random;

public class Random3 extends Random {
	int[] resultArr = new int[10];
	public int[] nextInt2(int range) {
		for (int i = 0; i < resultArr.length; i++) {
			resultArr[i] = super.nextInt(range);
		}
		return resultArr;
	}

}