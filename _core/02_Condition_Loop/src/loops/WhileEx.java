package loops;

public class WhileEx {

	public static void main(String[] args) {
		// 1부터 20의 합 구하기
		int i = 1;
		int result = 0;
		while (i < 21) {
			result += i;
			i++;
		}
		System.out.println(result);
		
		int num = 1;
		int result1 = 0;
		do {
			if(num % 2 == 1) {
				result1 +=num;
			}
			num++;
		} while (num <101);
		System.out.println(result1);
	}

}
