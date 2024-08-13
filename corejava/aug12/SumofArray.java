package corejava.aug12;

public class SumofArray {
    public static void main(String[] args) {
        int[] marks ={14 ,52 ,85, 15};
        int sum=0;
        for(int mark:marks){
            sum=sum+mark;
        }
        System.out.println(sum);
    }
}
