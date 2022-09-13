package practice;

public class Isanghaessi extends Character {

		public Isanghaessi() {
			name = "이상해씨";
			hp = 100; // 체력 초기화
			mp = 50; // 마나 초기화
			System.out.println("이상해씨 생성~ 씨이~씨이~~이상~");
			
		}
		@Override
		public void eat() { 
			mp += 10;
		}

		@Override
		public void sleep() {
			mp += 20;
		}

		@Override
		public void play() {
			mp -= 20;
			hp += 5;
		}

		@Override
		public boolean train() {
			mp -= 10;
			hp += 10;
			levelUp();
			return checkMp();
		}

		@Override
		public void levelUp() {
			if(hp >= 40) {
				hp -= 40;
				level++;
			}
		}
}
