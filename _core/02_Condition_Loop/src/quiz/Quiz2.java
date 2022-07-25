package quiz;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		//Q2. 음수나 0을 입력할때까지 숫자를 계속 입력받고
		//음수나 0이 입력되면 지금까지 입력된 수의 총합과 평균을 구하세요

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 계속 입력해 주시고 0이하의 숫자를 입력하면 멈추고 입력한 수의 합계와 평균이 구해집니다");
		System.out.println("숫자입력 >");
		int num = sc.nextInt();;
		int total =0;
		int count = 0;
		
		for (int i = 0; 0 < num; i++) {
			total +=num;
			//System.out.println("숫자입력>");
			num= sc.nextInt();
			count++;
		}	
		System.out.println("총합"+total );
		System.out.println("평균"+(double)total/count);
		
//		
//		int inputNum, sum = 0, count = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요 > ");
//		inputNum = sc.nextInt();
//		while(inputNum > 0) {
//			sum += inputNum;
//			count++;
//			System.out.println("숫자를 입력해주세요 > ");
//			inputNum = sc.nextInt();
//		}
//		if(count == 0) {
//			System.out.println("숫자를 하나도 입력하시지 않았습니다.");
//		} else {
//			System.out.printf("합계: %d, 평균: %d", sum, sum/count);
//		}

		
	}

}
