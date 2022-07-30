package quiz.bankTC;

public class Bank {
	private User[] users;

	public Bank(int cnt) {
		users = new User[cnt];
	}

	public User[] getUsers() {
		return users;
	}

	public void setUsers(User[] users) {
		this.users = users;
	}

	public void saving(int money, String userName) {
		User orderUser = null;
		for (int i = 0; i < users.length; i++) {
			if (users[i].getName().equals(userName)) {
				orderUser = users[i];
				break;
			}
		}
		if(orderUser != null) {
		if (orderUser.getCashAmount() > money) {
			orderUser.setCashAmount(orderUser.getCashAmount() - money);
			orderUser.getAccount().setBalance(orderUser.getAccount().getBalance() + money);
			System.out.println("입금완료");
			System.out.println(orderUser.toString());
			System.out.println(orderUser.getAccount().toString());
		} else {
			System.out.println("보유한 현금이 부족합니다");
		}
		}else {
			System.out.println("없는고객입니다.");
		}
	}

//	public void saving(int money, User user) {
//		// TODO Auto-generated method stub
//		if (money <= user.getCashAmount()) {
//			user.getAccount().setBalance(user.getAccount().getBalance() + money);
//			System.out.println("입금완료");
//			user.setCashAmount(user.getCashAmount() - money);
//			System.out.println(user.toString());
//			System.out.println(user.getAccount().toString());
//		} else {
//			System.out.println("보유한 현금이 부족합니다");
//		}
//	}
	public void withderaw(int money, String userName) {
		User orderUser = null;
		for (int i = 0; i < users.length; i++) {
			if (users[i].getName().equals(userName)) {
				orderUser = users[i];
				break;
			}
		}
		if(orderUser!=null) {
		if (orderUser.getAccount().getBalance() > money) {
			orderUser.getAccount().setBalance(orderUser.getAccount().getBalance() - money);
			orderUser.setCashAmount(orderUser.getCashAmount() + money);
			System.out.println("출금완료");
			System.out.println(orderUser.toString());
			System.out.println(orderUser.getAccount().toString());
		} else {
			System.out.println("통장잔액부족");
		}
		}else {
			System.out.println("없는 고객입니다.");
		}

	}

//	public void withderaw(int money, User user) {
//		if (money <= user.getAccount().getBalance()) {
//
//			user.getAccount().setBalance(user.getAccount().getBalance() - money);
//			System.out.println("출금완료");
//			user.setCashAmount(user.getCashAmount() + money);
//			System.out.println(user.toString());
//			System.out.println(user.getAccount().toString());
//		} else {
//			System.out.println("잔액부족");
//		}
//	}
	public void transfer(int money, String fromUser, String toUser) {
		User from=null;
		User to=null;
		
		for (User user : users) {
			if (user != null) {
				if (user.getName().equals(fromUser)) {
					from =user;
				}if(user.getName().equals(toUser)) {
					 to =user;
				}
			}
		}
		if(from !=null && to !=null) {
		if(from.getAccount().getBalance()> money) {
			from.getAccount().setBalance(from.getAccount().getBalance()-money);
			to.getAccount().setBalance(to.getAccount().getBalance()+money);
			System.out.println("이체완료");
			System.out.print(from.toString()+"\t");
			System.out.println(from.getAccount().toString());
			System.out.print(to.toString()+"\t");
			System.out.println(to.getAccount().toString());
		}else {
			System.out.println("통장잔액이 부족합니다");
		}
		}else {
			System.out.println("없는고객입니다 성함을 다시 확인해주세요");
		}

	}

	public void userInfo() {
		for (User user : users) {
			if (user != null) {
				System.out.print(user.toString() + "\t");
				System.out.println(user.getAccount().toString());
			}
		}

	}

//	public void transfer(int money, User from, User to) {
//		if (money <= from.getAccount().getBalance()) {
//			from.getAccount().setBalance(from.getAccount().getBalance() - money);
//			to.getAccount().setBalance(to.getAccount().getBalance() + money);
//		} else {
//			System.out.println("잔액부족");
//		}
//
//	}

}
