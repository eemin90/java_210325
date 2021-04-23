package p12.textbook.s120201;

import java.awt.Toolkit;

public class BeepPrintExample3 {
	public static void main(String[] args) {
//		Thread thread = new Thread(() -> { // 람다식
//			Toolkit toolkit = Toolkit.getDefaultToolkit();
//			
//			for (int i = 0; i < 5; i++) {
//				toolkit.beep();
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		});
		
		Thread thread = new Thread(new Runnable() { // 익명 구현 객체
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}			
		});
		
		thread.start();
		
		for (int i = 0; i < 5; i++)	{
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
