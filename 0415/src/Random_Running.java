import java.util.ArrayList;
import java.util.Arrays;

public class Random_Running {
	public static void main(String[] args) {
		Random3 rand = new Random3();
		int[] arr2 = rand.nextInt2(100);
		System.out.println(Arrays.toString(arr2));
		double n2 = rand.nextDouble();
	}
}
