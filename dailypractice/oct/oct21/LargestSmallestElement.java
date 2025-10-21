package dailypractice.oct.oct21;

public class LargestSmallestElement {

    public static void main(String[] args) {

        int[] arr = {25, 11, 7, 75, 56};

        int max= arr[0];
        int min= arr[0];

        for(int i=1;i<arr.length;i++){
            if(max<arr[i])
            {
                max=arr[i];
            }

            if(min>arr[i])
                min=arr[i];
        }


        System.out.println("Largest Element in Array is : "+max);
        System.out.println("Smallest Element in Array is : "+min);
    }
}
