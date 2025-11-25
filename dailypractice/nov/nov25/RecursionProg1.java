package dailypractice.nov.nov25;

public class RecursionProg1 {
    public static void main(String[] args) {
        int num=5;
        fun(num);
    }

    public static void fun(int num){
        if(num==0){
            return ;
        }
        System.out.println(num);
        fun(num-1);
        System.out.println(num);
    }
}
