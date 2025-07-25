package arrayy;

public class SecondGreatestNum {

    public static void main(String[] args) {

        int [] arr ={12,15,16,18,114,151,61,145};

        int max = arr[0];
        int secondMax= -1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            } else if (arr[i]>secondMax && arr[i]!=max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Second greatest number in arrays : "+secondMax);
    }
}
