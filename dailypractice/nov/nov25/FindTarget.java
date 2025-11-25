package dailypractice.nov.nov25;

public class FindTarget {

    public static void main(String[] args) {
        //wap to find the index of an array element(here u have to take any number and check that number is
        //		present inside an array or not,

        int[] arr ={1,2,3,4,5,6,78,52,9,0};
        int target = 8;

         int ind = findIndex(arr,target);
        System.out.println(ind);

    }

    public static int findIndex(int[] arr, int t){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==t)
                return i;
        }
        return -1;
    }


}
