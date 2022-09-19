package list.webservice;

import java.util.ArrayList;

public class WebService  implements Serviec{
	private MySQL mysql;
	private Oracle oracle;

	public WebService() {
		mysql = new MySQL();
		oracle = new Oracle();
	}

	@Override
	public void register(int dbms, Member member) {
		boolean isOk =dbms>1 ? 
				oracle.insert(member) : mysql.insert(member);
		System.out.println("회원가입 "+(isOk ? "성공":"실패"));
		
	}
	@Override
	public void login(int dbms, Member member) {
		boolean isOk =dbms>1 ? 
				oracle.select(member) : mysql.select(member);
		System.out.println("로그인"+(isOk?"완료":"실패"));
	}

	public void edit(int dbms, Member member) {
		boolean isOk =dbms>1 ?
				oracle.update(member) : mysql.update(member);
		System.out.println("회원수정"+(isOk?"완료":"실패"));
	}

	@Override
	public void resign(int dbms, String email) {
		boolean isOk =dbms>1 ?
				oracle.delete(email) : mysql.delete(email);
		System.out.println("회원탈퇴"+(isOk?"완료":"실패"));
		
	}

	@Override
	public ArrayList<Member> listResult(int db) {
		return db>1 ? oracle.selectList():mysql.selectList();
	}

	@Override
	public Member Search(int db, String email) {
		return db>1 ? oracle.select(email):mysql.select(email);
	}

}
