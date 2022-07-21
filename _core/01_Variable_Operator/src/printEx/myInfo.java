package printEx;

import java.util.Scanner;

public class myInfo {

	public static void main(String[] args) {
		String name = "choi";
		int age = 32;
		float height = 172.5f;
		double weight = 65.2;
		char blood = 'O';
		boolean vachine = true;
		long asset = 2148000000L;
		String description = "공부중입니다";

		Scanner sc = new Scanner(System.in);

		// 정보 입력 안내
		// 입력 받은 정보를 변수에 저장

		// 문자" %s, 정수: %d, 실수: %f
		System.out.println("이름을 입력하세요 >");
		name = sc.nextLine();//뉴라인은 입력됨 : 마지막 입력에 사용금지
		System.out.println("나이입력>");
		age = sc.nextInt();
		System.out.println("키입력 >");
		height = sc.nextFloat();
		System.out.println("몸무게 입력 >");
		weight = sc.nextDouble();
		System.out.println("혈액형을 입력하세요 >");
		blood = sc.next().charAt(0);
		System.out.println("자산입력>");
		asset = sc.nextLong();
		System.out.println("뭐하시는중인가요?>");
		description = sc.next(); // 뉴 라인이 입력됨
		System.out.println("백신 맞았니 ?");
		vachine = sc.nextBoolean();

		System.out.printf("이름:%s \n", name);
		System.out.printf("나이:%d \n", age);
		System.out.printf("키:%f\n", height);
		System.out.printf("몸무게:%f \n", weight);
		System.out.printf("혈액형:%s \n", blood);
		System.out.printf("자산:%d \n", asset);
		System.out.printf("지금하는 것:%s\n", description);
		System.out.printf("백신접종:%s\n", vachine);

	}

}
