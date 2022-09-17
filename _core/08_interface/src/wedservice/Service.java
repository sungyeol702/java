package wedservice;

public interface Service {
	boolean validation(String id, String pwd);
	void register(String id, String pwd, String nick);
	boolean login(String id, String pwd);
	boolean edit(String nick, String pwd);
	void resign();
	void viewMembers();
	
	
	
}
