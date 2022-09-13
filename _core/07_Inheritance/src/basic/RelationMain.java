package basic;

public class RelationMain {
//상속
	// 상위의 개념을 재활용 재사용을 할수 있다

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println("---------------------------");
		Student std = new Student();
		std.setTelNum(123456789);
		std.setName("choi");
		std.setDept("IT");
		std.setAddr("seoul");
		std.setSubjects(new String[] { "HTML", "CSS", "JS", "JAVA" });
		std.printInfo();
		std.printSubjects();
		System.out.println("---------------------------");

		Professor pf = new Professor();
		pf.setTelNum(35454);
		pf.setName("이교수");

		Staff staff = new Staff();
		staff.setTelNum(12315);
		staff.setName("최스탭");

		Person newbee = new Student();// ??
	}

}
