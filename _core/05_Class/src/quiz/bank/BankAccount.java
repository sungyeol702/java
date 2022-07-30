package quiz.bank;

//추상화
//은행계좌 정보 > bankAccount class > 계좌는 소유자 정보를 갖고 있지 않음, 잔액만
//사람(user)는 은행계좌를 갖고 있다> 이름, 현금보유액, 은행계좌
//사람은 은행원을 통해 은행계좌를을 활용한다(입금, 출금)
public class BankAccount {
	private int balance; // 잔액

	public void info() {// 잔액확인
		System.out.println("통장잔액:" + balance);
	}

	public void save(int money) {// 입금
		balance += money;
	}

	public int withdraw(int money) {// 출금
		if (money > balance) {
			System.out.println("잔액부족");
			return 0;
		} else {
			balance -= money;
			System.out.println("출금완료");
			return money;
		}
	}

}
