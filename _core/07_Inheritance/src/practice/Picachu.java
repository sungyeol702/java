package practice;

public class Picachu extends Character {
	
	public Picachu() { 
		name = "피카츄";
		hp = 100; 
		mp = 50; 
		System.out.println("피카츄 생성~ 피카 피카~");
		
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
