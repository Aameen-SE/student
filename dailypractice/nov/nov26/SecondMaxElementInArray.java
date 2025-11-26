package dailypractice.nov.nov26;

public class SecondMaxElementInArray {
    public static void main(String[] args) {
        int[] arr ={1,24,15,16,234,17,185,90};

        int secondMax = secondMax(arr);
        System.out.println(secondMax);
    }

    public static int secondMax(int[] arr){

        int max = Integer.MIN_VALUE;
        int secondMax= Integer.MIN_VALUE;

       for(int a:arr){
           if(a>max){
               secondMax=max;
               max=a;
           } else if (a>secondMax && a!=max) {
               secondMax=a;
           }
       }
        return secondMax;
    }
}
