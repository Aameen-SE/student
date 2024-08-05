package corejava.aug05;

public class DuplicateinArray {
    public static void main(String[] args) {
        //wap to find duplicate elements in an array?
        int[] arr={1,2,3,4,4,5,6,7,8,8,9};

        System.out.println("Duplicate elements in array :");
        for(int i =0;i<arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
                if(arr[i]==arr[j])
                    System.out.print(arr[j]+" ");
        }

    }
}
