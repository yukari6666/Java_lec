import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Pst {
String title;
String descrption;
String createDate;

public void insertPost() {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("제목");
	this.title = scan.nextLine();
	System.out.println("내용");
	this.descrption = scan.nextLine();
	
	long time = System.currentTimeMillis();
	SimpleDateFormat daytime = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
	this.createDate = daytime.format(new Date(time));
}
}
