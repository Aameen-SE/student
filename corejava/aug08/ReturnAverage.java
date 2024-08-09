package corejava.aug08;

public class ReturnAverage {
    public static void main(String[] args) {
        //double average(int[]), find the average of array elements and return average
        double[] array={61,52,63,44,55};
        double avg=average(array);
        System.out.println("Avg of array element :"+avg);
    }
    public static double average(double[]arr){
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        double avg=sum/5;
        return avg;
    }
}
