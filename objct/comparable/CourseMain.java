package objct.comparable;

//Create a Course class with fields courseName and durationInWeeks. Sort courses by duration ascending.

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Course implements Comparable<Course>{
    private  String courseName;
    private int durationWeek;

    public Course(String courseName, int durationWeek) {
        this.courseName = courseName;
        this.durationWeek = durationWeek;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDurationWeek() {
        return durationWeek;
    }

    public void setDurationWeek(int durationWeek) {
        this.durationWeek = durationWeek;
    }

    @Override
    public String toString() {
        return "CourseName : "+courseName+" Duration Week : "+durationWeek +" weeks ";
    }

    @Override
    public int compareTo(Course o) {
        return this.durationWeek-o.durationWeek;
    }
}
public class CourseMain {

    public static void main(String[] args) {

        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Java FullStack",12));
        courses.add(new Course("Python for beginner",160));
        courses.add(new Course("Web Development",04));
        courses.add(new Course("JavaScript",60));

        Collections.sort(courses);
        for (Course c: courses){
            System.out.println(c);
        }
    }
}
