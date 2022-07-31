package entities.concretes;

public class Customer extends Person {
	private int cityId;

	public Customer() {
	}

	public Customer(int id, String firstName, String lastName, String identityNumber, int dateOfBirth, int cityId) {
		super(id, firstName, lastName, identityNumber, dateOfBirth);
		this.cityId = cityId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

}
