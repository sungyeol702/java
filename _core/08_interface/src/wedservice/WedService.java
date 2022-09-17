package wedservice;

import java.util.Scanner;

public class WedService implements Service {

	DataBase dbms;
	boolean result;
	public WedService() {}
	public WedService(int db) {
		dbms = db== 1? new MySQL() :new Oracle();
	}
	@Override
	public boolean validation(String id, String pwd) {
		System.out.println("회원가입 서비스 요청");
		return dbms.insert(id,pwd) ? true:false;
	}
	@Override
	public void register(String id, String pwd,String nick)  {
		System.out.println("회원가입" + (dbms.insert2(id,pwd,nick) ? "완료": "실패"));
		
	}

	@Override
	public boolean login(String id, String pwd) {
		result=dbms.select(id,pwd);
		System.out.println("로그인 서비스");
		System.out.println("로그인"+ (result ? "완료":"실패"));
		return result ?true : false;
	
	}

	@Override
	public boolean edit(String nick, String pwd) {
		result = dbms.update(nick,pwd);
		System.out.println("회원 정보 수정 서비스");
		System.out.println("회원 정보 수정"+ (result ?"성공":"실패"));
		return result ? true: false;
	}

	@Override
	public void resign() {
		System.out.println("회원 탈퇴 서비스");
		System.out.println("탈퇴"+(dbms.delete()?"완료":"실패"));
		
	}
	@Override
	public void viewMembers() {
		System.out.println("회원 리스트 서비스");
		dbms.MembersList();
		
	}
	
	

}
