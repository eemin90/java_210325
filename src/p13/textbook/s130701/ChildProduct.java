package p13.textbook.s130701;

public class ChildProduct<T, M, C> extends Product<T, M>{
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
}
