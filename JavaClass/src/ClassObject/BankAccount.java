package ClassObject;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class BankAccount {

	public int userId;
	public String userName;
	public int deposite;
	public int withdraw;
	public int balEnquary;

	public BankAccount(int userId, String userName, int deposite, int withdraw, int balEnquary) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.deposite = deposite;
		this.withdraw = withdraw;
		this.balEnquary = balEnquary;
	}

	public BankAccount() {
		super();
	}

	public void deposite(int deposite, BankAccount banAcc) {
		banAcc.balEnquary = banAcc.balEnquary + deposite;
		System.out.println("The Total Balance Amount:" + banAcc.balEnquary);
	}

	public void withDrawal(int withdraw, BankAccount banAcc) {
		banAcc.balEnquary = banAcc.balEnquary - withdraw;
		System.out.println("The Total Balance Amount:" + banAcc.balEnquary);
	}

	public static void main(String[] args) {

		List<BankAccount> users = new ArrayList<BankAccount>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the No of User:");
		int NoOfAcc = scan.nextInt();
		int condition = 0;
	
		for (int i = 0; i < NoOfAcc; i++) {
			System.out.println("Enter the userId:");
			int userId = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter the userName:");
			String userName = scan.nextLine();
			System.out.println("Enter the Deposite Amount:");
			int deposite = scan.nextInt();
			System.out.println("Enter the Last Withdrawal Amount:");
			int withdraw = scan.nextInt();
			System.out.println("Enter the Balance Amount:");
			int balEnquary = scan.nextInt();
			BankAccount banAcc = new BankAccount(userId, userName, deposite, withdraw, balEnquary);
			users.add(banAcc);
		}

		System.out.printf("%s %10s %10s %10s %10s", "UserId", "UserName ", "DepositeAmount ", "WithdrawalAmount ",
				"BalanceEnquary");
		for (int j = 0; j < users.size(); j++) {
			System.out.printf("\n%s %10s %10s %15s %15s", users.get(j).userId, users.get(j).userName,
					users.get(j).deposite, users.get(j).withdraw, users.get(j).balEnquary);
		}
		do {
			System.out.println("\nEnter the UserNo:");
			int UserNo = scan.nextInt();
			BankAccount banAccount = users.get(UserNo - 1);

			System.out.println("Enter the value to 1 for Deposite or 2 for Withdraw");
			int depoWith = scan.nextInt();
			switch (depoWith) {
			case 1:
				System.out.println("Enter the Deposite Amount:");
				int deposite = scan.nextInt();
				banAccount.deposite(deposite, banAccount);
				break;
			case 2:
				System.out.println("Enter the Withdrawal Amount:");
				int withdraw = scan.nextInt();
				banAccount.deposite(withdraw, banAccount);
				break;
			}
			System.out.printf("%s %10s %10s %10s %10s", "UserId", "UserName ", "DepositeAmount ", "WithdrawalAmount ",
					"BalanceEnquary");
			for (int j = 0; j < users.size(); j++) {
				System.out.printf("\n%s %10s %10s %15s %15s", users.get(j).userId, users.get(j).userName,
						users.get(j).deposite, users.get(j).withdraw, users.get(j).balEnquary);
			}
			System.out.println("\nPress 1 to Continue: else 0 to Exist");
			condition = scan.nextInt();
		} while (condition == 1);

	}
}
