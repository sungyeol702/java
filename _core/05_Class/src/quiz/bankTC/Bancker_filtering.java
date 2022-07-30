package quiz.bankTC;

import java.util.Scanner;

public class Bancker_filtering {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		User me = null;
		User you = null;

		BankAccount acc1 = null;
		BankAccount acc2 = null;

		int menu = 0;
		boolean flag = true;
		int money = 0; // 동일한 변수가 재사용될때는 변수를 위에다 선언하는것을 추천
		while (flag) {
			System.out.println("\n===========뱅킹 시스템=============");
			System.out.println("1:계좌개설 / 2.입금 / 3.출금 / etc.종료");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				acc1 = new BankAccount();
				me = new User("choi", 10000);
				me.setAccount(acc1);
				System.out.println("계좌계설완료");
				System.out.println(me.toString());
				System.out.println(me.getAccount().toString());
				acc2 = new BankAccount();
				you = new User("you", 50000);
				me.setAccount(acc2);
				System.out.println("계좌계설완료");
				System.out.println(me.toString());
				System.out.println(me.getAccount().toString());
				break;
			case 2:
				System.out.println("입금할 금액 >");
				money = sc.nextInt();
				me.getAccount().saving(me.myMoneySave(money));
				
				System.out.println(me.toString());
				System.out.println(me.getAccount().toString());
				break;
			case 3:
				System.out.println("출금할 금액 >");
				money = sc.nextInt();
				me.setCashAmount(me.getAccount().withderaw(money));
				System.out.println(me.toString());
				System.out.println(me.getAccount().toString());
				break;

			default:
				flag = false;
				System.out.println("==========뱅킹시스템 종료==========");
				break;
			}

		}
		System.out.println("프로그램 종료");

	}

}
