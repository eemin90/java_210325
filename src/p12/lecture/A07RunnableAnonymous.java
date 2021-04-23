package p12.lecture;

public class A07RunnableAnonymous {
	public static void main(String[] args) {
		// 익명 구현 객체
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("thread 실행");
			}
		});

		// 람다식
		Thread thread1 = new Thread(() -> {
			System.out.println("thread1 실행");
		});

		thread.start();
		thread1.start();
	}
}
