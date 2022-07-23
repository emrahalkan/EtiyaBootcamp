import java.util.List;

public class Student extends User{
    private List<String> takenCourses;
    private int coursePercent;

    public Student(){}

    public Student(int id, String firstName, String lastName, String email,
                   String password, List<String> takenCourses, int coursePercent) {
        super(id, firstName, lastName, email, password);
        this.takenCourses = takenCourses;
        this.coursePercent = coursePercent;
    }

    public List<String> getTakenCourses() {
        return takenCourses;
    }

    public void setTakenCourses(List<String> takenCourses) {
        this.takenCourses = takenCourses;
    }

    public int getCoursePercent() {
        return coursePercent;
    }

    public void setCoursePercent(int coursePercent) {
        this.coursePercent = coursePercent;
    }
}
