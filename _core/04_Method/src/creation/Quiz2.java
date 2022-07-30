package creation;

public class Quiz2 {

	public static void main(String[] args) {
		// 랜덤으로 정수 5개를 배열에 담는 메서드
		// 그 배열을 전달 받아 평균 연산하는 메서드
		// 정수 5개와 연산 결과를 출력하는 메서드
		// main 메서드에는 어떠한 연산식도 있으면 안됨
		// 메서드간 데이터 전달 및 호출만 있어야함

		// Print(Average(makeRandomNums())); // 1회성의 방식
		Average(makeRandomNums()); // 1회성의 방식
	}

	private static void Average(int[] rnds) {
			int result = 0;
		for (int i : rnds) {
			result += i;
		}
		System.out.print("평균:"+(double) result / rnds.length);
			
		}

	/*
	 * private static void Print(double avg) {
	 * 
	 * 
	 * System.out.println("평균:" + avg); }
	 */

//		private static double Average(int[] rnds) {
//			int result = 0;
//			for (int i : rnds) {
//				result += i;
//			}
//			return ((double) result / rnds.length);
//		}

	private static int[] makeRandomNums() {
		int[] rndNum = new int[5];
		System.out.println("5개의 정수");
		for (int i = 0; i < rndNum.length; i++) {
			rndNum[i] = ((int) Math.floor(Math.random() * 40)) + 60;
			System.out.print(rndNum[i] + "점" + ",");
		}

		return rndNum;
	}

}
