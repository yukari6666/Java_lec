package game_P_E;

import java.util.Random;

public class Player {
	String name = "";
	int HP = 0;
	
	Player(String name, int HP){ 
		this.name = name;
		this.HP = HP;
	}
	
	public boolean status(){
		if (HP > 0) {
			return true;
		}
		return false;
	}
	
	public void A() {
		Random random = new Random();
		int hitNumber = random.nextInt(100);
		if (hitNumber == 99) {
			HP = HP -10;
			System.out.println(this.name + "이(가) 10의 데미지를 입었습니다.");
		}else {
			System.out.println(this.name + "이(가) 회피했습니다.");
		}
		}
	}

