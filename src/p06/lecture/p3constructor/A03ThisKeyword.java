package p06.lecture.p3constructor;

public class A03ThisKeyword {
	// this : 앞으로 만들어질 객체의 참조변수를 대신하는 키워드
	public static void main(String[] args) {
		TV tv1 = new TV("samsung");
		System.out.println(tv1.name);
		
		TV tv2 = new TV("lg");
		System.out.println(tv2.name);
	}
}
