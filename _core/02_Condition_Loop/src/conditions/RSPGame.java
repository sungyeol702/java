package conditions;

import java.util.Scanner;

public class RSPGame {

	public static void main(String[] args) {
		//가위바위보 게임만들기
		//1.컴퓨터가 랜덤으로 가위바위보 선택
		//2. 나도 가위바위보를 입력
		//3. 승무패 결과 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보 게임 시작 >");
		System.out.println("가위바위보 입력 >");
		String uRSP = sc.next();
		
		int comNum = (int)(Math.floor(Math.random()*2));
		String comRSP =  comNum == 0? "가위" : comNum ==1 ?  "바위" : "보";
		switch (uRSP) {
		case "가위":
			System.out.print(comRSP =="가위" ? "비김" : comRSP =="바위"? "졌다" : "이겼다");
			System.out.println("\t컴퓨터는 "+comRSP);
			
			break;
		case "바위":
			System.out.print(comRSP =="바위" ? "비김" : comRSP =="보"? "졌다" : "이겼다" );
			System.out.println("\t컴퓨터는 "+comRSP);
			break;
		case "보":
			System.out.print(comRSP =="보" ? "비김" : comRSP =="가위"? "졌다" : "이겼다");
			System.out.println("\t 컴퓨터는 "+comRSP);
			break;

		default: 
			System.out.print("가위바위보 할줄 모르니 ?");
			break;
		}
		
		
		
		
	}

}
