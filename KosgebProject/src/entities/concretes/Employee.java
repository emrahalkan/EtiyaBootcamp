package entities.concretes;

public class Employee extends User {
	private String name;
	private String lastName;
	private String title;
	private String registrationNumber;

	public Employee() {
		super();
	}

	public Employee(int id, String userName, String password, String email, String address, String name,
			String lastName, String title, String registrationNumber) {
		super(id, userName, password, email, address);
		this.name = name;
		this.lastName = lastName;
		this.title = title;
		this.registrationNumber = registrationNumber;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

}
