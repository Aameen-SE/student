package dailypractice.jul15;

public class DuplicateElementArr {

    public static void main(String[] args) {

        int[] arr = {12,14,15,14,16,17,18,19,19};

        for(int i =0;i<arr.length;i++){

            for(int j =i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }


    }
}
