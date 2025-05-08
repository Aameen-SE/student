package jva.may08;
// interface
// multi inheritance
interface Inte2{
    abstract void stream();
}
interface Inte1{
     abstract void batch();
}
public class StudentMain implements Inte1, Inte2{

    public void stream(){
        System.out.println("CSE");
    }
    public void batch(){
        System.out.println("Batch : 2025 ");
    }

    public static void main(String[] args) {
        Student st= new Student(12,"Aameen");
        System.out.println("Student rollno : "+st.getRollNo()+" Name : "+st.getName());
        StudentMain stu = new StudentMain();
        stu.batch();
        stu.stream();
    }
}
