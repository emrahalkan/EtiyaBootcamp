package entities.concretes;

public class Applicant extends User {

	public Applicant() {
		super();
	}
	
	public Applicant(int id, String userName, String password, String email, String address) {
		super(id, userName, password, email, address);
	}
	
}
