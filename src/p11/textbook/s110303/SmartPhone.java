package p11.textbook.s110303;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	// toString 재정의
	@Override
	public String toString() {
		return company + ", " + os;
	}
}
