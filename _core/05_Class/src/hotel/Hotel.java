package hotel;

import java.util.Scanner;

//import hotel.Room;
//import hotel.User;

public class Hotel {
	private Room[][] rooms;

	public void goFrontDest() {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		boolean flag = true;

		while (flag) {
			System.out.println("\n====================== 호텔 관리 메뉴 =====================");
			System.out.println("1:객실현황 2:입실 3:퇴실 4:객실상세조회 5:투숙객리스트 6:투숙객조회Etc:종료");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>> 메뉴 선택 >>>>>>>>>>>>>>>>>>>>>>>>>>");
			menu = sc.nextInt();

			flag = choiceMenu(menu);
		}
		System.out.println("프로그램을 종료합니다");

	}

	private boolean choiceMenu(int menu) {

		switch (menu) {
		case 1:
			situation();

			break;
		case 2:
			checkIn();
			break;
		case 3:
			checkOut();

			break;
		case 4:
			roomCheck();

			break;
		case 5:
			getUserList();

			break;
		case 6:
			guestInquiry();

			break;
		default:
			System.out.println("호텔을 이용해주셔서 감사합니다");
			return false;

		}
		return true;
	}

	private void getUserList() {
		System.out.println("방번호\t고객정보");
		for (Room[] f : rooms) {
			for (Room room : f) {
				System.out.print(room.getRoomNum() + "\t");
				System.out.println(room.getUser());
//				if(room.getUser()!=null) {
//				}else {
//					System.out.println();
//				}
			}

		}

	}

	private void guestInquiry() {
		Scanner sc = new Scanner(System.in);
		System.out.println("찾으실 투숙객 이름>");
		String oder = sc.next();
		Room room = null;

		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms.length; j++) {
				if (rooms[i][j].getUser() != null) {
					if (rooms[i][j].getUser().getName().equals(oder)) {
						room = rooms[i][j];
						System.out.print(room);
						System.out.println(room.getUser());
					}
				}
			}
		}
		if (room == null) {
			System.out.println("찾으시는 고객이없습니다");
			System.out.println("다시 찾으시려면-> 1 초기화면-> 2");
			int oder2 = sc.nextInt();
			if (1 == oder2) {
				guestInquiry();

			}

		}

	}

	private void roomCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("입실하실 방번호 입력");
		String roomNum = sc.next();
		int i = Integer.parseInt(roomNum.substring(0, 1)) - 1;
		int j = Integer.parseInt(roomNum.substring(1, roomNum.length() - 1)) - 1;
		System.out.println("방번호\t고객\t나이\t성별\t입실시간\t퇴실시간 ");
		System.out.println(rooms[i][j]);
		System.out.println(rooms[i][j].getUser());
	}

	private void checkOut() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("퇴실하실 방번호 입력");
			String roomNum = sc.next();
			int floor = Integer.parseInt(roomNum.substring(0, 1)) - 1;
			int rNum = Integer.parseInt(roomNum.substring(1, roomNum.length() - 1)) - 1;

			if (rooms[floor][rNum].isEmpty()) {
				System.out.println("퇴실 시간 입력 >");
				String checkOutTime = sc.next();
				rooms[floor][rNum].setCheckOutTime(checkOutTime);
				rooms[floor][rNum].setCheckInTime(null);
				rooms[floor][rNum].setEmpty(false);
				rooms[floor][rNum].setUser(null);
				System.out.println(rooms[floor][rNum].getRoomNum() + " 퇴실 완료입니다.");

			} else {
				System.out.println("사용중인 방이 아닙니다.");
				checkOut();
			}
		} catch (Exception e) {
			System.out.println("정확하게 입력해주세요ex)101호>");
			checkOut();
		}
	}

	private void checkIn() {
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("입실하실 방번호 입력");
			String roomNum = sc.next();
			int floor = Integer.parseInt(roomNum.substring(0, 1)) - 1;
			int rNum = Integer.parseInt(roomNum.substring(1, roomNum.length() - 1)) - 1;
			if (rooms[floor][rNum].isEmpty()) {
				System.out.println("사용중인 방입니다.");
				checkIn();
			} else {
				System.out.println("고객 성함입력>");
				String name = sc.next();
				System.out.println("고객 나이입력>");
				int age = sc.nextInt();
				System.out.println("고객 성별>");
				char gen = sc.next().charAt(0);
				User u = new User(name, age, gen);
				System.out.println("입실 시간 입력 >");
				String checkInTime = sc.next();
				rooms[floor][rNum].setUser(u);
				rooms[floor][rNum].setCheckInTime(checkInTime);
				rooms[floor][rNum].setCheckOutTime(null);
				rooms[floor][rNum].setEmpty(true);
				System.out.println(rooms[floor][rNum].getRoomNum() + " 입실 완료입니다.");
			}
		} catch (Exception e) {
			System.out.println("정확하게 입력해주세요ex)101호>");
			checkIn();
		}

	}

	private void situation() {
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				System.out.print(rooms[i][j].getRoomNum() + ":");
				System.out.print(rooms[i][j].isEmpty() ? "사용중 \t" : "사용가능\t");

			}
			System.out.println();
		}

	}

	void crectionRoom(Room[][] room) {
		rooms = room;
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				rooms[i][j] = new Room((i + 1) + (j < 9 ? "0" : "") + (j + 1) + "호", false);

			}
		}
	}

}
