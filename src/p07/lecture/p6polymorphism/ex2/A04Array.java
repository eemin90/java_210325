package p07.lecture.p6polymorphism.ex2;

public class A04Array {
	public static void main(String[] args) {
		double[] arr1 = new double[5];
		arr1[0] = 3.14;
		arr1[1] = 2.99F;
		arr1[2] = 9999999999999L;
		
		KindaCat[] arr2 = new KindaCat[5];
		arr2[0] = new KindaCat();
		arr2[1] = new Cat();
		arr2[2] = new Tiger();
	}
}
