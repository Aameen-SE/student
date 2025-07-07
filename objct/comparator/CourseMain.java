package objct.comparator;

//Create a Course class with fields courseName and enrollmentCount.
// Write a comparator to sort courses by enrollment count descending.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Course {
    private String courseName;
    private int enrollmentCount;

    public Course(String courseName, int enrollmentCount) {
        this.courseName = courseName;
        this.enrollmentCount = enrollmentCount;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getEnrollmentCount() {
        return enrollmentCount;
    }

    public void setEnrollmentCount(int enrollmentCount) {
        this.enrollmentCount = enrollmentCount;
    }

    @Override
    public String toString() {
        return "Course Name : "+courseName+" Enrollment Count : "+enrollmentCount;
    }
}

class EnrollmentComp implements Comparator<Course> {

    @Override
    public int compare(Course o1, Course o2) {
        return o2.getEnrollmentCount()- o1.getEnrollmentCount()
    }
}
public class CourseMain {

    public static void main(String[] args) {

        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Java for Beginner",456));
        courses.add(new Course("Python for Beginner",156));
        courses.add(new Course("DSA",356));
        courses.add(new Course("Numbering System",756));

        Collections.sort(courses,new EnrollmentComp());

        for (Course c : courses){
            System.out.println(c);
        }

    }
}
