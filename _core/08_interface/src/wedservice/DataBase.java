package wedservice;

public interface DataBase {
	
	boolean insert(String id, String pwd);
	boolean insert2(String id, String pwd,String nick);
	boolean select(String id, String pwd);
	boolean update(String nick, String pwd);
	boolean delete();
	void MembersList();
}
