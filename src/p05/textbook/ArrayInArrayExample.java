package p05.textbook;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		int[][] mathScores = new int[2][3]; // [0, 0, 0], [0, 0, 0]
		
		for (int i = 0; i < mathScores.length; i++) { // length는 2
			for (int k = 0; k < mathScores[i].length; k++) { // 0이면 3, 1이면 3
				System.out.println("mathScores[" + i + "][" + k + "] = " + mathScores[i][k]);
			}
		}
		
		System.out.println();
		
		int[][] englishScores = new int[2][]; // 2행 [0], [0]
		
		englishScores[0] = new int[2]; // 1행 2열 [0, 0]
		englishScores[1] = new int[3]; // 2행 3열 [0, 0, 0]
		
		for (int i = 0; i < englishScores.length; i++) { // length는 2
			for (int k = 0; k < englishScores[i].length; k++) { // 0이면 2, 1이면 3
				System.out.println("englishScores[" + i + "][" + k + "] = " + englishScores[i][k]);
			}
		}
		
		System.out.println();
		
		int[][] javaScores = {{95, 80}, {92, 96, 80}}; // 1행 2열, 2행 3열
		
		for (int i = 0; i < javaScores.length; i++) { // length는 2
			for (int k = 0; k < javaScores[i].length; k++) { // 0이면 2, 1이면 3
				System.out.println("javaScores[" + i + "][" + k + "] = " + javaScores[i][k]);
			}
		}
	}
}
