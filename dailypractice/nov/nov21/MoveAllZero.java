package dailypractice.nov.nov21;

import java.util.Arrays;

public class MoveAllZero {
    public static void main(String[] args) {
        int[] arr ={1,0,2,3,0,4,0};
        moveZero(arr);
        System.out.println("Array :"+ Arrays.toString(arr));
    }
    public static void moveZero(int[] arr) {
        int index=0;

        for(int n:arr){
            if(n!=0){
                arr[index++]=n;
            }
        }
        while (index< arr.length){
            arr[index++]=0;
        }
    }

}
