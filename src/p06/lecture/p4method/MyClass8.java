package p06.lecture.p4method;

public class MyClass8 {
	int max(int ... values) {
		if(values.length == 0) {
			return 0;
		}
		
		int max = values[0];
		
		for(int i = 1; i < values.length; i++) {
			if(max < values[i]) {
				max = values[i];
			}
		}
		
		return max;
	}
}
