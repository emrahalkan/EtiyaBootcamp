public class IndividualCustomer extends Customer{
    private String firstName;
    private String lastName;
    private String identityNumber;

    public IndividualCustomer() {
    }

    public IndividualCustomer(int id, String customerNumber, Canal canal, String firstName, String lastName, String identityNumber) {
        super(id, customerNumber, canal);
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityNumber = identityNumber;
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
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }
}
