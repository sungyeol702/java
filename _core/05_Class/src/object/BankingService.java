package object;

class BankAccount {
	String owner;
	String accNum;
	int deposit;

	void creation(String name, String accNum, int money) {
		owner = name;
		this.accNum = accNum;
		deposit = money;
	}

	 void accountSituation() {
		System.out.println("예금주:"+ owner);
		System.out.println("계좌번호:"+ accNum);
		System.out.println("현재 잔액 :"+ deposit);
	}

	void saving(int money) {
		deposit+=money;
	}

	void withdrawal(int money) {
		if (money < deposit) {
			deposit -=money;
		}else {
			System.out.println("잔액이 부족합니다.");
		}
	}
}

public class BankingService {

	public static void main(String[] args) {
		// BankAccount 클래스를 정의한다
		// BankAccount에는 예금주(owner),계좌번호(accNum), 계좌잔액(deposit),
		// 계좌현황조회, 입금, 출금을 할 수 있다(메서드)

		BankAccount myAccount = new BankAccount();
		myAccount.creation("최성열","123-45-789", 1000);
		myAccount.accountSituation();
		myAccount.saving(1000);
		myAccount.withdrawal(500);
		myAccount.accountSituation();
		myAccount.withdrawal(80000);
		myAccount.accountSituation();
	}
//정보시스템 구축 4단계
//(요구)분석 설계 구현 테스트
//	5대공학 
//	컴퓨터공학
//	소프트웨어공학
//	정보통신공학
//	게임공학
//	요구공학
}
