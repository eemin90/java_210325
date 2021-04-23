package p12.lecture;

import java.awt.Toolkit;

public class A06Runnable {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() { // 이 방법이 더 많이 사용된다(코드 절약)
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
		});

		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("띠링~~");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

//		Thread t6 = new Thread(new Thread6());
//		t6.start();
//
//		for (int i = 0; i < 5; i++) {
//			System.out.println("띠링~~");
//
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
	}
}

//class Thread6 implements Runnable {
//	@Override
//	public void run() {
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//
//		for (int i = 0; i < 5; i++) {
//			toolkit.beep();
//
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
