package p07.lecture.p6polymorphism.ex1;

public class A01Polymorphism {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Tiger tiger1 = new Tiger();
		
		cat1.cry();
		tiger1.cry();
		
		KindaCat k1;
		k1 = cat1;
		
		System.out.println(k1 == cat1);
		System.out.println(System.identityHashCode(k1));
		System.out.println(System.identityHashCode(cat1));
		
		KindaCat k2;
		k2 = tiger1;
		
		System.out.println(k2 == tiger1);
		System.out.println(System.identityHashCode(k2));
		System.out.println(System.identityHashCode(tiger1));
		
//		cat1 = k1;
//		tiger1 = k2;
//		tiger1 = cat1;
//		cat1 = tiger1;
		
		KindaCat k3 = new Cat();
		KindaCat k4 = new Tiger();
	}
}
