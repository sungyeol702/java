package quiz;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// 피보나치 수열 출력
		// 확인하고 싶은 수열의 자리수(정수)받기
		// 수열 계산하는 메서드 int fibo(int n)

		Scanner sc = new Scanner(System.in);
		System.out.println("확인하고 싶은 수열의 자리수 입력>");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print(fibo(n)+" ");
		}

	}

	private static int fibo(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return fibo(n - 2) + fibo(n - 1);
		}
	}

}
