package entities.concretes;

public class Entrepreneur extends Applicant {
	private String name;
	private String lastName;
	private String nationalIdentity;

	public Entrepreneur() {
		super();
	}

	public Entrepreneur(int id, String userName, String password, String email, String address, String name,
			String lastName, String nationalIdentity) {
		super(id, userName, password, email, address);
		this.name = name;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

}
