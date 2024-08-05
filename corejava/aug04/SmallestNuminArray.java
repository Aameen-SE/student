package corejava.aug04;

public class SmallestNuminArray {
    public static void main(String[] args) {
        //wap to find smallest number among array element
        int[] arr = {98,2,3,4,5,6,1};
        int small=arr[0];

        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]<small)
                small=arr[i];
        }
        System.out.println("Smallest Number in an Array :"+small);
    }
}
