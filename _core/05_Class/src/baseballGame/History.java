package baseballGame;

public class History {
	private User user;
	private int time;
	private int count;
	
	

	public History(User user, int count , int time ) {
		
		this.user = user;
		this.count = count;
		this.time = time;
	
	}

	@Override
	public String toString() {
		return "History [user=" + user.getName() +", age="+user.getAge()+ ", count=" + count + ", time="+time+ "초 ]";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
