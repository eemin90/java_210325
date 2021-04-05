package p05.textbook;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		newStrArray[0] = "jav";
		
		for (int i = 0; i < oldStrArray.length; i++) {
			System.out.print(oldStrArray[i] + ", ");
		}
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
}
