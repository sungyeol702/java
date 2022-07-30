package quiz.bankTC;

import java.util.Scanner;

public class BankerWorking {
	Scanner sc = new Scanner(System.in);
	private Bank bank;
	private String userName, toUserName;
	private int money = 0, regCount = 0, limit = 0;
	private boolean flag = true;
	// 동일한 변수가 재사용될때는 변수를 위에다 선언하는것을 추천
	// 등록한 카운트

	public BankerWorking() {
		bank = initUserCount();

		while (flag) {
			bankingProcess(printMenu());
		}
		System.out.println("프로그램 종료");
	}

	private void bankingProcess(int menu) {
		switch (menu) {
		case 1:
			makeAccount();

			break;
		case 2:
			deposit();
			
			break;
		case 3:
			withdraw();
			
			break;

		case 4:
			transfer();
			

			break;
		case 5:
			bank.userInfo();

			break;

		default:
			flag = false;
			System.out.println("==========뱅킹시스템 종료==========");
			break;
		}

	}

	private void transfer() {
		System.out.println("이체할 고객이름 >");
		userName = sc.next();
		System.out.println("이체받을 고객이름 >");
		toUserName = sc.next();
		System.out.println("이체할 금액 >");
		money = sc.nextInt();
		bank.transfer(money, userName, toUserName);
		
	}

	private void withdraw() {
		System.out.println("출금할 고객명 입력 >");
		userName = sc.next();
		System.out.println("출금할 금액 >");
		money = sc.nextInt();
		bank.withderaw(money, userName);
		
	}

	private void makeAccount() {
		if (regCount < limit) {
			System.out.println("고객명 입력>");
			userName = sc.next();
			System.out.println("최초입금액 입력>");
			int initBalance = sc.nextInt();
			bank.getUsers()[regCount] = new User(userName, initBalance, new BankAccount());
			regCount++;
		} else {
			System.out.println("고객수 초과");
		}
		
	}

	private void deposit() {
		System.out.println("입금할 고객명 입력 >");
		userName = sc.next();
		System.out.println("입금할 금액 >");
		money = sc.nextInt();
		bank.saving(money, userName);
	}

	private int printMenu() {
		System.out.println("\n====================뱅킹 시스템==========================");
		System.out.println("1:계좌개설 / 2.입금 / 3.출금 / 4.이체 / 5.고객전체조회 / etc.종료");
		System.out.println("--------------------------------------------------------");
		int menu = sc.nextInt();
		return menu;
	}

	private Bank initUserCount() {
		System.out.println("고객 수 입력>");
		limit = sc.nextInt();
		return new Bank(limit);

	}

}
