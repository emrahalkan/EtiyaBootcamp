package entities.concretes;

public class CreditFeature {
	private int id;
	private Credit credit;
	private Feature feature;

	public CreditFeature() {
		super();
	}

	public CreditFeature(int id, Credit credit, Feature feature) {
		super();
		this.id = id;
		this.credit = credit;
		this.feature = feature;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Credit getCredit() {
		return credit;
	}

	public void setCredit(Credit credit) {
		this.credit = credit;
	}

	public Feature getFeature() {
		return feature;
	}

	public void setFeature(Feature feature) {
		this.feature = feature;
	}

}
