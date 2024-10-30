package collectin.lst.oct30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendCompar implements Comparator<Student>{
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getId(),student2.getId());
    }
}

class DescComp implements Comparator<Student>{
    @Override
    public int compare(Student stud1, Student stud2) {
        return Integer.compare(stud2.getId(), stud1.getId());
    }
}
public class StudentRunner {
    public static void main(String[] args) {

        List<Student> students= List.of(new Student(1,"Aameen") , new Student(23,"Hussain") ,
                new Student(2,"Khan") , new Student(4,"Adil"));

        System.out.println("List of element : "+students);

        List<Student> studentArr = new ArrayList<>(students);
        Collections.sort(studentArr,new AscendCompar());
        System.out.println("\nAscend Order : "+studentArr);
        Collections.sort(studentArr,new DescComp());
        System.out.println("\nDescend Order : "+studentArr);

    }
}
