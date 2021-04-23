package p12.lecture;

public class A03ThreadSleep {
	public static void main(String[] args) {
		System.out.println("실행1");

		try {
			Thread.sleep(1000); // 1초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("실행2");
	}
}
