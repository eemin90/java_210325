package p13.textbook.ex04;

public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);
		
		Pair<Integer, String> pair2 = new Pair<>(99, "java");
		String name = Util.getValue(pair2, 99);
		System.out.println(name);
	}
}
