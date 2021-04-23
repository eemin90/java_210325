package p12.lecture;

public class A12Concurrency {

	static long shareValue = 0;

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1_000_000; i++) {
					shareValue++;
				}
			}
		});

		t.start();

		for (int i = 0; i < 1_000_000; i++) {
			shareValue++;
		}

		try {
			t.join(); // 위의 스레드t가 다 돌때 까지 기다린 후 넘어감
		} catch (InterruptedException e) {
			//
			e.printStackTrace();
		}

		System.out.println(shareValue); // 1,000,000
	}
}
