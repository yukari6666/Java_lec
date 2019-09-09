import java.util.Arrays;
import java.util.Random;

public class Running_Student {
	public static void main(String[] args) {
		Random rand = new Random();
		
		Student[] student = new Student[10];
		for (int i=0; i < student.length; i++) {//각자의 객체를 생성
			student[i] = new Student();
		}
		for (int i = 0; i < student.length; i++) {//각 개체에 점수를 집어넣는 것
			student[i].name = (i+1)+"번 학생";
			student[i].kor = rand.nextInt(100);
			student[i].eng = rand.nextInt(100);
			student[i].math = rand.nextInt(100);
		}
		for(int i= 0; i <student.length; i++) {//각 개체의 점수를 통합하여 찍어내는 것.
			student[i].total = student[i].kor + student[i].eng+student[i].math;
		}
		for (int i =0; i < student.length; i++) {
			for (int j =0; j < student.length; j++) {
				if(student[i].total < student[j].total) {
					Student tmp = student[i];
					student[i] = student[j];
					student[j] = tmp;
				}
				
			}
		
		}
		for(int i = 0; i<student.length; i++) {
			System.out.println(student[i].print());
		}
//		System.out.println(Arrays.toString(student));
	}
}