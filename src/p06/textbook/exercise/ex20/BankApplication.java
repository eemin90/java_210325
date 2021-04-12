package p06.textbook.exercise.ex20;

import java.util.Arrays;
import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int size = 0;

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				createAccount();
				break;

			case 2:
				accountList();
				break;

			case 3:
				deposit();
				break;

			case 4:
				withdraw();
				break;

			case 5:
				run = false;
				break;
			}
		}

		scanner.close();
		System.out.println("프로그램 종료");
	}

	// 계좌생성하기
	private static void createAccount() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기입금액: ");
		int bal = scanner.nextInt();
		
		Account newAccount = new Account(ano, owner, bal);
		
		accountArray[size++] = newAccount;
//		size++;
		
		System.out.println("결과: 계좌가 생성되었습니다.");
	}

	// 계좌목록보기
	private static void accountList() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");

		for (int i = 0; i < size; i++) {
			System.out.print(accountArray[i].getAno() + "\t");
			System.out.print(accountArray[i].getOwner() + "\t");
			System.out.println(accountArray[i].getBalance());
		}
	}

	// 예금하기
	private static void deposit() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int money = scanner.nextInt();
		
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("해당 계좌번호는 존재하지 않습니다.");
		} else {
			account.setBalance(account.getBalance() + money);
			System.out.println("결과: 예금이 성공되었습니다.");
		}
	}

	// 출금하기
	private static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int money = scanner.nextInt();
		
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("해당 계좌번호는 존재하지 않습니다.");
		} else {
			if(account.getBalance() >= money) {
				account.setBalance(account.getBalance() - money);
				System.out.println("결과: 출금이 성공되었습니다.");
			} else {
				System.out.println("잔액이 부족합니다.");
				System.out.println("현재 잔액: " + account.getBalance());
			}
		}
	}

	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		for(int i = 0; i < size; i++) {
			if(accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		
		return null;
	}
}
