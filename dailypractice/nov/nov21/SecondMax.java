package dailypractice.nov.nov21;

public class SecondMax {
    public static void main(String[] args) {

        int[] arr = {5, 9, 2, 11, 3, 7};
        System.out.println(findSecondMax(arr));
    }

    public static int findSecondMax(int[] arr){
        int max= Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int num:arr){
            if(num>max){
                secondMax=max;
                max=num;
            }else if(num>secondMax&&num!=max){
                secondMax=num;
            }

        }
        return secondMax;
    }
}
