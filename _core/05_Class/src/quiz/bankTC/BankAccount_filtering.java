package quiz.bankTC;

//추상화
//은행계좌 정보 > bankAccount class > 계좌는 소유자 정보를 갖고 있지 않음, 잔액만
//사람(user)는 은행계좌를 갖고 있다> 이름, 현금보유액, 은행계좌
//사람은 은행원을 통해 은행계좌를을 활용한다(입금, 출금)
public class BankAccount_filtering {
	private int balance; // 잔액

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void saving(int cash) {

		this.balance+=cash;
	}

	public int withderaw(int cash) {
		if(cash<=this.balance) {
			this.balance-=cash;
			System.out.println("출금완료");
			return cash;
		}else {
			System.out.println("계좌금액부족");
			return 0;
		}
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}
	
	

	
}
