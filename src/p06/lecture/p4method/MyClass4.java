package p06.lecture.p4method;

public class MyClass4 {
	void method1() { // 리턴 타입이 void인 경우는 return값이 없어도 됨
		System.out.println("method1 호출...");
	}
	
	int method2() { // 리턴 타입이 int인 경우는 return값은 int
		System.out.println("method2 호출...");
		
		return 5;
	}

	String method3() { // 리턴 타입이 String인 경우는 return값은 String
		System.out.println("method3 호출...");
		
		return "";
	}

	int[] method4() { // 리턴 타입이 int[]인 경우는 return값은 int[]
		System.out.println("method4 호출...");
		
		return new int[] {};
	}

	int[] method5() { // 리턴 타입이 int[]인 경우는 return값은 int[]
		System.out.println("method5 호출...");
		int[] res = {};
		return res;
	}
	
	String method6() {
		System.out.println("method6 호출...");
		
		boolean b = 3 < 5;
		
		if(b) {
			return "hello";
		} else {
			return "hello";
		}
	}
	
	String method7() {
		System.out.println("method7 호출...");
		
		boolean c = 3 < 5;
		
		if(c) {
			return "world";
		}
		
		System.out.println("method7 호출2...");
		return "world";
	}
	
	// 리턴 타입과 return값은 타입이 같아야 함
}
