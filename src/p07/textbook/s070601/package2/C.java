package p07.textbook.s070601.package2;

import p07.textbook.s070601.package1.A;

public class C {
	public void method() {
//		A a = new A();		// A의 기본 생성자가 protected인데 C는 상속관계도 아니고, 
//		a.field = "value";	// 같은 패키지도 아니고, A 자기자신이 아니기 때문에 불가능
//		a.method();
		// 전부 불가
	}
}
