package wedservice;

import java.util.Scanner;

public class OpenService {

	public static void main(String[] args) {
		// 1.데이터 베이스에 10개의 Member 객체가 담길수 있다
		// 2. Member 객체는 아이디(중복되지 않음),pwd, nickname, grade(숫자) 속성
		// 3.각 데이터베이스의 메서드는 webService의 요청에 따라 멤버객체를
		// 저장,조회,수정,삭제한다
		// 4. 각 서비스의 결과는 요청 => 처리 => 완료보고의 메세지를 띄운다
		// 5. 프로그램이 종료가 될 때까지 메뉴는 계속해서 아래의 메세지를 실행
		// 1.데이터베이스 선택
		// 1.회원가입 2.로그인, 3.회원수정, 4,회원탈퇴
		// 6.프로그램이 종료 될 때까지 저장한 정보는 사라지면 안됨
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.MySQL 2.Oracle etc.종료");
		int db = sc.nextInt();
		Service svc = new WedService(db);

		while (flag) {
			System.out.println("======메뉴선택=======");
			System.out.println("1.회원가입 2.로그인 3.회원정보 수정 4.회원탈퇴 5.전체회원조회 etc.서비스 종료");
			int menu = sc.nextInt();
			flag = Choice(menu, svc);
		}
		System.out.println("프로그램 종료");

	}

	private static boolean Choice(int menu, Service svc) {
		
		switch (menu) {
		case 1:

			SignUp(svc);
			
			break;
		case 2:
			logIn(svc);
			break;
		case 3:
			Edit(svc);
			break;
		case 4:
			resign(svc);
			break;
		case 5:
			view(svc);
			break;

		default:
			return false;

		}
		return true;
	}

	private static void view(Service svc) {
		svc.viewMembers();
		
	}

	private static void resign(Service svc) {
		svc.resign();
		
	}

	private static void Edit(Service svc) {
		Scanner sc = new Scanner(System.in);
		String nick;
		String pwd;
		System.out.println("변경할 닉네임 입력 >");
		nick = sc.next();
		System.out.println("변경할 비밀번호 입력 >");
		pwd = sc.next();
		if(svc.edit(nick,pwd)) {
			
		}else{
			Edit(svc);
		};
		
	}

	private static void logIn(Service svc) {
		Scanner sc = new Scanner(System.in);
		String id;
		String pwd;
		System.out.println("아이디 입력 >");
		id = sc.next();
		System.out.println("비밀번호 입력 >");
		pwd = sc.next();
		if (svc.login(id, pwd)) {
		} else {
			System.out.println("아이디, 비밀번호 확인하여 다시 입력바람");
			logIn(svc);
		}
		
	}

	private static void SignUp(Service svc) {
		Scanner sc = new Scanner(System.in);
		String id;
		String pwd;
		String nick;
		System.out.println("4글자 이상의 아이디 입력 >");
		id = sc.next();
		System.out.println("5글자 이상의 비밀번호 입력 >");
		pwd = sc.next();
		if (svc.validation(id, pwd)) {
			System.out.println("닉네임 입력");
			nick = sc.next();
			svc.register(id, pwd, nick);
		} else {
			System.out.println("아이디, 비밀번호 확인하여 다시 입력바람");
			SignUp(svc);
		}
		
	}

}
