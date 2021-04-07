package p06.lecture.p3constructor;

public class A04Overloading {
	// 생성자는 하나 이상 있어야 됨
	// 파라미터의 타입, 갯수, 순서에 의해 구분됨
	public static void main(String[] args) {
		Computer com1 = new Computer("dell", 4, "intel", 128);
		Computer com2 = new Computer("hp", 8, "amd", 256);
		
		Computer com3 = new Computer("lenovo", 8, "intel");
		Computer com4 = new Computer("ms", 16);
		
		System.out.println(com3.ssd);
		
		System.out.println(com4.cpu);
		System.out.println(com4.ssd);
	}
}
