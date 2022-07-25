package quiz;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// Q1. 3자리 이상의 정수 L, 2자리 이하의 정수 a,b를 입력받아
		// L까지의 a, b의 배수 개수를 구하세요
		Scanner sc = new Scanner(System.in);
		System.out.println("3자리 정수 입력>");
		int num = sc.nextInt();
		System.out.println("2자리 이하의 a정수 입력>");
		int a = sc.nextInt();
		System.out.println("2자리 이하의 b정수 입력>");
		int b = sc.nextInt();
		int a1 = 0;
		int b1 = 0;

		for (int i = 1; i < num; i++) {
			if (i%a==0 ) {
				a1++;
			}
			if (i%b ==0) {
				b1++;
			}
		}
		System.out.println(num + "까지의" + a + " 의 배수 개수 : " + a1);
		System.out.println(num + "까지의" + b + "의 배수 개수 : " + b1);
		System.out.println((char)'A');
//		Scanner sc = new Scanner(System.in);
//		System.out.println("3자리 이상의 수를 입력 >");
//		int L = sc.nextInt();
//		System.out.println("2자리 이하의 수 2번 입력 >");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int ba = 0;
//		int bb = 0;
//		for(int i = 0; i < L; i++) {
//			if(i % a == 0) {
//				ba++;
//			} if(i%b == 0) {
//				bb++;
//			}
//		}
//		System.out.println("a 배수 갯수 : "+ ba+ " , b 배수 갯수 : " + bb );
//		System.out.println("종료");

	}

}
