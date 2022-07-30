package quiz;

import java.util.Scanner;

class Shop1 {
	//클래스 내부에는 정적인역할을하는 멤버변수와 동적인역할을 하는 메서드가 있다
	//정적인역할과 동적인역할을 동시에하는 생성자가 있다
	//생성자는 너무 당연한것이기 때문에 디폴트로 자동적으로 입력되어있음
	//생성자는 반드시(99%) public접근제한자로 선언을 해줘야함
	public Shop1() {//생성자라는 애들 defult 생성자
	//super(); // super은 생략을해도 됨
	}
	String[] item;

	void setItem(String[] item) {
		this.item = item;
	}

	void viewItem() {
		for (int i = 0; i < item.length; i++) {
			System.out.print((i + 1) + "번:" + item[i]+" ");
		}
		System.out.println();
	}
	String getItem(int i) {
		return item[i];
	}

}

class Shop2 {
	String[] item;

	void setItem(String[] item) {
		this.item = item;
	}

	void viewItem() {
		for (int i = 0; i < item.length; i++) {
			System.out.print((i + 1) + "번:" + item[i]+" ");
		}
		System.out.println();
	}
	String getItem(int i) {
		return item[i];
	}
}

class Shop3 {
	String[] item;

	void setItem(String[] item) {
		this.item = item;
	}

	void viewItem() {
		for (int i = 0; i < item.length; i++) {
			System.out.print((i + 1) + "번:" + item[i]+" ");
		}
		System.out.println();
	}
	String getItem(int i) {
		return item[i];
	}
}

public class QuizClass5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shop1 sh1 = new Shop1();
		Shop2 sh2 = new Shop2();
		Shop3 sh3 = new Shop3();
		sh1.setItem(new String[] {"연필", "공책","지우개"});
		sh2.setItem(new String[] {"빵", "과자","음료수"});
		sh3.setItem(new String[] {"티", "바지","모자"});
		
		while (true) {
		System.out.println("메뉴-> 1:아이템 리스트, 2: 아이템 구입, etc: 상점 나가기");
		int oder = sc.nextInt();
		if (oder == 1) {
			System.out.println("확인할 상점 선택 -> 1번상점, 2번상점, 3번상점");
			oder = sc.nextInt();
			switch (oder) {
			case 1:
				sh1.viewItem();
				break;
			case 2:
				sh2.viewItem();
				break;
			case 3:
				sh3.viewItem();
				break;

			default:
				break;
			}
		} else if(oder==2){
			System.out.println("구매할 상점 선택 -> 1번상점, 2번상점, 3번상점");
			oder = sc.nextInt();
			switch (oder) {
			case 1:
				sh1.viewItem();
				System.out.println("구매품목번호 선택 -> 1번, 2번, 3번");
				oder = sc.nextInt();
				System.out.println(sh1.getItem(oder-1)+"구입완료");
				break;
			case 2:
				sh2.viewItem();
				System.out.println("구매품목번호 선택 -> 1번, 2번, 3번");
				oder = sc.nextInt();
				System.out.println(sh2.getItem(oder-1)+"구입완료");
				break;
			case 3:
				sh3.viewItem();
				System.out.println("구매품목번호  선택 -> 1번, 2번, 3번");
				oder = sc.nextInt();
				System.out.println(sh3.getItem(oder-1)+"구입완료");
				break;

			default:
				break;
			}
		}else {
			break;
		}
		}
		System.out.println("프로그램 종료");
	}

}
