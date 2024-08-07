package corejava.aug06;

public class CountDigit {
    public static void main(String[] args) {
        int num=123;
        int count=0;
        while(num>=1){
            count=count+1;
            num=num/10;
        }
        System.out.println(count);

    }
}
