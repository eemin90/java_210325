package p05.lecture.enumType;

public class A02EnumType {
	public static void main(String[] args) {
		String s = "VALUE1";
		
		switch (s) {
		case "VALUE1":
			System.out.println("VALUE1 입니다.");
			break;
		case "VALUE2":
			System.out.println("VALUE2 입니다.");
			break;
		default:
			System.out.println("둘 다 아닙니다.");
			break;
		}
		
		System.out.println("enum type");
		MyEnum e1 = MyEnum.VALUE1;
		
		switch (e1) {
		case VALUE1:
			System.out.println("VALUE1 입니다.");
			break;
		case VALUE2:
			System.out.println("VALUE2 입니다.");
			break;
		default:
			System.out.println("둘 다 아닙니다.");
			break;
		}
	}
}
