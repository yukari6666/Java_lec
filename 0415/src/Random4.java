import java.util.Random;

public class Random4 extends Random {
	Student std = new Student();
	public int[] nextInt2(Student sArrays) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = super.nextInt(sArrays); 
		}
	
		return arr;
	}
}
