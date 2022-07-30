package quiz.bankTC;

public class Bancker_old {

	public static void main(String[] args) {
		User me = new User("choi", 1000);
		User you = new User("you", 10000);
		//은행계좌 개설하기 2개 (myBA, urBA)
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount();
		
		//잔액 조회 기능 구현
		
		me.setAccount(acc1);
		you.setAccount(acc2);
		System.out.println("myBA계좌잔액"+me.getAccount().getBalance());
		System.out.println("urBA계좌잔액"+you.getAccount().getBalance());
		//입금,출금 기능 구현 => setter의 활용 한계점 => 금액을 초기화 시킴
//		myBA.setBalance(10000); 
//		urBA.setBalance(50000);
//		
//		myBA.setBalance(-5000);
//		urBA.setBalance(-20000);
		
		//입금
		me.getAccount().saving(10000);
		you.getAccount().saving(10000);
		//출금
		me.getAccount().withderaw(10000);
		you.getAccount().withderaw(10000);
	}

}
