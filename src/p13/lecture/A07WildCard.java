package p13.lecture;

public class A07WildCard {
	public static void main(String[] args) {
		Box7<ParentGeneric7> b1 = new Box7<>();
		Box7<Generic7> b2 = new Box7<>();
		
//		b1 = b2;
		
		Box7<? extends ParentGeneric7> b3;
		b3 = b2;
		
		Box7<? extends Generic7> b4;
		b4 = b2;
		
		Box7<? super Generic7> b5;
		b5 = b2;
		b5 = b1;
		
		Box7<? super ChildGeneric7> b6;
		b6 = b2;
		
	}
}

class Box7<T> {}

class ParentGeneric7 {}

class Generic7 extends ParentGeneric7 {}

class ChildGeneric7 extends Generic7 {}
