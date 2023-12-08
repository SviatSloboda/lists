package neuefische;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String lastName;
    private int studentId;

    private List<Course> courseList = new ArrayList<>();

    public List<Course> getCourseList() {
        return courseList;
    }

    public void addCourse(Course course){
        courseList.add(course);
    }

    public Student(String name, String lastName, int studentId) {
        this.name = name;
        this.lastName = lastName;
        this.studentId = studentId;
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

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentId=" + studentId +
                '}';
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
