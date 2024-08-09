package corejava.aug08;

public class ReturnSmallestElement {
    public static void main(String[] args) {
        //int smallest(int[]), find smallest element of an array and return that smallest value
        int[] arr ={24,54,35,21,85,97,45};

        System.out.println("Smallest element in an array is :"+smallest(arr));
    }
    public static int smallest(int[] a){
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }
}
