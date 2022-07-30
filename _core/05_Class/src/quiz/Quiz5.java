package quiz;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		// 4번 문제의 연산을 담당할 메서드에 파라미터 사용
		// 두개의 정수를 입력받는 메서드를 배열로 반환하기
		// 입력받는 메서드는 배열과 반목문으로 구성하기
		// 연산자를 선택하는 메서드를 정수형으로 반환 하기
		
		int[] nums = getnums();
		 
		int oper = getOper();
		
		
		
		switch (oper) {
		case 0:
			addition(nums);//+
			break;
		case 1:
			subtraction(nums);//-

			break;
		case 2:
			multiplication(nums);//*
			break;
		case 3:
			division(nums);// /
			break;
		default:
			modulus(nums);//%
			break;
		}
	}
	

	private static int getOper() {
		Scanner sc = new Scanner(System.in);
		System.out.println("연산식 입력>");
		String oder = sc.next();
		int oper = oder.equals("+") ? 0 :
				   oder.equals("-")? 1 : 
				   oder.equals("*")? 2 : 
				   oder.equals("/")? 3 : 4;
		return oper;
	}


	private static int[] getnums() {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[2];
		for (int i = 0; i < nums.length; i++) {
			System.out.println((i+1)+"번 숫자입력>");
			nums[i] = sc.nextInt();
		}
		return nums;
	}


	private static void modulus(int[] nums) {
		System.out.println(nums[0] + "/" + nums[1] + "=" + ((double)nums[0] % nums[1]));
	}

	private static void division(int[] nums) {
		System.out.println(nums[0] + "/" + nums[1] + "=" + ((double)nums[0] / nums[1]));
		
	}

	private static void multiplication(int[] nums) {
		System.out.println(nums[0] + "*" + nums[1] + "=" + (nums[0] * nums[1]));
		
	}

	private static void subtraction(int[] nums) {
		System.out.println(nums[0] + "-" + nums[1] + "=" + (nums[0] - nums[1]));
		
	}

	private static void addition(int[] nums) {
		System.out.println(nums[0] + "+" + nums[1] + "=" + (nums[0] + nums[1]));
		
	}
}
