package p04.lecture;

public class A14Break {
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + ", " + j);
				if(j == 3) {
					break;
				}
			}
		}
		
		System.out.println("~");
	}
}
