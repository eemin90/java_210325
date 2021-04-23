package p12.lecture;

public class A15SynchronizedBlock {

}

class Thread15 extends Thread {
	public Memory memory;

	@Override
	public void run() {
		memory.execute();
	}
}

class Memory {
	public void execute() {
		System.out.println("statement1");

		synchronized (this) {
			System.out.println("statement2");
			System.out.println("statement3");
		}

		System.out.println("statement4");
	}
}