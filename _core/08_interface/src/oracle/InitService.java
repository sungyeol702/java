package oracle;

import java.util.Scanner;

public class InitService {
	
	private WebService wsvc;
	private boolean flag;
	private Scanner sc;
	public InitService() {
		wsvc = new WebService();
		menuServic();
	}
	
	private void menuServic() {
		flag=true;
		sc= new Scanner(System.in);
		while (flag) {
			System.out.println("서비스 선택");
			System.out.println("1.회원가입 2.로그인 3.회원수정 4. 회원탈퇴 5.회원리스트 6.회원조회 Etc.DB선택");
			int svc = sc.nextInt();
			switch (svc) {
			case 1:
				wsvc.register( getRegInfo());
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
			
				break;
			case 5:
			
				
				break;
			case 6:
				
				break;

			default:
				flag = false;
				break;
			}
		}
		
	}

	private Member getRegInfo() {
		System.out.println("회원가입을 시작합니다");
		System.out.println("Email 입력");
		String email = sc.next();
		System.out.println("PWD 입력");
		String pwd = sc.next();
		System.out.println("NickName 입력");
		String nick = sc.next();
		return new Member(email, pwd, nick);
	}
}
