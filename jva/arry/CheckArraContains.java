package jva.arry;

public class CheckArraContains {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,7,8,9};
        int target =9;
        boolean found =false;
        for(int i=0;i<=arr1.length;i++){
            if(arr1[i]==target) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("It contain");
        else
            System.out.println("It does not contain");
    }
}
