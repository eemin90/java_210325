package p12.textbook.s120301;

public class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 2_000_000_000; i++) {

		}
		System.out.println(getName());
	}
}
