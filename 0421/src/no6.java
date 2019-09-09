import java.util.Scanner;
import java.util.Arrays;

public class no6 {
	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		int Value = 0;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {//0,1,2번째 배열에만 값을 넣기 위해 한 자리 적게 for문을
												 //돌렸다.
			for (int j = 0; j < 3; j++) {
				Value = scan.nextInt();
				arr[i][j] = Value;
			}
		}//여기까지가 배열에 값을 넣는 부분
		
		//배열에 값을 넣고 그 합을 구하는 건 서로 구분을 해줘야 한다.
		
		for (int c = 0; c < 4; c++) {//여기서부터 마지막 배열에 합을 넣는 부분.
			for (int d = 0; d < 4 - 1; d++) {
				int arrayValue = arr[c][d];
				//arrayValue에다가 arr[c][d] 값을 넣는다.
				//arr[c][d] = arr[i][j]와 같다.
				arr[3][c] = arr[3][c] + arrayValue;
				//3번째 배열에다가 c번째 배열 값을 넣는데, 거기에 arrayValue를 더한다.
				//즉 c = arr[i][j]가 되는 것.
				//c에 arr[i][0,1,2]의 값이 더해지면서 누적이 된다.
				int sum1 = 0;
				if (arr.length == arr[3][d]) {//arr의 길이가 arr[3][d]와 같을 때, 라는 조건.
															  //즉, arr[3] = arr[3]일 때.
					sum1 = sum1 + arr[3][d];
					//sum1에다가 arr[3][d] 값을 넣는다.
					//여기서 d 값은 위에서 넣은 0,1,2번째 배열의 더한 값이 된다.
					arr[3][3] = sum1;
					//arr[3][3] 자리에 arr[3][d] 값이 들어간다.
					//즉 3번째 배열의 내부 값들 중 0,1,2 자리에 해당하는 값들이 마지막 3번째 자리에
					//더해져서 들어가게 된다.
					//d가 4-1만큼만 for문이 도는 이유는 0,1,2 자리만 더하기 때문.
				}
			}
		}
		for (int e = 0; e < arr.length; e++) {
			System.out.println(Arrays.toString(arr[e]));
		}
	}
}
