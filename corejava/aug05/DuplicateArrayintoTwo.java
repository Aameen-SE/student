package corejava.aug05;

public class DuplicateArrayintoTwo {
    public static void main(String[] args) {
        //wap to check whether two array are equal or not
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={1,2,3,4,5,6};

        boolean result=true;

        if(arr1.length==arr2.length)
        {
            for(int i=0;i< arr1.length;i++)
            {
                if(arr1[i]!=arr2[i])
                {
                    result = false;
                }
            }
        }
        else{
            result = false;
        }

        if(result==true)
            System.out.println("Both the array is equal to each other ");
        else
            System.out.println("Both the array is not equal to each other");

    }
}
