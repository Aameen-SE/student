package dailypractice.july23;

public class SecondLargestElement {

    public static void main(String[] args) {

         int[] arr = {10, 25, 95, 165, 25, 85, 115};
         int max =arr[0];
         int secondMax =-1;
         for(int i =1;i<arr.length;i++){
             if(arr[i]>max){
                 secondMax=max;
                 max=arr[i];
             } else if (arr[i]>secondMax &&arr[i]!=max) {
                 secondMax=arr[i];
             }
         }

        System.out.println("Second largest element in array : "+secondMax);
    }
}
