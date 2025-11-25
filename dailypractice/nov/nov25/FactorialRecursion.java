package dailypractice.nov.nov25;

public class FactorialRecursion {
    public static void main(String[] args) {
        int num=5;
       int ans = factRecurse(num);
        System.out.println(ans);
    }

    static int factRecurse(int num){
        if(num==1)
            return 1;
        return (num%10) *factRecurse(num-1);
    }
}
