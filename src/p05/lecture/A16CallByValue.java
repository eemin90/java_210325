package p05.lecture;

public class A16CallByValue {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i * 2; // 0 2 4
		}
		
		print(arr1);
		
		int[] arr2 = new int[5];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = i * 100; // 0 100 200 300 400
		}
		
		print(arr2);
	}
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
