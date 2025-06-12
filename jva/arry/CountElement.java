package jva.arry;

public class CountElement {
    public static void main(String[] args) {
        int[] ar={1,1,2,3,4,5,6,1,7,8,9,1,};

        int target = 1;
        int count=0;

        for (int i=0;i<ar.length;i++){
            if(ar[i]==target){
                count++;
            }
        }

        System.out.println("No of time target : "+target+" is in array : "+count);
    }
}
