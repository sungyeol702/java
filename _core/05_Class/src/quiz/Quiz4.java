package quiz;

import java.util.Scanner;

public class Quiz4 {
	static int num1;
	static int num2;
	static String cal;

	public static void main(String[] args) {
		// 나머지 연산을 포함한 사칙연산 계산기만들기
		// main메서드는 각 기능을 담당할 메서드만 호출함
		// 각 연산 메서드는 반환형과 파라미터가 없다
		// 모든 멤버들은 static이다
		Scanner sc = new Scanner(System.in);
		System.out.println("사칙연산 계산기+,-,*,/,%");
		System.out.println("숫자입력>");
		num1 = sc.nextInt();
		System.out.println("연산자 입력");
		cal = sc.next();
		System.out.println("숫자입력>");
		num2 = sc.nextInt();

		switch (cal) {
		case "+":
			addition();
			break;
		case "-":
			subtraction();

			break;
		case "*":
			multiplication();
			break;
		case "/":
			division();
			break;
		default:
			division();
			break;
		}

	}

	private static void division() {
		
		System.out.println(cal == "/" ? num1 + "" + cal + "" + num2 + "=" +( (double)num1/num2)
				: num1 + "" + cal + "" + num2 + "=" + ((double)num1%num2));

	}

	private static void multiplication() {
		System.out.println(num1 + "" + cal + "" + num2 + "=" + (num1 * num2));

	}

	private static void subtraction() {
		System.out.println(num1 + "" + cal + "" + num2 + "=" +(num1 - num2));

	}

	private static void addition() {
		System.out.println(num1 + "" + cal + "" + num2 + "=" + (num1 + num2));

	}

}
