package list.webservice;

import java.util.ArrayList;

public class Oracle implements DataBase{
	private ArrayList<Member> members;
	public Oracle() {
		members = new ArrayList<>();
	}
	@Override
	public boolean insert(Member member) {
		
		return false;
	}
	@Override
	public boolean select(Member member) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean update(Member member) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean delete(String email) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public ArrayList<Member> selectList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Member select(String email) {
		// TODO Auto-generated method stub
		return null;
	}
}
