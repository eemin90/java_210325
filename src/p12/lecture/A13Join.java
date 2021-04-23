package p12.lecture;

public class A13Join {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread13());
		t1.start();

		System.out.println("main 실행 중");
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main 종료");
	}
}

class Thread13 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {

		}
		System.out.println("thread 종료");
	}
}