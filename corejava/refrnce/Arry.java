package corejava.refrnce;

import java.util.Arrays;

public class Arry {
    public static void main(String[] args) {
        int[] marks={1,2,3,45,6};
        System.out.println(Arrays.toString(marks));
        int sum=0;
        for(int mark:marks){
            sum=sum+mark;
        }
        System.out.println("Sum : "+sum);


        int[] mark=new int[5];
        Arrays.fill(mark,100); // filling all the value of array to value
        System.out.println(Arrays.toString(mark));

        // compare other array

        int[] arr1={1,2,3};
        int[] arr2={1,2,3};
        int[] arr3={3,2,3};

        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.equals(arr1,arr3));

        // sort the array
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));




    }
}
