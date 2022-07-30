package object;

class Pet { // 클래스는 코드일 뿐 분류체계를 통해서 만든 코드, 목적이 있기 때문에 만듬
	String nick; // class의 정적인 정보(상태값 : 변수에 저장)
	int age;

	// 상태값을 변경시킬 수 있는 동적 존재 : 메서드 활용
	void sound(String nick) {
		System.out.println(nick + "은 소리를 낸다");
	}

	void initialoze(String nickName, int petAge) {
		nick = nickName;
		age = petAge;
	}

	void getInfo() {
		System.out.println("강아지이름 :" + nick);
		System.out.println("강아지나이 :" + age);

	}

	int getOld() {
		age++;
		return age;
	}

	boolean die() {
		nick = "";
		age =0;
		return false;

	}
}

public class Person {// person 이라는 개념을 만들기 위한 분류
	String name;
	int age;

	void speak() {
		System.out.println("사람은 말을 한다");
	}

	public static void main(String[] args) {
		// 인스턴스 만들기 => 객체를 사용할 수 있는 상태로 만드는 것
		// 클래스명을 데이터 타입으로 쓴다
		// 생성하면 주소체계로 힙영역에 존재 // 레퍼런스타입
		Pet myPet = new Pet();
		myPet.age = 1;
		myPet.nick = "멍멍이";// pet이라는 객체에 멍멍이를 초기화
		myPet.sound("멍멍이");// pet이라는 객체에 멍멍이를 설정하여 동작하게함

		Pet yourPet = new Pet(); // 새로운 주소값으로 새롭게 생성
		// yourPet.nick = "뿌동";
		// yourPet.age=1;
		yourPet.initialoze("멍", 1);
		// System.out.println(yourPet.nick+ " " +yourPet.age);
		yourPet.getInfo();
		int age = yourPet.getOld();// 한살 늙음
		yourPet.getInfo();
		yourPet.die();
		yourPet.getInfo();
	}

}
