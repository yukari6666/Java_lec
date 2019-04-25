import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class postRunclass {
public static void main(String[] args) {
	Pst post = new Pst();
	Scanner scan = new Scanner(System.in);
	
	System.out.println("제목");
	post.title = scan.nextLine();
	System.out.println("내용");
	post.descrption = scan.nextLine();
	
	long time = System.currentTimeMillis();
	SimpleDateFormat daytime = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
	post.createDate = dayTime.format(new Date(time));
	
	System.out.println(""+post.title + ", "+post.descrption+", "+post.createDate);
}
}
