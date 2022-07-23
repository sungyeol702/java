package conditions;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		//현재시간(24시간 기준)을 입력받아
		//9시 이전이면 굿모닁 출력
		//14시이전이면 굿앱터눈
		//22시 이전이면 굿 나잇
		Scanner sc = new Scanner(System.in);
		System.out.println("시간을 입력해주세요 >");
		int time = sc.nextInt();
		if(time <9){
			System.out.println("굿모닝");
		}else if(time < 14) {
			System.out.println("굿앱터눈");
		}else if(time <22) {
			System.out.println("굿 나잇");
		}else {
			System.out.println("자는중");
		}
		
		

	}

}
