package quiz;

import java.util.Iterator;
import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 숫자 야구 게임
		int[] comNum = new int[3];
		int[] uNum = new int[3];
		int count =0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("컴퓨터 숫자 생성 ");
		for (int i = 0; i < comNum.length; i++) {
			comNum[i] = (int) (Math.floor(Math.random() * 9));
			for (int j = 0; j < i; j++) {
				if (comNum[i] == comNum[j]) {
					i--;
					break;
				}
			}
		}
		for (int i : comNum) {
			System.out.print(i + " ");
		}
		System.out.println();

		do {
			int strike = 0, ball = 0;
			for (int i = 0; i < uNum.length; i++) {
				System.out.println((i+1)+"번째 숫자 입력>");
				uNum[i] = sc.nextInt();
			}
			count++;
			for (int i = 0; i < comNum.length; i++) {
				for (int j = 0; j < uNum.length; j++) {
					if (comNum[i] == uNum[j]) {
						if (i == j) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}
			if(strike == 3) {
				System.out.println(count+"번째시도 맞추셨습니다.");
				break;
			}
			System.out.println("스트라이크"+strike+ " "+"볼"+ ball );
		} while (true);
		System.out.println("게임 종료" );
	}
}
