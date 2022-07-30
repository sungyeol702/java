package quiz;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
//		입력받은 값을 compute(item, qty, price)메서드로 처리
//		출력예 입력 - 품명: apple , 수량:10 단가 1200
//			 출력 - 품명 : apple 금액 12000
		Scanner sc = new Scanner(System.in);
		System.out.println("품명 입력>");
		String item = sc.next();
		System.out.println("수량 입력>");
		int qty = sc.nextInt();
		System.out.println("단가 입력>");
		int price= sc.nextInt();
		compute(item, qty, price);
		
	}

	private static void compute(String item, int qty, int price) {
		int total= price*qty;
		System.out.println("품명:"+item+ " 수량:"+qty+"개 단가: "+price);
		System.out.println("품명:"+item+ " 금액:"+total);
	}
}
