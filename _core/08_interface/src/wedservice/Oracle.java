package wedservice;

public class Oracle implements DataBase {
	Member[] members = new Member[10];
	Member loginMember = null;
	public Oracle() {
		System.out.println("Oracle을 선택하셨습니다");
	}
	@Override
	public boolean insert(String id, String pwd) {
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				if (members[i].getId().equals(id)) {
					System.out.println("중복된 아이디 확인");
					return false;
				}
			}
		}
		if (id.length() > 3 && pwd.length() > 4) {
		} else {
			System.out.println("ID or pwd 유효성 검사실패");
			return false;
		}
		System.out.println("MySQL데이터베이스에 유효성검사 성공");
		return true;
	}

	@Override
	public boolean insert2(String id, String pwd, String nick) {
		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) {
				members[i] = new Member(id, pwd, nick, i + 1);
				System.out.println("데이터베이스에서 회원 정보를 입력성공");
				return true;
			}
		}
		System.out.println("회원수 초과");
		return false;
	}

	@Override
	public boolean select(String id, String pwd) {
		for (Member member : members) {
			if (member != null) {
				if (member.getId().equals(id) && member.getPwd().equals(pwd)) {
					System.out.println("데이터베이스에서 회원 정보를 조회하였습니다");
					loginMember = member;
					return true;
				}
			}
		}
		System.out.println("데이터베이스에서 회원 정보를 찾을수 없습니다.");
		return false;
	}

	@Override
	public boolean update(String nick, String pwd) {
		if (loginMember != null) {
			if (pwd.length() > 4) {
				System.out.println("테이터베이스에서 회원 정보를 수정하였습니다");
				System.out.println("변경 전");
				System.out.println(loginMember);
				loginMember.setNick(nick);
				loginMember.setPwd(pwd);
				System.out.println("변경 후");
				System.out.println(loginMember);
				return true;
			} else {
				System.out.println("비밀번호 유효성 검사실패");
				return false;
			}
		}
		System.out.println("테이터베이스에서 로그인된 회원정보가 없습니다");
		return false;
	}

	@Override
	public boolean delete() {
		if(loginMember != null) {
			for (int i = 0; i < members.length; i++) {
				if(members[i]==loginMember) {
					members[i] = null;
					System.out.println("데이터베이스에서 회원 정보를 삭제하였습니다");
					return true;
				}
			}
		}else {
			System.out.println("테이터베이스에서 로그인된 회원정보가 없습니다");
			return false;
		}
		return false;
	}

	@Override
	public void MembersList() {
		int n =0;
		for (Member member : members) {
			if(member!=null) {
				System.out.println(member);
			}else {
				n++;
			}
		}
		System.out.println(n>1? "MySQL 데이터 등록된 회원이 없습니다":"" );
		
		
	}

}
