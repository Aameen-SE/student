package jva.arry;

public class Check2ArraEqualOrNot {
    public static void main(String[] args) {
        int [] arr1={10,11,12,13,14,15,16,17,18};
        int [] arr2={10,11,12,13,14,15,16,17,18};

        boolean isDuplicate = true;

        if(arr1.length!=arr2.length){
            isDuplicate=false;
        } else {
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    isDuplicate=false;
                    break;
                }
            }
        }

        if(isDuplicate)
            System.out.println("Duplicate ");
        else
            System.out.println("Is not duplicate");
    }
}
