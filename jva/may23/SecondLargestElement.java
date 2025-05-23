package jva.may23;

public class SecondLargestElement {
    public static void main(String[] args) {
        //find the second largest element in the array
        int [] arr={12,32,65,74,89,69,54};
        int max = arr[0];

        for (int a: arr){
            if(max<a){
                max=a;
            }
        }
        System.out.println("First Largest Element : "+max);
        int secondMax = arr[0];
        for(int i :arr){
            if(i>secondMax && i<max){
                secondMax=i;
            }
        }
        System.out.println("Second largest Element : "+secondMax);
    }
}
