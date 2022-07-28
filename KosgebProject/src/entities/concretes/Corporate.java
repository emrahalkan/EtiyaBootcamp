package entities.concretes;

public class Corporate extends Applicant {
	private String name;
	private String taxNumber;

	public Corporate() {
		super();
	}

	public Corporate(int id, String userName, String password, String email, String address,String companyName, String taxNumber) {
		super(id, userName, password, email, address);
		this.name = companyName;
		this.taxNumber = taxNumber;
	}

	public String getCompanyName() {
		return name;
	}

	public void setCompanyName(String companyName) {
		this.name = companyName;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

}
