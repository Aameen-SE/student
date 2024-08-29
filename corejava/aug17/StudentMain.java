package corejava.aug17;

public class StudentMain {
    public static void main(String[] args) {
        Student student1= new Student("Rohan" ,85,95,25);
        Student student2 = new Student("Aameen" ,85,25);
        Student student3= new Student("Eve" ,85,95,25,74);

       System.out.println( student1.getSum(student1.getMarks()));
        System.out.println( student2.getSum(student2.getMarks()));


    }
}
