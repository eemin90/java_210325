package p10.lecture;

public class A19CustomException {
	public static void main(String[] args) {
		try {
			method1();
		} catch (IZeroException e) {
			e.printStackTrace();
		}
	}

	private static void method1() throws IZeroException {
		int i = 0;
		
		if (i == 0) {
			throw new IZeroException("i가 0입니다.");
		}
	}
}
