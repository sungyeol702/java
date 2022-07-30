package quiz.bankTC;

public class User {
	private String name;
	private int cashAmount;
	private BankAccount account;
	
	public User () {
		this.name=null;
		this.cashAmount=0;
	}
	public User(String name) {
		this.name= name;
	}
	
	public User (String name, int cashAmount) {
		this(name);// this생성자 용법
		this.cashAmount =cashAmount;
	}
	
	public User(String name, int cashAmount, BankAccount account) {
		this(name,cashAmount);
		this.account=account;
		//생성자에는 생성만 담당하는 로직
		//따로 부가적인 기능을 수행하려면 메서드를 통해서 기능을 수행할수 있도록 함
		printResult();
	}
	// 클래스의 특징 1 정보의 은닉화
	private void printResult() {
		
		System.out.println("계좌계설완료");
		System.out.println(toString());//this.toString 는 같은위치에 있음
		System.out.println(this.account.toString());
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCashAmount() {
		return cashAmount;
	}
	public void setCashAmount(int cashAmount) {
		this.cashAmount = cashAmount;
	}
	public BankAccount getAccount() {
		return account;
	}
	public void setAccount(BankAccount account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", cashAmount=" + cashAmount + "]";
	}
	
	
		

	

}
