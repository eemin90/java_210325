package p15.textbook.exercise.ex10;

public class Student implements Comparable<Student> {
	public String id;
	public int score;

	public Student(String id, int score) {
		this.id = id;
		this.score = score;
	}

	@Override
	public int compareTo(Student stu) {
		return this.score - stu.score;
	}
}
