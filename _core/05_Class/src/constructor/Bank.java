package constructor;



public class Bank {

	public static void main(String[] args) {
		BankAccount myBA = new BankAccount("최성열",1234, 0);
		System.out.println(myBA.getAccNum());
		
		BankAccount anonyBA= new BankAccount(1233, 1000);
		System.out.println(anonyBA.getAccNum());
	
		// myBA.accNum; private 접근제한자는 외부에서 접근 불가능
	}

}
