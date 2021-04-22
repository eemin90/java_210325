package p11.textbook.s110702;

public class StringTrimExample {
	public static void main(String[] args) {
		String tel1 = "  02";
		String tel2 = "123   ";
		String tel3 = "    12  34    ";

		String tel = tel1.trim() + tel2.trim() + tel3.replace(" ", "");
		System.out.println(tel);
	}
}
