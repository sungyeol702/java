package creation;

import java.util.Iterator;
import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 숫자 야구 게임
		int[] comNum = makeComNum();// 컴퓨터숫자 배열
		playGame(comNum);
	}

	private static void playGame(int[] comNum) {
		int count = 0; // 시도횟수
		boolean flag = true;

		while (flag) {
			int[] myNum = guessNumber();
			count++;
			int[] strikeAndBall = compareNumbers(myNum, comNum);
			flag = printResult(strikeAndBall, count, myNum);
		}

	}

	private static boolean printResult(int[] strikeAndBall, int count, int[] myNum) {

		if (strikeAndBall[0] == 0 && strikeAndBall[1] == 0) {
			System.out.println("OUT!");
		} else {
			System.out.print("시도 횟수 : " + count);
			System.out.println(" > " + strikeAndBall[0] + "S " + strikeAndBall[1] + "B");
		}
		if (strikeAndBall[0] == 3) {
			System.out.println("게임종료 : 총 시도횟수 : " + count);
			return false;
		}
		return true;
	}

	private static int[] compareNumbers(int[] myNum, int[] comNum) {
		int[] stkNBall = { 0, 0 };
		for (int i = 0; i < comNum.length; i++) { // 컴숫자를 기준으로
			for (int j = 0; j < myNum.length; j++) { // 입력 숫자를 비교
				if (comNum[i] == myNum[j] && i == j) { // 값과 자리수가 같으면
					stkNBall[0]++;
				} else if (comNum[i] == myNum[j] && i != j) {// 값은 같으나 자리수가 다르면
					stkNBall[1]++;
				}
			}
		}
		return stkNBall;
	}

	private static int[] guessNumber() {
		Scanner sc = new Scanner(System.in);
		int[] myNum = new int[3]; // 추측숫자 배열
		System.out.println("숫자를 추측 > ");
		String myNumStr = sc.next(); // 숫자를 문자로 받는다
		String[] myNumStrArr = myNumStr.split(""); // 문자를 배열로 만든다

		// 입력받은 문자를 숫자로 변환하여 배열에 저장
		for (int i = 0; i < myNumStrArr.length; i++) {
			myNum[i] = Integer.parseInt(myNumStrArr[i]);
		}

		return myNum;
	}

	private static int[] makeComNum() {
		int[] comNum = new int[3];
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
		return comNum;
	}
}
