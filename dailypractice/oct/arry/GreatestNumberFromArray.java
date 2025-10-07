package dailypractice.oct.arry;

public class GreatestNumberFromArray {

    public static void main(String[] args) {

        int [] arr ={12,130,45,67,98,100,};

        greatestNum(arr);
    }

    public static void greatestNum(int[] arr){

        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }

        System.out.println("The greatest element from the array is :"+max);

    }

}
