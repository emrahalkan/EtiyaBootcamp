package entities.concretes;

public class Union extends Corporate {
	private String unionNumber;

	public Union() {
		super();
	}

	public Union(int id, String userName, String password, String email, String address,String companyName, String taxNumber,String unionNumber) {
		super(id, userName, password, email, address,companyName, taxNumber);
		this.unionNumber = unionNumber;
	}

	public String getUnionNumber() {
		return unionNumber;
	}

	public void setUnionNumber(String unionNumber) {
		this.unionNumber = unionNumber;
	}

}
