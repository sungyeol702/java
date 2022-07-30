package quiz.bank;

public class Bancker {

	public static void main(String[] args) {
		//은행계좌 개설하기 2개 (myBA, urBA)
		
		//잔액 조회 기능 구현
		
		//입금,출금 기능 구현
		User myBA = new User("choi", 100000, new BankAccount());
		User urBA = new User("lee", 50000, new BankAccount());
		myBA.introduce();
		myBA.getAccount().save(myBA.saving(1000));//입금 후 가진금액 차감
		myBA.getAccount().save(myBA.saving(10000000));//가진금액보다 입금금액이 큼
		
		myBA.getAccount().info();//잔액조회
		myBA.withdrawMoney(myBA.getAccount().withdraw(60000));//통잔잔액보다 출금금액이큼
		myBA.withdrawMoney(myBA.getAccount().withdraw(500));
		
		myBA.introduce();
		myBA.getAccount().info();
		
		
	}

}
