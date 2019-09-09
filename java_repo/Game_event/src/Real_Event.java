import java.util.Random;
public class Real_Event {
	public void Event() {
		Random rand = new Random();
		int r = rand.nextInt(100);
		if (r > 50  &&  r < 80) {
			System.out.println("퀘스트 생성!");
			if(Enemy[j].hp == 0) {
				System.out.println("퀘스트 성공!");
				p.HP = p.HP + 1000;
				System.out.println("당신의 체력"+p.HP+"로 대체되었다.");
			}
		}else {
			System.out.println("생성 실패...");
		}
	}
}
