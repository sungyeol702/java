package quiz;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		//Optional
		//호텔 예약 프로그램
		int[][][] hotel = new int[1][3][5];
		boolean[][][] rooms = new boolean[1][3][5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < hotel.length; i++) {
			for (int j = 0; j < hotel[i].length; j++) {
				for (int j2 = 0; j2 < hotel[i][j].length; j2++) {
					hotel[i][j][j2] = (100*(j+1))+(j2+1);
					rooms[i][j][j2]= false;
					System.out.print(hotel[i][j][j2] +"호"+ " " );
					System.out.print(rooms[i][j][j2] ? "사용중" : "빈방" + " ");
				}
				System.out.println();
			}
		}
		do {
		System.out.println("000호까지 입력해주세요" );
		System.out.println("위에 호실 사용여부를 잘보고 입력해주세요" );
		System.out.println("몇호실에 입실 or 퇴실하겠습니까?> " );
		String roomNum = sc.next();
		int fristN= Integer.parseInt(roomNum.substring(0,1))-1;
		int lastN= Integer.parseInt(roomNum.substring(2,roomNum.length()-1))-1;
		
		if(rooms[0][fristN][lastN]) {
			System.out.println("퇴실완료입니다");
			rooms[0][fristN][lastN]= false;
		}else {
			rooms[0][fristN][lastN]= true;
			System.out.println("입실완료입니다");
		}
		for (int i = 0; i < hotel.length; i++) {
			for (int j = 0; j < hotel[i].length; j++) {
				for (int j2 = 0; j2 < hotel[i][j].length; j2++) {
					System.out.print(hotel[i][j][j2] + "호"+" " );
					System.out.print(rooms[i][j][j2]? "사용중\t" : "빈방 \t");
				}
				System.out.println();
			}
		}
		} while (true);
	}
}
