package p12.lecture;

public class A11ThreadPriority {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread t1 = new Thread(new Thread11());

			if (i == 0) {
				t1.setPriority(10);
			} else {
				t1.setPriority(1);
			}

			t1.start();
		}
	}
}

class Thread11 implements Runnable {
	@Override
	public void run() {
		for (long i = 0; i < 1_000_000_000L; i++) {

		}
		System.out.println(Thread.currentThread().getName());
	}
}