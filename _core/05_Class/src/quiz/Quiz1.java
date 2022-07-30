package quiz;

public class Quiz1 {

	public static void main(String[] args) {
		//한줄에 #10개 출력
//		output(10,#)메서드를 호출
//		출력문에서 for문을 이용
		String[] str = output(10,"#");
		printResult(str);

	}

	private static void printResult(String[] str) {
		
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+" ");
		}
	
	}

	private static String[] output(int num, String string) {
		String[] str = new String[num];
		for (int i = 0; i < num; i++) {
			str[i] = "#";
		}
		return str;
	}

}
