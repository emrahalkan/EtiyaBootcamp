package entities.concretes;

public class Application {
	private int id;
	private Applicant applicant;
	private Credit credit;

	public Application() {
		super();
	}

	public Application(int id, Applicant applicant, Credit credit) {
		super();
		this.id = id;
		this.applicant = applicant;
		this.credit = credit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Applicant getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}

	public Credit getCredit() {
		return credit;
	}

	public void setCredit(Credit credit) {
		this.credit = credit;
	}

}
