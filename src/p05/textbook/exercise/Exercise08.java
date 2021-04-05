package p05.textbook.exercise;

public class Exercise08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		int div = 0;
		double avg = 0.0;
		
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				sum += array[i][j];
//				div++;
//			}
//			//div += array[i].length;
//		}
		
		// for each
		for (int[] row : array) { // array[0], [1], [2] 순서로 도는데
			for (int n : row) { // array[0]일때 [95, 86], array[1]일때 [83, 92, 96], array[2]일때 [78, 83, 93, 87, 88]
				sum += n;
				div++;
			}
		}
		
		avg = (double) sum / div;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
