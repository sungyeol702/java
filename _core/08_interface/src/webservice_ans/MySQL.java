package webservice_ans;

public class MySQL implements DataBase {
	private Member[] members;
	private int LastCount;

	public MySQL() {
		members = new Member[3];
		LastCount = 0;

	}

	@Override
	public boolean insert(Member member) {
		if (LastCount < members.length) {// 가입한 사람의 수가 배열길이 보다 작다
			if (hasEmail(member.getEmail())) {
				members[indexWhere()] = member;
				LastCount++;
				return true;
			} else {
				System.out.println("중복된 이메일이 존재합니다");
			}

		} else {
			System.out.println("회원가입 가능인원을 초과하였습니다");
		}
		return false;
	}

	private int indexWhere() {
		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) {
				return i;
			}
		}
		return -1;// -1,EOF, 예외적 상황, 에러의 의미 값으로 많이 사용,
	}

	private boolean hasEmail(String email) {
		for (Member member : members) {
			if (member != null) {
				if (member.getEmail().equals(email)) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public boolean select(Member member) {
		for (Member mb : members) {
			if (mb != null) {
				if (member.getEmail().equals(mb.getEmail()) && member.getPwd().equals(mb.getPwd())) {
					return true;
				}
			}
		}
		System.out.println("아이디 혹은 패스워드가 틀립니다");
		return false;
	}

	@Override
	public boolean update(Member member) {

		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				if (members[i].getEmail().equals(member.getEmail())) {
					members[i] = member;
					return true;
				}
			}
		}
		System.out.println("이메일이 존재하지 않습니다");
		return false;
	}

	@Override
	public boolean delete(String email) {

		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				if (members[i].getEmail().equals(email)) {
					members[i] = null;
					LastCount--;
					return true;
				}
			}
		}
		System.out.println("이메일이 존재하지 않습니다");
		return false;
	}

	@Override
	public Member[] selectList() {
		return hasMember() ? members : null;
	}

	private boolean hasMember() {
		for (Member member : members) {
			if (member != null) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Member select(String email) {
		for (Member member : members) {
			if (member != null) {
				if (email.equals(member.getEmail())) {
					return member;
				}
			}
		}
		return null;
	}

}
