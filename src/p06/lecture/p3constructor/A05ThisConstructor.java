package p06.lecture.p3constructor;

public class A05ThisConstructor {
	// this : 이 클래스에 의해 만들어지는 참조변수를 대체 키워드
	// this() : 이 클래스 내의 다른 생성자
	public static void main(String[] args) {
		Notebook n1 = new Notebook("lenovo", 32, "intel");
		
		System.out.println(n1.model);
		System.out.println(n1.memory);
		System.out.println(n1.cpu);
		System.out.println(n1.ssd);
	}
}
