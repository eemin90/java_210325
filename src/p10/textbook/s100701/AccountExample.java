package p10.textbook.s100701;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		// 예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		
		// 출금하기
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) { // 예외 메시지 얻기
			String message = e.getMessage();
			System.out.println(message); // 예외 추적 후 출력
			System.out.println();
			e.printStackTrace();
		}
	}
}
