package constructor;

class Instance1 {
	int i;
	String s;
	boolean flag;

	public Instance1() { 
		// 디폴트 생성자는 생략되어 있다
	}
	// 알트 + 쉬프트 + s=> 제너레이터 컨스트럭터 유징 필드
	
	
	
	//생성자란 클래스의 이름과 같으며 정적인 역할과 동적인 역할을 함
	//정적인 것은 클래스의 이름과 같으며 생성을 목적을 갖고 코드적으로 표현 해둔 것이고
	//동적인 것은 객체 : 인스턴스를 생성하기 위해 메서드 형태를 갖고 있기 때문
	//메서트의 형태를 갖고 있지만 리턴타입이 없는 이유는 객체를 생성하는 역할이 이미 주어져 있으므로 다른 역할을 할 수 없음
	// 생성자 오버로딩 : 객체나 인스턴스 생성시점에 역할을 부여 할 수있음
	//오버로딩을 사용하는 이유는 객체 생성시점에 특정 기능을 부여하기 위함(예 캐릭터생성시 장비 장착 상태로 로딩)
	public Instance1(int i, String s, boolean flag) {
		
		this.i = i;
		this.s = s;
		this.flag = flag;
	}
	

}

public class Cons {

	public static void main(String[] args) {
		Instance1 i1 = new Instance1();

	}

}
