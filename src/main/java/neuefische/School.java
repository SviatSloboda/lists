package neuefische;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void printStudents() {
        System.out.println(studentList);
    }

    public Student findStudent(int id) {
        for (Student student : studentList) {
            if (student.getStudentId() == id) {
                return student;
            }
        }
        return null;
    }

    public void removeStudent(int studentId) {
        studentList.remove(findStudent(studentId));
    }

    public List<Course> retrieveAllCourses(int studentId) {
        return findStudent(studentId).getCourseList();
    }
}
