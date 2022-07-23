import java.util.List;

public class Instructor extends User{
    private double salary;
    private List<String> taughtCourses;

    public Instructor(){
    }

    public Instructor(int id, String firstName, String lastName, String email,
                      String password, double salary, List<String> taughtCourses) {
        super(id, firstName, lastName, email, password);
        this.salary = salary;
        this.taughtCourses = taughtCourses;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getTaughtCourses() {
        return taughtCourses;
    }

    public void setTaughtCourses(List<String> taughtCourses) {
        this.taughtCourses = taughtCourses;
    }
}
