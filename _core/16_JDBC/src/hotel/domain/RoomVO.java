package hotel.domain;

public class RoomVO {
	private String rno;
	private String guset_name;
	private String guset_tel;
	private int guset_age;
	private int guset_gen;
	private int is_empty;
	private String check_in_time;
	private String check_out_time;

	// 입실
	public RoomVO(String rno, String guset_name, String guset_tel, int guset_age, int guset_gen, int is_empty) {
		this(rno, guset_name, guset_tel, guset_age, guset_gen);
		this.is_empty = is_empty;
	}

	// 객실조회
	public RoomVO(String rno, int is_empty) {
		this.rno = rno;
		this.is_empty = is_empty;
	}

	// 객실상세조회
	public RoomVO(String rno, String guset_name, String guset_tel, int guset_age, int guset_gen,int is_empty, String check_in_time,
			String check_out_time) {
		this(rno, guset_name, guset_tel, guset_age, guset_gen,is_empty);
		this.check_in_time = check_in_time;
		this.check_out_time = check_out_time;
		
	}

	// 투숙객조회
	public RoomVO(String rno, String guset_name, String guset_tel, int guset_age, int guset_gen) {
		this.rno = rno;
		this.guset_name = guset_name;
		this.guset_tel = guset_tel;
		this.guset_age = guset_age;
		this.guset_gen = guset_gen;
	}

	// 퇴실
	public RoomVO(String rno, String check_out_time) {
		this.rno = rno;
		this.check_out_time = check_out_time;
	}

//	public RoomVO(String rno, String tel) {
//		this.rno = rno;
//		this.guset_tel = tel;
//	}
	public String getRno() {
		return rno;
	}

	public void setRno(String rno) {
		this.rno = rno;
	}

	public String getGuset_name() {
		return guset_name;
	}

	public void setGuset_name(String guset_name) {
		this.guset_name = guset_name;
	}

	public String getGuset_tel() {
		return guset_tel;
	}

	public void setGuset_tel(String guset_tel) {
		this.guset_tel = guset_tel;
	}

	public int getGuset_age() {
		return guset_age;
	}

	public void setGuset_age(int guset_age) {
		this.guset_age = guset_age;
	}

	public int getGuset_gen() {
		return guset_gen;
	}

	public void setGuset_gen(int guset_gen) {
		this.guset_gen = guset_gen;
	}

	public int getIs_empty() {
		return is_empty;
	}

	public void setIs_empty(int is_empty) {
		this.is_empty = is_empty;
	}

	public String getCheck_in_time() {
		return check_in_time;
	}

	public void setCheck_in_time(String check_in_time) {
		this.check_in_time = check_in_time;
	}

	public String getCheck_out_time() {
		return check_out_time;
	}

	public void setCheck_out_time(String check_out_time) {
		this.check_out_time = check_out_time;
	}

	@Override
	public String toString() {
		return "RoomVO [rno=" + rno + ", guset_name=" + guset_name + ", guset_tel=" + guset_tel + ", guset_age="
				+ guset_age + ", guset_gen=" + (char) guset_gen + ", is_empty=" + (is_empty<1? "빈방":"사용중") + ", check_in_time=" + check_in_time
				+ ", check_out_time=" + check_out_time + "]";
	}

}
