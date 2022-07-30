package constructor;

public class BankAccount {
	private String owner;// private 내부에서만 부를수있는 선언문
	private int accNum;
	private int deposit;
	int open;

	
	public BankAccount(int accNum, int deposit) {//오버로딩
		this.accNum = accNum;
		this.deposit = deposit;
	}

	public BankAccount(String owner, int accNum, int deposit) {
		this.owner = owner;
		this.accNum = accNum;
		this.deposit = deposit;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	int getAccNum() {
		return accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

}
