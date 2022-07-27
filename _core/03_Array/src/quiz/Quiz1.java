package quiz;

import java.util.Scanner;

public class Quiz1 {
// 24절기 맞추기 게임
	public static void main(String[] args) {
		String[] seasonal= {"입춘", "우수","경칩","춘분",
				"청명","곡우","입하","소만",
				"망종","하지","소서","대서",
				"입추","처서","백로",
				"춘분","한로","상강","입동",
				"소설","대설", "동지","소한","대한"
		};
		//? 번째 절기는 무엇입니까?
		//정답 or 오답입니다 > 정답은 ?
		//정답을 맞출때 까지 몇번 시도했는지 출력
		
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		do {
			int num = (int) (Math.floor(Math.random()*24));
			System.out.println((num+1)+"번째 절기는 무엇입니까?>"  );
			String result= sc.next();
			if(result.equals(seasonal[num])) {
				count++;
				System.out.println("정답입니다 시도횟수는"+count);
				break;
			}
			count++;
			System.out.println("틀렸습니다 정답은>" +seasonal[num]);
		} while (true);
		System.out.println("프로그램 종료");
		
	}
}
