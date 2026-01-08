package practice2026.array;

public class CountPrimeNumberInArray {

    public static void main(String[] args) {

        int[] arr = {100, 19, 2, 7, 50};
        int count =0;

        for (int n:arr){
            if (isPrime(n)) {
                count++;
            }
        }
        System.out.println("Count : "+count);
    }

    public static boolean isPrime(int n){
        if(n==1)
            return false;
        else {
            for (int i=2;i*i<n;i++){
                if(n%i==0)
                    return false;
            }
        }
        return true;
    }
}
