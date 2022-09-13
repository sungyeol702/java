package practice;

public class Paili extends Character {

	
	public Paili() { 
		name = " 파이리";
		hp = 100; 
		mp = 50; 
		System.out.println("파이리 생성~ 파~~~ 이리~");
		
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
