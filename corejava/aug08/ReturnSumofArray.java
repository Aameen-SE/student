package corejava.aug08;

public class ReturnSumofArray {
    public static void main(String[] args) {
        //int sum(int[]), find sum of all elements of an array and return sum
        int[] array ={1,2,3,6,4,5};

        int sum=sum(array);
        System.out.println(sum);

    }
    public static int sum(int[] a){
        int sum=0;
        for(int i=0;i< a.length;i++){
            sum=sum+a[i];
        }
        return sum;
    }
}
