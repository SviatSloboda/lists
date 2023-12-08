package neuefische;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        School school1 = new School();
        Student student1 = new Student("john","rock",123);
        Course course = new Course("Java","Florian", 123);
        student1.addCourse(course);
        school1.addStudent(student1);
        school1.printStudents();
        System.out.println(school1.findStudent(123));
        System.out.println(school1.retrieveAllCourses(123));


        Sack<Integer> sack = new Sack<>();
        sack.addElement(1);
        sack.addElement(2);
        sack.addElement(3);
        sack.printElements();
        sack.addByIndex(2,3223);
        sack.printElements();

    }

}