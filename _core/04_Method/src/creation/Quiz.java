package creation;

public class Quiz {

	public static void main(String[] args) {
		// 랜덤으로 정수 5개를 배열에 담는 메서드
		// 그 배열을 전달 받아 평균 연산하는 메서드
		// 정수 5개와 연산 결과를 출력하는 메서드
		// main 메서드에는 어떠한 연산식도 있으면 안됨
		// 메서드간 데이터 전달 및 호출만 있어야함

		int[] rndNums = makeRandomNums();

		double avg = Average(rndNums);

		Print(avg, rndNums);
	}

	private static void Print(double avg, int[] rndNums) {

		for (int i = 0; i < rndNums.length; i++) {
			System.out.print(rndNums[i] + "점" + ",");
		}
		System.out.println("평균:" + avg);
	}

	private static double Average(int[] rnds) {
		int result = 0;
		for (int i : rnds) {
			result += i;
		}
		return ((double) result / rnds.length);
	}

	private static int[] makeRandomNums() {
		int[] rndNum = new int[5];
		for (int i = 0; i < rndNum.length; i++) {
			rndNum[i] = ((int) Math.floor(Math.random() * 40)) + 60;
		}

		return rndNum;
	}

}
