package loops;

public class GuGuDan {

	public static void main(String[] args) {
		// 구구단을 찍어보자 => 중첩 반복문
		// \t 효과
		// System.out.println(); 엔터효과
		for (int i = 1; i < 10; i++) {
			for (int dan = 2; dan < 10; dan++) {
				System.out.print(dan + "x" + i + "=" + (dan * i) + "\t");
			}
			System.out.println();
		}
	}

}
