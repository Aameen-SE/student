package corejava.aug06;

public class ReverseNum {
    public static void main(String[] args) {
        int num =12345;
        int rev=0;
        for(;num>=1;num=num/10){
            int ld=num%10;
            rev=rev*10+ld;
        }
        System.out.println(rev);
    }
}
