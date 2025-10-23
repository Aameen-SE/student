package dailypractice.oct.oct22;

public class CheckTwoArrayEqual {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6};
        int [] arr1 = {1,2,3,3,5,6};

        boolean equal =true;
        if(arr.length!=arr1.length){
            equal=false;
        }
        else {

            for(int i=0;i<arr.length;i++){
                if(arr[i]!=arr1[i]){
                    equal=false;
                }
            }
        }

        if(equal)
            System.out.println("Both the array is equal to each other");
        else
            System.out.println("Not equal to each other");
    }
}
