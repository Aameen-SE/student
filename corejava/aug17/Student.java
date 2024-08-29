package corejava.aug17;

public class Student {
    private String name;
    private int[] marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public Student(String name , int... marks) {
        this.name = name;
        this.marks=marks;
    }

    public int getSum(int... marks){
        int sum=0;
        for(int mark:marks){
            sum=sum+mark;
        }
        return sum;
    }
}
