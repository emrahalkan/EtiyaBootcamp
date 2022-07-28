package entities.concretes;

public class SmallMediumEnterprise extends Corporate {
	private String enterpriseNumber;
	private String scala;
	
	public SmallMediumEnterprise() {
		super();
	}

	public SmallMediumEnterprise(int id, String userName, String password, String email, String address,String companyName, String taxNumber,String enterpriseNumber, String scala) {
		super(id, userName, password, email, address,companyName, taxNumber);
		this.enterpriseNumber = enterpriseNumber;
		this.scala = scala;
	}

	public String getEnterpriseNumber() {
		return enterpriseNumber;
	}

	public void setEnterpriseNumber(String enterpriseNumber) {
		this.enterpriseNumber = enterpriseNumber;
	}

	public String getScala() {
		return scala;
	}

	public void setScala(String scala) {
		this.scala = scala;
	}
	
	
	
	
}
