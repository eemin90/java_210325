package p12.textbook.s120203;

public class ThreadA extends Thread {
	public ThreadA() {
		setName("ThreadA");
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
