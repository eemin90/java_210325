package p09.lecture;

public class A04LocalClassAccess {
	void method(int param) {
		// param과 localVar는 묵시적 Final(effectively final)
		int localVar = 3;
//		localVar = 4;
//		param = 1;
		
		class LocalClass {
			void method1() {
				System.out.println(localVar);
				System.out.println(param);
			}
		}
	}
}
