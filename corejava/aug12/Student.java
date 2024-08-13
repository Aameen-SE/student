package corejava.aug12;

import java.math.BigDecimal;

public class Student {
private String name;
private int[] marks;

    public Student(String name, int[] marks) {
        this.name=name;
        this.marks=marks;
    }

    public int getNumbersofMarks(){
        return marks.length;
    }

    public int getTotalSumofMarks(){
        int sum=0; ;
        for(int m:marks){
            sum=sum+m;
        }
        return sum;
    }

    public int getMaximumMark(){
        int max=Integer.MIN_VALUE;
        for(int m:marks){
            if(m>max){
                max=m;
            }
        }
        return max;
    }

    public int getMinimumMark(){
        int min=Integer.MAX_VALUE;
        for(int m:marks){
            if(m<min){
                min=m;
            }
        }
        return min;
    }

    public float getAverageMarks(){
        int sum = getTotalSumofMarks();
        int total=getNumbersofMarks();
         float avg =sum/total;
          return avg;
    }
}
