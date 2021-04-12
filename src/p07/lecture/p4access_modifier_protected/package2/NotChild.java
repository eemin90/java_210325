package p07.lecture.p4access_modifier_protected.package2;

import p07.lecture.p4access_modifier_protected.package1.Parent;

public class NotChild {
	
	public void notChildMethod() {
		Parent p = new Parent();
		
		p.publicMethod();
//		p.protectedMethod(); // not ok
//		p.defaultMethod(); // not ok
//		p.privateMethod(); // not ok
	}
}
