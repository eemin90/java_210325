package p12.lecture;

import java.awt.Toolkit;

public class A04Thread {
	public static void main(String[] args) {
		Thread t4 = new Thread4();
		t4.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("띠링~");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread4 extends Thread {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 5; i++) {
			toolkit.beep();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}