package dailypractice.oct.oct22;

public class SumAvgOfElement {

    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5};
    long avg ;
        int sum =0;

        for(int a:arr){
            sum=sum+a;
        }
        System.out.println("Sum of the array element is : "+sum);

        avg = sum/arr.length;
        System.out.println("Average of the element :"+avg);
    }
}
