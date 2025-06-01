package dsa.june01;

public class SearchElement {
    public static void main(String[] args) {
        //Search element
        int[] arr={14,52,36,74,15,25,4};

        int result = searchElement(arr,55);
        if(result==1)
            System.out.println("Number is in the array  ");
        else
            System.out.println("Number is not in the array ");

    }
    public static int searchElement(int[] arr, int target){

        for(int a:arr){
            if(target==a)
                return 1;
        }

        return -1;
    }
}
