package p12.lecture;

public class A05ThreadRunnable {
	public static void main(String[] args) {
		Thread t5 = new Thread(new Thread5());
		t5.start();
	}
}

class Thread5 implements Runnable {
	@Override
	public void run() {
		System.out.println("thread5 실행");
	}
}