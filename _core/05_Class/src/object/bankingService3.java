package object;

class BankAccount3 {
	String owner;
	int accNum;
	int deposit;
	//getters, setters 만든 후 필요한 메서드 만드시면 됨
	// window 단축키 : 알트+ 쉬프트+s > r >+알트+ a(모두선택) > 알트 + r(생성)
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getAccNum() {
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

public class bankingService3 {
	public static void main(String[] args) {

	}
}
