package hotel.controller;



import java.util.List;
import java.util.Scanner;

import hotel.domain.RoomVO;
import hotel.working.HotelWorking;
import hotel.working.WorKing;

public class HotelFront {
	private Scanner sc;
	private WorKing work;
	private boolean flag;
	private RoomVO[][] room;
	
	public HotelFront() {
		sc= new Scanner(System.in);
		work = new HotelWorking();
		flag = true;
		
		roomSeting();
	}
	private void roomSeting() {
		room= new RoomVO[5][10];
		for (int i = 0; i < room.length; i++) {
			for (int j = 0; j < room[i].length; j++) {
				room[i][j]= new RoomVO((i+1)+(j<9?"0":"")+(j+1)+"호", "0");
			}
		}
		//work.roomSeting(room);
		hotelMenu();
	}
	private void hotelMenu() {
		System.out.println("호텔에 오신걸 환영합니다");
		while (flag) {
		System.out.println("----------호텔 메뉴--------------");
		System.out.println("1.입실 2.객실현황 3.객실상세정보 4.투숙객찾기 5.퇴실 Etc.종료 ");
		int menu = sc.nextInt();
			switch (menu) {
			case 1:
				checkIn();
				break;
			case 2:
				RoomsStatus();
				break;
			case 3:
				roomDetail();
				break;
			case 4:
				gusetDetail();
				break;
			case 5:
				checkOut();
				break;

			default:
				System.out.println("호텔을 이용해주셔서 감사합니다.");
				flag=false;
				break;
			}
		
		}
		System.out.println("프로그램 종료");
	}
	private void gusetDetail() {
		System.out.println("투숙객명 입력>");
		String name = sc.next();
		RoomVO guset =work.gusetDetail(name);
		System.out.println(guset ==null? "투숙객이 없습니다":guset);
		
	}
	private void checkOut() {
		System.out.println("호실 입력>");
		String rno = sc.next();
		int isOk = work.checkOut(rno);
		System.out.println(rno+"퇴실"+(isOk>0?"성공":"실패 사용중인 호실이 아닙니다"));
	}
	private void roomDetail() {
		System.out.println("호실 입력>");
		String rno = sc.next();
		RoomVO detail= work.roomDetail(rno);
		System.out.println(detail);
		
	}
	private void RoomsStatus() {
		List<RoomVO> list = work.RoomsStatus();
//		for (RoomVO rm : list) {
//			System.out.print(rm.getRno()+":"+(rm.getIs_empty()>0? "사용중": "빈방")+"\t");
//			
//		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getRno()+":"
					+(list.get(i).getIs_empty()>0? "사용중": "빈방")+"\t");
			if(i==9||i==19||i==29||i==39|| i==49) {
				System.out.println();
			}
		}
		
	}
	private void checkIn() {
		System.out.println("호실 입력>");
		String rno = sc.next();
		System.out.println("고객명>");
		String guset_name = sc.next();
		System.out.println("전화번호>");
		String guset_tel = sc.next();
		System.out.println("나이>");
		int guset_age = sc.nextInt();
		System.out.println("성별>");
		char guset_gen = sc.next().charAt(0);
		int is_empty = 1;
		int isOk= work.checkIn(new RoomVO(rno, guset_name, guset_tel, guset_age, guset_gen, is_empty));
		System.out.println(rno+"입실"+(isOk>0?"성공":"실패 빈방이 아닙니다"));
		
	}
}
