package p12.lecture;

public class A02Thread {
	public static void main(String[] args) {
		Thread t1 = new Thread2();
		t1.start();

		int end = 100000000;
		for (int i = 0; i < end; i++) {
			System.out.println("~main thread 실행~");
		}
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		int end = 100000000;
		for (int i = 0; i < end; i++) {
			System.out.println("thread2 실행");
		}
	}
}