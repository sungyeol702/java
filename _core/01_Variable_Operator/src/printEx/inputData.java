package printEx;

import java.util.Scanner;

public class inputData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String data =  sc.next();
		System.out.println("숫자를 입력하세요 >");
		int data = sc.nextInt();
		System.out.println("연산결과" +(100 + data));// 연산은 괄호가 중요
	}

}
