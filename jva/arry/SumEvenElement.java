package jva.arry;

public class SumEvenElement {
    public static void main(String[] args) {
        int arr[]={12,32,13,15,17};
        int sum=0;

        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" , ");
                sum=sum+arr[i];
            }
        }

        System.out.println("\nSum of the even element is : "+sum);

    }
}
