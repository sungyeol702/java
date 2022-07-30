package baseballGame;

import java.time.LocalTime;
import java.util.Scanner;

public class GamePlay {
	private History[] history;
	private User user;
	private int[] comNum;
	private int[] userNum;
	private boolean flag = true;
	private int count;
	private int regCount;
	private int players;
	private int time;

	Scanner sc = new Scanner(System.in);

	public GamePlay() {
		personnel();
	}
	private void personnel() {
		System.out.println("몇개의 기록을 남길거니?");
		players = sc.nextInt();
		history = new History[players];
		gameMenu();

	}
	private void gameMenu() {
		while (flag) {
			System.out.println("==========게임메뉴===========");
			System.out.println("1.게임플레이 2.기록확인 etc.종료");
			int menu = sc.nextInt();
			gameStrat(menu);
		}
		System.out.println("프로그램 종료");
	}

	private void gameStrat(int menu) {
		switch (menu) {
		case 1:
			play();
			break;
		case 2:
			printHistory(history);
			break;
		default:
			System.out.println("이용해주셔서 감사합니다.");
			flag = false;
			break;
		}
	}

	private void play() {
		count = 0;
		boolean flag = true;
		LocalTime now = LocalTime.now();
		time = now.toSecondOfDay();
		makeComBall();
		while (flag) {
			userNum = guessNumber();
			count++;
			int[] strikeAndBall = compareNumbers();
			flag = printResult(strikeAndBall);
		}

	}

	private int[] guessNumber() {
		int[] myNum = new int[3];
		System.out.println("숫자를 추측 > ");
		String myNumStr = sc.next();
		String[] myNumStrArr = myNumStr.split("");
		for (int i = 0; i < myNumStrArr.length; i++) {
			myNum[i] = Integer.parseInt(myNumStrArr[i]);
		}

		return myNum;

	}

	private int[] compareNumbers() {
		int[] stkNBall = { 0, 0 };
		for (int i = 0; i < comNum.length; i++) { // 컴숫자를 기준으로
			for (int j = 0; j < userNum.length; j++) { // 입력 숫자를 비교
				if (comNum[i] == userNum[j] && i == j) { // 값과 자리수가 같으면
					stkNBall[0]++;
				} else if (comNum[i] == userNum[j] && i != j) {// 값은 같으나 자리수가 다르면
					stkNBall[1]++;
				}
			}
		}
		return stkNBall;
	}

	private boolean printResult(int[] strikeAndBall) {

		if (strikeAndBall[0] == 0 && strikeAndBall[1] == 0) {
			System.out.println("OUT!");
		} else {
			System.out.print("시도 횟수 : " + count);
			System.out.println(" > " + strikeAndBall[0] + "S " + strikeAndBall[1] + "B");
		}
		if (strikeAndBall[0] == 3) {
			System.out.println("게임종료 : 총 시도횟수 : " + count);
			userHistory();
			return false;
		}
		return true;
	}

	private void userHistory() {
		LocalTime now = LocalTime.now();
		int end = now.toSecondOfDay() - time;
		System.out.println("기록을 남겨주세요");
		System.out.println("이름 >");
		String name = sc.next();
		System.out.println("나이 >");
		int age = sc.nextInt();
		user = new User(name, age);

		int j = history.length - 2;
		for (int i = history.length - 1; i > 0; i--) {
			history[i] = history[j];
			j--;
		}
		history[0] = new History(user, count, end);
		System.out.println("기록등록");

	}

	private void printHistory(History[] history2) {
		for (History history : history2) {
			if (history != null) {
				System.out.println(history);
			}
		}
	}

	

	private void makeComBall() {
		comNum = new int[3];
		for (int i = 0; i < comNum.length; i++) {
			comNum[i] = (int) (Math.random() * 9) + 1;
			for (int j = 0; j < i; j++) {
				if (comNum[j] == comNum[i]) {
					i--;
					break;
				}
			}
		}
		for (int i : comNum) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("컴퓨터 숫자 생성");
	}

}
