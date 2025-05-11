package jva.may11;

public class GreatestElementInArra {
    public static void main(String[] args) {
        //	wap to find greatest number from any array
        int []arr ={12,54,87,96,35,57,88};
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if(max<=arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Greatest Number in the array : "+max);
    }
}
