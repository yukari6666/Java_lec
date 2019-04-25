import java.util.Random;
import java.util.Arrays;
public class no5 {
public static void main(String[] args) {
	Random rand = new Random();
	int[] arr = new int[30];
	for(int i= 0; i < 30; i++) {
		int Number = rand.nextInt(100);
		arr[i] = Number;
	}
	System.out.println(Arrays.toString(arr));
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
}
}
