package entities.concretes;

public class Person {
	 private int id;
	    private String firstName;
	    private String lastName;
	    private String IdentityNumber;
	    private int dateOfBirth;

	    public Person() {
	    }

	    public Person(int id, String firstName, String lastName, String identityNumber, int dateOfBirth) {
	        this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        IdentityNumber = identityNumber;
	        this.dateOfBirth = dateOfBirth;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public String getIdentityNumber() {
	        return IdentityNumber;
	    }

	    public void setIdentityNumber(String identityNumber) {
	        IdentityNumber = identityNumber;
	    }

	    public int getDateOfBirth() {
	        return dateOfBirth;
	    }

	    public void setDateOfBirth(int dateOfBirth) {
	        this.dateOfBirth = dateOfBirth;
	    }
}
