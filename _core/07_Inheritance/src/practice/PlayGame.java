package practice;

import java.util.Scanner;

public class PlayGame {

	private Character character; 
	private int menu; 
	private boolean flag; 
	private CharDB db = new CharDB();
	private int chNum;

	public boolean isFlag() {
		return this.flag;
	}

	public PlayGame() {

	}

	public void setPlayGame(Character ch, int chNum) { 
		this.chNum = chNum;
		this.character = db.getDb(ch, chNum);
		character.printStatus();
	}

	public void printMenu(Scanner sc) {
		
		System.out.println("1.EAT 2.SLEEP 3.PLAY 4.TRAIN 0.EXIT");
		menu = sc.nextInt();
		playCharacter(); 
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	private void playCharacter() { 
		switch (menu) {
		case 1:
			character.eat();
			break;
		case 2:
			character.sleep();
			break;
		case 3:
			character.play();
			break;
		case 4:
			character.train();
			break;

		default:

			db.setDb(character, chNum);
			flag = true;
			break;
		}
		character.printStatus(); 
	}
}
