import java.util.Scanner;

public class game1 {
public static void main(String[] args) {
	Player player = new Player("폴리텍", 100);
	Enemy[] enemy = new Enemy[5];
	enemy[0] = new Enemy("자바", 100);
	enemy[1] = new Enemy("gksrmf0", 10);
	enemy[2] = new Enemy("addaw", 50);
	enemy[3] = new Enemy("qweqe", 80);
	enemy[4] = new Enemy("qweq231e", 70);
	enemy[5] = new Enemy("qweq4234e", 60);
	player.hp=100;
	
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("엔터를 입력하세요");
	for (int i=-0; i < 1000; i++) {
		scanner.nextLine();
		for(int j = 0; j < enemy.length; j++) {
			enemy[j].attack();
			if(enemy[j].status()) {
				enemy[j].attack();
			}
		}

		
		player.attack();
		if (player.status()) {
			
		}else {
			System.out.println("You Died");
		}
		//player hp = 0 GameOver
		
	}
}
}
