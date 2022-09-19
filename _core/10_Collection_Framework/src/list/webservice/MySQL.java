package list.webservice;

import java.util.ArrayList;

public class MySQL implements DataBase {
	private ArrayList<Member> members;

	public MySQL() {
		members = new ArrayList<>();
		;
	}

	@Override
	public boolean insert(Member member) {
		if (hasEmail(member.getEmail())) {
			members.add(member);
			return true;
		} else {
			System.out.println("중복된 이메일이 존재합니다");
			return false;
		}

	}

	private boolean hasEmail(String email) {
		if (members.size() > 0) {
			for (Member member : members) {
				if (member.getEmail().equals(email)) {
					return false;
				}
			}
		} else {
			return true;
		}
		return true;
	}

	@Override
	public boolean select(Member member) {
		for (Member mb : members) {
				if (member.getEmail().equals(mb.getEmail()) && member.getPwd().equals(mb.getPwd())) {
					return true;
				}
		}
		System.out.println("아이디 혹은 패스워드가 틀립니다");
		return false;
	}

	@Override
	public boolean update(Member member) {

		for (int i = 0; i < members.size(); i++) {
				if (members.get(i).getEmail().equals(member.getEmail())) {
					members.set(i,member);
					return true;
				}
		}
		System.out.println("이메일이 존재하지 않습니다");
		return false;
	}

	@Override
	public boolean delete(String email) {
		for (int i = 0; i < members.size(); i++) {
				if (members.get(i).getEmail().equals(email)) {
					members.remove(i);
					return true;
				}
		}
		System.out.println("이메일이 존재하지 않습니다");
		return false;
	}

	@Override
	public ArrayList<Member> selectList() {
		return hasMember() ? members : null;
	}

	private boolean hasMember() {
		
			if (members.size() == 0) {
				return false;
			}
		
		return true;
	}

	@Override
	public Member select(String email) {
		for (Member member : members) {
				if (email.equals(member.getEmail())) {
					return member;
				}
			
		}
		return null;
	}

}
