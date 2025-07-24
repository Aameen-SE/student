package dailypractice.july23;

public class GreatestElement {

    public static void main(String[] args) {

        int[] arr = {12,15,16,17,18,113,54,64,75};

        int max = arr[0];


        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }

        System.out.println("Greatest Element in array :"+max);


    }
}
