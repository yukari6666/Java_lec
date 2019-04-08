import java.util.Scanner;
public class Student2 {
	String name;
	int Middle;
	int Final;
	
	Student2(){
		
	}
	
	Student2(String name){
		this.name = name;
	}
	
	public void inputData() {
		Scanner scan = new Scanner(System.in);
		String tmp;
		System.out.println("중간고사 점수 입력");
		tmp = scan.nextLine();
		this.Middle = Integer.parseInt(tmp);
		System.out.println("기말고사 점수 입력");
		tmp = scan.nextLine();
		this.Final = Integer.parseInt(tmp);
		
		
	}
	
	@Override
	public String toString() {
		return this.name + "(중간고사 "+this.Middle + ", 기말고사"+this.Final+")";
	}
}


