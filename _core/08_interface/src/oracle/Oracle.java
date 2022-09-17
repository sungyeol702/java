package oracle;

import java.util.ArrayList;

public class Oracle implements Date {
private ArrayList<Member> members;

	public Oracle() {
		System.out.println("Oracle 데이터베이스 생성");
		members = new ArrayList<>();
	}

	public boolean insert(Member regInfo) {
		for (Member member : members) {
			if(member != null) {
				if(member.getId().equals(regInfo.getId())) {
					return false;
				}
			}
		}
		
		return true;
		
	}
}
