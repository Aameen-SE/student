package jva.may23;

public class LargestElement {
    public static void main(String[] args) {
        int [] arr={12,32,65,74,89,69,54};

        int max = arr[0];
        for(int a:arr){
            if(a>max){
                max=a;
            }
        }
        System.out.println("Largest Element in array : "+max);
    }
}
