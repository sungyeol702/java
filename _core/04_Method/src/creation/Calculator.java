package creation;

import java.util.Scanner;

import sun.java2d.opengl.WGLSurfaceData.WGLVSyncOffScreenSurfaceData;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===계산기를 만들어 보자======");
		System.out.println("연산자를 입력하세요");
		System.out.println("+, -, *, /, %");
		String op = sc.next();

		System.out.println("첫번째 숫자 입력 >");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자 입력 >");
		int num2 = sc.nextInt();

		switch (op) {
		case "+":
			addition(op, num1, num2); // 파라미터의 형태가 중요

			break;
		case "-":
			substraction(op, num1, num2); // 메서드를 미리 정의하고 마우스오버를 하면 크리에이트 메서드가 나옴 안나오면 컨드롤+1

			break;
		case "*":
			int[] nums = { num1, num2 };// 배열자체를 던질수없고 배열을 만든 후 파라미터로 보낼수있다
			mutiplication(nums, op);

			break;
		case "/":
			double result = division(num1, op, num2);
			System.out.println(num1 + "/" + num2 + "=" + result);
			break;
		case "%":
			double[] res = modulus(num1, op, num2);
			System.out.println("/ 의 결과 : " + res[0]);
			System.out.println("% 의 결과 : " + res[1]);
			break;

		default:
			break;
		}
	}

	private static double[] modulus(int n1, String op, int n2) {
		double[] result = new double[2];
		result[0] = (double) n1 / n2;
		result[1] = (double) n1 % n2;

		return result;
	}

	private static double division(int n1, String op, int n2) { // 리턴받는 타입은 리턴의 데이터 타입의 형태를 정확하게 써준다 double
		// 반드시 리턴이 들어가야 함

		return ((double) n1 / n2);
	}

	private static void mutiplication(int[] nums, String op) {
		System.out.println(nums[0] + "*" + nums[1] + "=" + (nums[0] * nums[1]));

	}

	private static void substraction(String op, int n1, int n2) {

		System.out.println(n1 + "-" + n2 + "=" + (n1 - n2));
	}

	private static void addition(String op, int n1, int n2) {
		System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));

	}

}
