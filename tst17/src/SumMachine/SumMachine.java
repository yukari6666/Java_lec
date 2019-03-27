package SumMachine;

public class SumMachine {
	public void doSum(int value1, int value2) {
		int start = value1;
		int end = value2;
		int sum = 0;
		int i=0;
		
		for(i = start; i<end+1; i++ ) {
			sum = sum + i;
		}
		System.out.println("시작 값은: "+start);
		System.out.println("최종 값은: "+end);
		System.out.println("총 합은: "+sum);
	}
	}

