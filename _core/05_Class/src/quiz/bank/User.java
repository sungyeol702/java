package quiz.bank;

public class User {
	private String name;
	private int cashAmount;
	private BankAccount account;

	public User(String name, int cashAmount, BankAccount account) {
		this.name = name;
		this.cashAmount = cashAmount;
		this.account = account;
	}

	public void introduce() {
		System.out.println("이름:"+name);
		System.out.println("현찰:"+cashAmount);
		
	}

	public int saving(int money) {// 내가가진금액중에 입금
		if (money > cashAmount) {
			System.out.println("가진금액이부족합니다");
			return 0;
		} else {
			cashAmount -= money;
			return money;

		}

	}

	public BankAccount getAccount() {// 계좌번호 (객체주소값)
		return account;
	}

	public void withdrawMoney(int money) {//출금 후 지갑으로 돈들어옴
		cashAmount +=money;
		
	}

}
