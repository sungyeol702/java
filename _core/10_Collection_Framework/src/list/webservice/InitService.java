package list.webservice;


import java.util.ArrayList;
import java.util.Scanner;

public class InitService {
	private Scanner sc;
	private boolean flag;
	private WebService websvc;
	
	public InitService() {
		sc = new Scanner(System.in);
		flag = true;
		websvc = new WebService();
		menuService();
	}

	private void menuService() {
		while (flag) {
			System.out.println("데이터 베이스를 선택하세요");
			System.out.println("1.MySQL 2.Oracle Etc.종료");
			int db = sc.nextInt();
			if (db == 1 || db == 2) {
				boolean flag2 = true;
				while (flag2) {
					System.out.println("서비스 선택");
					System.out.println("1.회원가입 2.로그인 3.회원수정 4. 회원탈퇴 5.회원리스트 6.회원조회 Etc.DB선택");
					int svc = sc.nextInt();
					switch (svc) {
					case 1:
						// Member regInfo =getRegInfo();
						websvc.register(db, getRegInfo());
						break;
					case 2:
						websvc.login(db, getLoginInfo());
						break;
					case 3:
						websvc.edit(db, getEditInfo());
						break;
					case 4:
						websvc.resign(db, getEmail(true));
						break;
					case 5:
						// 데이터베이스에서 데이터를 리턴받아
						// 프린트 기능메서드를 정의하여 출력
						MemberList(db);
						break;
					case 6:
						MemberSearch(db);
						break;

					default:
						flag2 = false;
						break;
					}

				}
			} else {
				flag = false;
				System.out.println("프로그램 종료");
			}
		}

	}

	private void MemberSearch(int db) {

		String email = getEmail(false);
		Member member = websvc.Search(db, email);
		if (member != null) {
			System.out.println(member);
		} else {
			System.out.println("등록된 이메일이 없습니다.");
		}

	}

	private void MemberList(int db) {
		ArrayList<Member> members = websvc.listResult(db);
		if (members != null) {
			for (Member member : members) {
					System.out.println(member);
			}
		} else {
			System.out.println("가입한회원이 없습니다");
		}
	}

	private String getEmail(boolean sing) {
		System.out.println("회원" + (sing ? "탈퇴를 시작합니다" : "조회를시작합니다"));
		System.out.println("Email 입력");
		String email = sc.next();

		return email;
	}

	private Member getEditInfo() {
		System.out.println("회원수정을 시작합니다");
		System.out.println("Email 입력>");
		String email = sc.next();
		System.out.println("PWD 입력");
		String pwd = sc.next();
		System.out.println("NickName 입력");
		String nick = sc.next();
		System.out.println("GRAD 입력");
		int grad = sc.nextInt();

		return new Member(email, pwd, nick, grad);
	}

	private Member getLoginInfo() {
		System.out.println("로그인을 시작합니다");
		System.out.println("Email 입력");
		String email = sc.next();
		System.out.println("PWD 입력");
		String pwd = sc.next();

		return new Member(email, pwd);
	}

	private Member getRegInfo() {
		System.out.println("회원가입을 시작합니다");
		System.out.println("Email 입력");
		String email = sc.next();
		System.out.println("PWD 입력");
		String pwd = sc.next();
		System.out.println("NickName 입력");
		String nick = sc.next();

		return new Member(email, pwd, nick, 0);
	}
}
