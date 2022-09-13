package abstracts;

public class Cooling {

	public static void main(String[] args) {
		// 냉장고 제작을 위한 시작
		// 추상화를 해보자!
		// 김치냉장고 딤채를 만들어보자 => 냉장고이기전에 전자제품이어야 함

		// 다형성
		KimchiRef dimchae = new Dimchae();
		dimchae.setButton(1);
		System.out.println(dimchae.getButton());
		System.out.println(dimchae.getFeature());
		// 추상클래스는 구현체를 목표로 하지 않는다  인스턴스를 할 수 없다
		// 익명 내장 클래스 자체를 실행하기 위함 KimchiRef kimchiRef = 없어도 됨
		KimchiRef kimchiRef = new KimchiRef() { // 추상클래스는 주소값을 갖을수 없기때문에 실행을 하고자하는 클래스를 빌려 실행을 함
												// 
			int i =1;
			@Override
			void buttonColor(String color) {
				// TODO Auto-generated method stub

			}
		};

		
	}

}
