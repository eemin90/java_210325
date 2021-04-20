package p11.lecture.object;

public class A03Equals {
	public static void main(String[] args) {
		Book b1 = new Book("java", "trump");
		Book b2 = new Book("c++", "donald");

		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));

		Book b3 = new Book("spring", "summer");
		Book b4 = new Book("spring", "summer");

		System.out.println(b3 == b4);
		System.out.println(b3.equals(b4));
	}
}

class Book {
	private String title;
	private String writer;

	public Book(String title, String writer) {
		this.title = title;
		this.writer = writer;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Book) {
			Book o = (Book) obj;

			return this.title.equals(o.title) && this.writer.equals(o.writer);
		}

		return false;
	}
}
