package object;

class BankAccount2 {
	String owner;
	int accNum;
	int deposit;

	void accountSituation() {
		System.out.println("예금주 :"+getOwer());
		System.out.println("계좌번호 :"+getAccNum());
		System.out.println("잔액 :"+getDeposit());
	}

	void saving(int money) {
		deposit += money;
	}

	void withdrawal(int money) {
		if (money < deposit) {
			deposit -= money;
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
// setters
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	
	//getters
	public String getOwer() {
		return this.owner;
	}
	public int getAccNum() {
		return this.accNum;
	}
	public int getDeposit() {
		return this.deposit;
	}
}

public class BankingService2 {

	public static void main(String[] args) {
		// BankAccount 클래스를 정의한다
		// BankAccount에는 예금주(owner),계좌번호(accNum), 계좌잔액(deposit), 세팅하는 메서드
		// 위의 정보를 조회할 수 있는 메서드
		// 계좌현황조회(변경), 입금, 출금을 할 수 있다(메서드)

		BankAccount2 myAccount = new BankAccount2();
		myAccount.setOwner("최성열");
		myAccount.setAccNum(1234);
		myAccount.setDeposit(10000);
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
