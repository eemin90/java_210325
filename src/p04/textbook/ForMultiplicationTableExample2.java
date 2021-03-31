package p04.textbook;

public class ForMultiplicationTableExample2 {
	public static void main(String[] args) {
		/*
		 *
		 **
		 ***
		 ****
		 *****
		*/
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 *****
		 ****
		 ***
		 **
		 *
		*/
		System.out.println();
		for (int i = 0; i < 5; i++) { // 0, 1, 2, 3, 4
			for (int j = 5; j > i; j--) { // i0 j5 j4 j3 j2 j1, i1 j5 j4 j3 j2, ...
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 *****
		  ****
		   ***
		    **
		     *
		*/
		System.out.println();
		for (int i = 0; i < 5; i++) { // 0, 1, 2, 3, 4
			for (int j = 0; j < i; j++) { // i0, i1 j0, i2 j0 j1, ...
				System.out.print(" ");
			}
			for (int k = 5; k > i; k--) { // i0 k5 k4 k3 k2 k1, i1 k5 k4 k3 k2, ...
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		     *
		    **
		   ***
		  ****
		 *****
		*/
		System.out.println();
		for (int i = 0; i < 5; i++) { // 0, 1, 2, 3, 4
			for (int j = 4; j > i; j--) { // i0 j4 j3 j2 j1, i1 j4 j3 j2, ...
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) { // i0 k0, i1 k0 k1, ...
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
