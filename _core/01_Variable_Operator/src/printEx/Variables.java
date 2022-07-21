package printEx;

public class Variables {

	public static void main(String[] args) {
		
		String str;
		str = "변수를 문자열 초기화";
		String str2 ="변수 선언 및 초기화";
		int num = 100;
		System.out.println(str+" "+str2+" "+100);
		System.out.println(100);// 단독으로 숫자가 오는것은 권장하지 않음 ->""+100 문자열로 만들어서 출력
		
		System.out.print("엔터효과 \n넣기");
		System.out.printf("\n문자열 넣기 : %s +%d", str, num);
	}

}
