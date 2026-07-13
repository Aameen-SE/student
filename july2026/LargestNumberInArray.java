package july2026;

public class LargestNumberInArray {

    public static void main(String[] args) {

        int[] arr ={1,2,34,55,67,89,12};

        int max=0;
        for(int a:arr){
            if(max<a)
                max=a;
        }
        System.out.println("Largest Number in Arrays is : "+max);
    }
}
