package corejava.aug08;

public class ReturnGreatestElement {
    public static void main(String[] args) {
        //int greatest(int[]), find greatest element of an array and return that greatest value
        int[] arr ={24,54,35,21,85,97,45};

        System.out.println("Greatest element in an array is :"+greatest(arr));
    }
    public static int greatest(int[] a){
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
}
