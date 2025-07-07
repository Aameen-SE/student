package objct.comparator.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

// Create a Course class with fields courseName and durationWeeks.
//👉 Sort courses by duration descending.
class Course{
    private String courseName;
    private int duratioWeeks;

    public Course(String courseName, int duratioWeeks) {
        this.courseName = courseName;
        this.duratioWeeks = duratioWeeks;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDuratioWeeks() {
        return duratioWeeks;
    }

    public void setDuratioWeeks(int duratioWeeks) {
        this.duratioWeeks = duratioWeeks;
    }

    @Override
    public String toString() {
        return "Course Name : "+courseName+" Duration of Weeks : "+duratioWeeks;
    }
}
public class CourseMain {

    public static void main(String[] args) {

        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Java",105));
        courses.add(new Course("Python",151));
        courses.add(new Course("Javascript",125));
        courses.add(new Course("React",215));

        courses.sort((e1,e2)->Integer.compare(e1.getDuratioWeeks(),e2.getDuratioWeeks()));

        for (Course c:courses){
            System.out.println(c);
        }
    }
}
