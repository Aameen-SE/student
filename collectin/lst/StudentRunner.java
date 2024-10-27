package collectin.lst;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student>{
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student2.getId(),student1.getId());
    }
}
public class StudentRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1,"Aameen"),
                new Student(20,"Hussain"), new Student(3,"Adil"));
        System.out.println(students);

        ArrayList<Student> studentsArr = new ArrayList<>(students);
        Collections.sort(studentsArr);
        System.out.println("\nAscending order :"+studentsArr);
        Collections.sort(studentsArr,new DescendingStudentComparator());
        System.out.println("\nDescending order : "+studentsArr);

    }
}
