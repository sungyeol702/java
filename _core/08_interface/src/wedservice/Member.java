package wedservice;

public class Member {
	private String id;
	private String pwd;
	private String nick;
	private int grade;
	public Member(String name, String pwd, String nick, int grade) {
		this.id = name;
		this.pwd = pwd;
		this.nick = nick;
		this.grade= grade;
	}
	public String getId() {
		return id;
	}
	public void setId(String name) {
		this.id = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", nick=" + nick + ", grade=" + grade + "]";
	}
	
}
