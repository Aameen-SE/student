package corejava.aug12;

import java.math.BigDecimal;

public class StudentMain {
    public static void main(String[] args) {
        int[] marks ={55,65,74,85};
        Student student = new Student("Aameen",marks);

        int number = student.getNumbersofMarks();
       System.out.println("Number of Marks :"+number);

        int sum=student.getTotalSumofMarks();
       System.out.println("Total sum of marks :"+sum);

        int max=student.getMaximumMark();
        System.out.println("Maximum marks :"+max);

        int min=student.getMinimumMark();
        System.out.println("Minimum marks :"+min);

        float average = student.getAverageMarks();
        System.out.println("Average :"+average);
    }
}
