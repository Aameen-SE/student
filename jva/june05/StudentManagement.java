package jva.june05;

import java.util.ArrayList;
import java.util.List;

//addEntity()
//
//updateEntity()
//
//deleteEntity()
//
//viewEntity()
//
//viewAllEntities()
class Student{


    private int id;
    private String name ;
    private String email;
    private String course;

    public Student(int id, String name, String email, String course){
        this.id=id;
        this.name=name;
        this.email=email;
        this.course=course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

class StudentService{
    private List<Student> studentList= new ArrayList<>();

// add student
    public void addStudent(Student student)
    {
        studentList.add(student);
        System.out.println("Student added successfully");
    }


// view student
    public void viewList(){
        if(studentList.isEmpty()){
            System.out.println("Student List is empty");
            return;
        }
        System.out.println("List of student : ");
         for(int i=0;i<studentList.size();i++){
             System.out.println(studentList.get(i));
         }
    }

    //view student by id
    public Student viewListById(int id){
       for(Student st : studentList){
           if(id==st.getId())
               return st;
       } return null;
    }

    // delete student by id

    public void deleteStudent(int id){
        if(studentList.contains(id)){
            studentList.remove(id);
            System.out.println("Student deleted ");
        }else
            System.out.println("No student with such id :"+id);
    }


    // update Student

    public void updateStudent(){}
}





public class StudentManagement {
    public static void main(String[] args) {

        StudentService stdService = new StudentService();

        stdService.addStudent(new Student(1,"Aameen","aameen@gmail.com","java"));
       stdService.viewList();

    }
}
