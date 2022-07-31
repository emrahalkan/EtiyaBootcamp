package entities.concretes;

public class Employee extends Person {
	private double salary;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, String identityNumber, int dateOfBirth,double salary) {
        super(id, firstName, lastName, identityNumber, dateOfBirth);
        this.salary =salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
