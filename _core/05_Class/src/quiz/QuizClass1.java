package quiz;
class Pet{
	String nick = "popo";
	int age = 2;
	String breeds="cat";
	void sound() {
		System.out.println("냐옹~");
	}
	int getOlder() {
		age++;
		return age;
	}
	void getInfo() {
		System.out.println("품종 :"+breeds);
		System.out.println("이름 :"+nick);
		System.out.println("나이 :"+age);
	}
}

public class QuizClass1 {

	public static void main(String[] args) {
		// 클래스 pat 생성하기
		//pet에 age, name ,breeds 멤버변수 초기화
		//펫에 void sound() 메서드 생성
		//펫에 getOlder()메서드 생성 age 1씩 증가 후 리턴
		//각 변수 값과 age의 증가를 출력
		Pet mypet = new Pet();
		mypet.sound();
		int age=mypet.getOlder();
		mypet.getInfo();
		

	}

}
